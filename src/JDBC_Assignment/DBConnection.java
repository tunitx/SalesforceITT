package JDBC_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection conn = null;
    private static final String url = "jdbc:mysql://localhost:3307/startersql";
    private static final String username = "root";
    private static final String password = "test@12345";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        if(conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(url, username,password);
        }
        return conn;
    }
}
