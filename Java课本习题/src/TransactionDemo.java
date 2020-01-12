import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;
public class TransactionDemo {
    public static void main(String[] args){
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        String insertSql1="INSERT INTO book VALUES ('1','数据结构','李春','清华大学出版社',39.5)";
        String insertSql2="INSERT INTO book VALUES('2','数据库基础与实践','杨洋','清华大学出版社',48.0)";
        String insertSql3="INSERT INTO book VALUES('3','设计模式之禅','秦小波','机械工业出版社',89.0)";
        String selectSql="SELECT * FROM book";
        boolean ynRollback=true;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:33.6/bm?yseSSL=ture","root","3218004211lyy");
            boolean autoCommit=conn.getAutoCommit();
            stmt=conn.createStatement();
            conn.setAutoCommit(false);
            stmt.executeUpdate(insertSql1);
            Savepoint s1=conn.setSavepoint();
            stmt.executeUpdate(insertSql2);
            stmt.executeUpdate(insertSql3);

            if (ynRollback){
                conn.rollback(s1);
            }
            conn.commit();
            conn.setAutoCommit(autoCommit);
            rs=stmt.executeQuery(selectSql);
            while(rs.next()){
                System.out.println(rs.getString("bookName")+" "+rs.getString("author")+" "+rs.getDouble("price"));
            }

            if(rs!=null){
                rs.close();
            }
            if (stmt!=null){
                stmt.close();
            }
            if (conn!=null){
                conn.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
