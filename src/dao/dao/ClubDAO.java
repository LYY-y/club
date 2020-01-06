package dao.dao;


import dao.dai.IBaseDAO;
import entity.BookModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClubDAO implements IBaseDAO {
    @Override
    public boolean create(BookModel book) throws DAOException{
        boolean flag = false;
        String sql = "insert into book values (?,?,?,?,?,?,?,?) ";

        //try语句的功能——它允许在try关键字后跟一对圆括号，圆括号可以声明，初始化一个或多个资源，
        // 此处的资源指得是那些必须在程序结束时必须关闭的资源（比如数据库连接，网络连接等），
        // try语句在该语句结束时自动关闭这些资源。这种称为try-with-resources语句。

        try (Connection conn = getConnecton();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, book.getISBN());
            pstmt.setString(2, book.getBook_name());
            pstmt.setString(3, book.getBook_author());
            pstmt.setString(4, book.getBook_press());
            pstmt.setInt(5, book.getPublic_year());
            pstmt.setDouble(6, book.getBook_price());
            pstmt.setInt(7, book.getBook_storage());
            pstmt.setString(8, book.getBook_type());
            int row = pstmt.executeUpdate();
            if(row > 0){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean delete(String isbn) throws DAOException {
        boolean flag = false;

        String sql = "DELETE FROM book WHERE ISBN = ?";

        try (Connection conn = getConnecton();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1,isbn);
            int row = pstmt.executeUpdate();
            System.out.println(row);
            if(row != 0){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean update(BookModel book) throws DAOException{
        boolean flag = false;

        String sql = "update book set ISBN = ?, book_name = ?, book_author = ?, book_press = ?, " +
                "public_year = ?, book_price = ?, book_storage = ?, book_type = ? where ISBN = ?";
        try (Connection conn = getConnecton();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, book.getISBN());
            pstmt.setString(2, book.getBook_name());
            pstmt.setString(3, book.getBook_author());
            pstmt.setString(4, book.getBook_press());
            pstmt.setInt(5, book.getPublic_year());
            pstmt.setDouble(6, book.getBook_price());
            pstmt.setInt(7, book.getBook_storage());
            pstmt.setString(8, book.getBook_type());
            pstmt.setString(9, book.getISBN());
            int row = pstmt.executeUpdate();
            if(row > 0){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<BookModel> findAll() throws DAOException{
        ResultSet rs = null;
        BookModel bm = null;
        List<BookModel> list = new ArrayList<>();
        String sql = "select * from book";
        try (Connection conn = getConnecton();
             Statement stmt =conn.createStatement();)
        {
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                bm = new BookModel();
                bm.setISBN(rs.getString("ISBN"));
                bm.setBook_name(rs.getString("book_name"));
                bm.setBook_author(rs.getString("book_author"));
                bm.setBook_press(rs.getString("book_press"));
                bm.setPublic_year(rs.getInt("public_year"));
                bm.setBook_price(rs.getDouble("book_price"));
                bm.setBook_storage(rs.getInt("book_storage"));
                bm.setBook_type(rs.getString("book_type"));
                list.add(bm);
            }
        }catch(SQLException e){
              e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<BookModel> findSome(String name) throws DAOException{
        BookModel bm = null;
        List<BookModel> list = new ArrayList<>();
        String sql = "select * from book where book_name like ?";
        try (Connection conn = getConnecton();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, "%"+name+"%");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                bm = new BookModel();
                bm.setISBN(rs.getString("ISBN"));
                bm.setBook_name(rs.getString("book_name"));
                bm.setBook_author(rs.getString("book_author"));
                bm.setBook_press(rs.getString("book_press"));
                bm.setPublic_year(rs.getInt("public_year"));
                bm.setBook_price(rs.getDouble("book_price"));
                bm.setBook_storage(rs.getInt("book_storage"));
                bm.setBook_type(rs.getString("book_type"));
                list.add(bm);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<BookModel> find(String ISBN) throws DAOException{
        BookModel bm = null;
        List<BookModel> list = new ArrayList<>();
        String sql = "select* from book where ISBN = ?";
        try (Connection conn = getConnecton();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, ISBN);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                bm = new BookModel();
                bm.setISBN(rs.getString("ISBN"));
                bm.setBook_name(rs.getString("book_name"));
                bm.setBook_author(rs.getString("book_author"));
                bm.setBook_press(rs.getString("book_press"));
                bm.setPublic_year(rs.getInt("public_year"));
                bm.setBook_price(rs.getDouble("book_price"));
                bm.setBook_storage(rs.getInt("book_storage"));
                bm.setBook_type(rs.getString("book_type"));
                list.add(bm);
            }else {
                System.out.println("查询单个商品失败！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean readerlogin(String reader_no, String reader_name, String reader_password) throws DAOException{
        String sql = "select reader_no ,reader_name, reader_password from reader where reader_no = ?";
        ResultSet rs =null;
        boolean flag = false;
        try (Connection conn = getConnecton();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1,reader_no);
            rs = pstmt.executeQuery();
            if(rs.next() && reader_name.equals(rs.getString("reader_name"))&& reader_password.equals(rs.getString("reader_password"))){
                flag = true;
            }else {
                flag =  false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean adminlogin(String ad_no, String ad_name, String ad_password) throws DAOException{
        String sql = "select ad_no , ad_name, ad_password from admin where ad_no = ?";
        ResultSet rs =null;
        boolean flag = false;
        try (Connection conn = getConnecton();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {;
            pstmt.setString(1,ad_no);
            rs = pstmt.executeQuery();
            if(rs.next() && ad_name.equals(rs.getString("name"))&& ad_password.equals(rs.getString("password"))){
                flag = true;
            }else {
                flag =  false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

}

