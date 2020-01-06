//package common;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class DBConnection {
//    public Connection getConn(){
//        Connection conn = null;
//        String url = "jdbc:mysql://localhost:3306/library?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//        String user = "root";
//        String password = "3218004211lyy";
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//                conn = DriverManager.getConnection(url,user,password);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return conn;
//    }
//}
