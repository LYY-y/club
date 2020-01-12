import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class QueryDemo {
    public static void main(String[] args){
        Connection conn;
        Statement stmt;
        ResultSet rs;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bm?useSSL=true","root","3218004211lyy");
            stmt=conn.createStatement();
            String sql="SELECT * FROM book";
            rs=stmt.executeQuery(sql);

            while(rs.next()){
                String name=rs.getString(2);
                System.out.println(name);
            }

            if(rs!=null){
                rs.close();
            }

            if (stmt!=null){
                stmt.close();
            }

            if(conn!=null){
                conn.close();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
