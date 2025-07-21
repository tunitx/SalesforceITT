package JDBC;

import java.sql.*;

public class SimpStatement {

    // here goes the jdbc connection url for sql, and its username and password
    private static final String url = "jdbc:mysql://localhost:3307/startersql";
    private static final String username = "root";
    private static final String password = "test@12345";

    public static void main(String[] args) {
        try{
            // this tells jvm to load the class com.mysql....  from the classpath (driver which i added)
            // next this internally calls a static block of code which registers this driver with the driverManager
            // so when we now call any thing on the made connection the manager knows which driver to use
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            // prepares a connection
            Connection connection = DriverManager.getConnection(url, username,password);
            Statement statement = connection.createStatement();

//             crud using statement
            String query = "select * from users";
            String query2 = String.format("select * from users where id in (%d, %d, %d) or name in ('%s', '%s', '%s')", 6, 8 ,9, "Tanish", "Tushar", "Harsh");
            String query3 = String.format("delete from users where id = %d or name = '%s'", 23, "Meera");
            String query4 = String.format("insert into users (name, email, gender, date_of_birth, salary) values ('%s', '%s', '%s', '%s', %d)", "tanish", "imta819@gmail.com", "Male", "1999-1-1", 9999);
//             compiles everytime in sql, slower, static
            ResultSet res = statement.executeQuery(query2);
            int res2 = statement.executeUpdate(query4);
            while(res.next()){
                System.out.println(res.getInt("id") + res.getString("name") + res.getString("gender"));
            }
            System.out.println(res2);


        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }
}
