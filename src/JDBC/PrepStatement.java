package JDBC;

import java.sql.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PrepStatement {

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
            java.sql.Statement statement = connection.createStatement();
            // crud using prepared statement
            int [] ids = {11, 27, 25};
            String placeHolders = Arrays.stream(ids).mapToObj(i -> "?").collect(Collectors.joining(", "));
            String query = "select * from users where id in (" + placeHolders + ")" ;
            String query2 = "update  users set salary = salary - ? where id in (" + placeHolders + ")";
            String query3 = "insert into users (name, email, gender, date_of_birth, salary) values " +
                    "(?, ? ,? , ?, ?)";
            String query4 = "delete from users where id = ?";
            PreparedStatement ps1 = connection.prepareStatement(query);
            PreparedStatement ps2 = connection.prepareStatement(query2);
            PreparedStatement ps3 = connection.prepareStatement(query3);
            PreparedStatement ps4 = connection.prepareStatement(query4);

            ps2.setInt(1, 10000);
            for (int i = 0; i < ids.length; i++) {
                ps1.setInt(i + 1, ids[i]);
                ps2.setInt(i+2, ids[i]);
            }
            ps3.setString(1, "Augustya" );
            ps3.setString(2, "aug@itt.com");
            ps3.setString(3, "Female");
            ps3.setString(4, "2003-8-19");
            ps3.setInt(5, 40000);

            ps4.setInt(1, 14);
            ps4.addBatch();
            ps4.setInt(1, 17);
            ps4.addBatch();

            connection.setAutoCommit(false);
            try{
                ResultSet res = ps1.executeQuery();
                ps2.executeUpdate();
                ps3.executeUpdate();
                ps4.executeBatch();
                connection.commit();
                while(res.next()){
                    System.out.println(res.getInt("id") + res.getString("name") + res.getString("gender"));

                }
                connection.commit();
            }
            catch (SQLException e){
                connection.rollback();
                System.out.println(e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }
}

