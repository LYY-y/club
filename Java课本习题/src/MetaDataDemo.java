import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class MetaDataDemo {
    public static void main(String[] args){
        Connection conn;
        Statement stmt;
        ResultSet rs;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bm?useSSL=ture","root","3218004211lyy");
            DatabaseMetaData dmd=conn.getMetaData();
            System.out.println("数据库产品："+dmd.getDatabaseProductName());
            System.out.println("数据库版本："+dmd.getDatabaseProductVersion());
            System.out.println("驱动器："+dmd.getDriverName());
            System.out.println("数据库URL："+dmd.getURL());
            stmt=conn.createStatement();
            rs=stmt.executeQuery("SELECT * FROM book");
            ResultSetMetaData rsmd=rs.getMetaData();
            System.out.println("总共有："+rsmd.getColumnCount()+"列");

            for (int i=1; i<rsmd.getColumnCount(); i++){
                System.out.println("列"+i+"："+rsmd.getColumnName(i)+"，"+rsmd.getColumnTypeName(i)+"（"+rsmd.getColumnDisplaySize(i)+"）");
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

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
