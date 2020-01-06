package dao.dai;

import dao.dao.DAOException;
import entity.BookModel;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//所有结构的根接口，定义了默认方法建立到数据库的连接
public interface DAOdb {
    //查找并返回数据源
    public static DataSource getDataSource(){
        DataSource dataSource = null;
        try {
            //获得操作名字服务的方法,所有的名字服务都关联到一个Context，通过InitialContext可以获得一个Context实例
            Context context = new InitialContext();
            //查找数据源
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/library");
        } catch (NamingException ne) {
            System.out.println("Exception:"+ ne);
        }
        return dataSource;
    }
    //获取连接对象
    public default Connection getConnecton() throws DAOException {
       Connection connection = null;
       DataSource dataSource = getDataSource();
        try {
            connection = dataSource.getConnection();
        } catch (SQLException se) {
            System.out.println("Exception:"+se);
        }
        return connection;
    }

}
