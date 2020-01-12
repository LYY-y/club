import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class StatementDemo {
    public static void main(String[] args){
        Connection conn;
        Statement stmt;
        ResultSet rs;
        String selectSql="SELECT * FROM book";
        String insertSql="INSERT INTO book VALUES(4,'Java程序设计基础','陈国君','清华大学出版社',49.0)";
        String updateSql="UPDATE book SET price=50.0 WHERE bookid=4";
        String deleteSql="DELETE FROM book WHERE bookid=4";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bm?useSSL=true","root","3218004211lyy");
            stmt=conn.createStatement();

            int count=stmt.executeUpdate(insertSql);
            System.out.println("添加"+count+"条记录");

            rs=stmt.executeQuery(selectSql);
            if (rs.next()){
                System.out.println(rs.getString("bookName")+" "+rs.getString("author")+" "+rs.getDouble("price"));
            }

            count=stmt.executeUpdate(updateSql);
            System.out.println("修改"+count+"条记录");

            rs=stmt.executeQuery(selectSql);
            if (rs.next()){
                System.out.println(rs.getString("bookName")+" "+rs.getString("author")+" "+rs.getDouble("price"));
            }

            count=stmt.executeUpdate(deleteSql);
            System.out.println("删除"+count+"条记录");

            rs=stmt.executeQuery(selectSql);
            if (rs.next()){
                System.out.println(rs.getString("bookName")+" "+rs.getString("author")+" "+rs.getDouble("price"));
            }else {
                System.out.println("没有查询到数据");
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
