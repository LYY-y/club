package dao.dai;

import dao.dao.DAOException;
import entity.BookModel;

import java.util.List;
//继承DAOdb接口
public interface IBaseDAO extends DAOdb{
    //添加图书记录
    boolean create(BookModel book) throws DAOException;
    //删除图书记录
    boolean delete(String isbn) throws DAOException;
    //修改图书记录
    boolean update(BookModel book) throws DAOException;
    //查询图书馆内所有书籍
    List<BookModel> findAll() throws DAOException;
    //按书名模糊查询
    List<BookModel> findSome(String name) throws DAOException;
    //按ISBN精确查询
    List<BookModel> find(String name) throws DAOException;


    //读者登录
    boolean readerlogin(String reader_no, String reader_name, String reader_password) throws DAOException;
    //读者登录
    boolean adminlogin(String ad_no, String ad_name, String ad_password) throws DAOException;
}
