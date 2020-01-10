package dao.dao;


import dao.dai.IBaseDAO;
import entity.ActivityModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClubDAO implements IBaseDAO {
    @Override
    public boolean create(ActivityModel ac) throws DAOException{
        boolean flag = false;
        String sql = "insert into activity values (?,?,?,?,?) ";

        //try语句的功能——它允许在try关键字后跟一对圆括号，圆括号可以声明，初始化一个或多个资源，
        // 此处的资源指得是那些必须在程序结束时必须关闭的资源（比如数据库连接，网络连接等），
        // try语句在该语句结束时自动关闭这些资源。这种称为try-with-resources语句。

        try (Connection conn = getConnecton();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, ac.getAc_no());
            pstmt.setString(2, ac.getAc_name());
            pstmt.setString(3, ac.getAc_time());
            pstmt.setString(4, ac.getAc_type());
            pstmt.setString(5, ac.getAc_detail());
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
    public boolean delete(String ac_no) throws DAOException {
        boolean flag = false;

        String sql = "DELETE FROM activity WHERE ac_no = ?";

        try (Connection conn = getConnecton();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1,ac_no);
            int row = pstmt.executeUpdate();
            if(row != 0){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean update(ActivityModel ac) throws DAOException{
        boolean flag = false;

        String sql = "update activity set ac_no = ?, ac_name = ?, ac_time = ?, ac_type = ?, " +
                "ac_detail = ? where ac_no = ?";
        try (Connection conn = getConnecton();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, ac.getAc_no());
            pstmt.setString(2, ac.getAc_name());
            pstmt.setString(3, ac.getAc_time());
            pstmt.setString(4, ac.getAc_type());
            pstmt.setString(5, ac.getAc_detail());
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
    public List<ActivityModel> findAll() throws DAOException{
        ResultSet rs = null;
        ActivityModel ac = null;
        List<ActivityModel> list = new ArrayList<>();
        String sql = "select * from activity";
        try (Connection conn = getConnecton();
             Statement stmt =conn.createStatement();)
        {
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                ac = new ActivityModel();
                ac.setAc_no(rs.getString("ac_no"));
                ac.setAc_name(rs.getString("ac_name"));
                ac.setAc_time(rs.getString("ac_time"));
                ac.setAc_type(rs.getString("ac_type"));
                ac.setAc_detail(rs.getString("ac_detail"));
                list.add(ac);
            }
        }catch(SQLException e){
              e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ActivityModel> findSome(String name) throws DAOException{
        ActivityModel ac = null;
        List<ActivityModel> list = new ArrayList<>();
        String sql = "select * from activity where ac_name like ?";
        try (Connection conn = getConnecton();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, "%"+name+"%");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                ac = new ActivityModel();
                ac.setAc_no(rs.getString("ac_no"));
                ac.setAc_name(rs.getString("ac_name"));
                ac.setAc_time(rs.getString("ac_time"));
                ac.setAc_type(rs.getString("ac_type"));
                ac.setAc_detail(rs.getString("ac_detail"));
                list.add(ac);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ActivityModel> find(String ac_no) throws DAOException{
        ActivityModel ac = null;
        List<ActivityModel> list = new ArrayList<>();
        String sql = "select* from activity where ac_no = ?";
        try (Connection conn = getConnecton();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, ac_no);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                ac = new ActivityModel();
                ac.setAc_no(rs.getString("ac_no"));
                ac.setAc_name(rs.getString("ac_name"));
                ac.setAc_time(rs.getString("ac_time"));
                ac.setAc_type(rs.getString("ac_type"));
                ac.setAc_detail(rs.getString("ac_detail"));
                list.add(ac);
            }else {
                System.out.println("查询单个商品失败！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean adminlogin(String ad_no, String ad_name, String ad_password) throws DAOException{
        String sql = "select no , name, password from login where no = ?";
        ResultSet rs =null;
        boolean flag = false;
        try (Connection conn = getConnecton();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {;
            pstmt.setString(1, ad_no);
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

