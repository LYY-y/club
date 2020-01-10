package business.ebi;

import dao.dao.DAOException;
import entity.ActivityModel;

import java.util.List;

public interface BookEBI {
    //添加图书记录
    boolean create(ActivityModel ac) throws DAOException;

    //删除图书记录
    boolean delete(String ac_no) throws DAOException;

    //修改图书记录
    boolean update(ActivityModel ac) throws DAOException;

    //查询图书馆内所有书籍
    List<ActivityModel> findAll() throws DAOException;

    //按书名模糊查询
    List<ActivityModel> findSome(String name) throws DAOException;

    //按ISBN精确查询
    List<ActivityModel> find(String ac_no) throws DAOException;


    //读者登录
    boolean adminlogin(String ad_no, String ad_name, String ad_password) throws DAOException;
}
