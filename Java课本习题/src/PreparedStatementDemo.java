import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class PreparedStatementDemo {
    public static void main(String[] args){
        Connection conn;
        PreparedStatement ps;
        ResultSet rs;
        String selectSql="SELECT * FROM book";
        String inertSql="INSERT INTO book VALUES(?,?,?,?,?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bm?useSSL=true","root","3218004211lyy");
            ps=conn.prepareStatement(inertSql);
            ps.setInt(1,4);
            ps.setString(2,"Java程序设计基础");
            ps.setString(3,"陈国君");
            ps.setString(4,"清华大学出版社");
            ps.setDouble(5,49.0);
            int count=ps.executeUpdate();
            System.out.println("添加"+count+"条记录");
            rs=ps.executeQuery(selectSql);
            if (rs.next()){
                System.out.println(rs.getString("bookName")+" "+rs.getString("author")+" "+rs.getDouble("price"));
            }
            if(rs!=null){
                rs.close();
            }
            if (ps!=null){
                ps.close();
            }
            if (conn!=null){
                conn.close();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
