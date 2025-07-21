package JDBC_Assignment;

import java.sql.*;

public class CustomerService {
    private Connection conn;

    public CustomerService() throws SQLException, ClassNotFoundException {
        conn = DBConnection.getConnection();
        conn.setAutoCommit(false);
    }

    public void createCustomer(Customer customer) throws SQLException{
        String insertCustomer = "insert into customer (name, email) values (?, ?)";
        String insertAddress = "insert into address (customer_id, city, state) values (?,?,?)";
        String insertPlan = "insert into plan (customer_id, plan_name,cost) values (?,?,?)";

        PreparedStatement ps = conn.prepareStatement(insertCustomer, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, customer.getName());
        ps.setString(2, customer.getEmail());

        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next()){
            int customer_id = rs.getInt(1);
            System.out.println(customer_id);
            PreparedStatement ps2 = conn.prepareStatement(insertAddress);
            ps2.setInt(1, customer_id);
            ps2.setString(2, customer.getCity());
            ps2.setString(3, customer.getState());
            ps2.executeUpdate();

            PreparedStatement ps3 = conn.prepareStatement(insertPlan);
            ps3.setInt(1, customer_id);
            ps3.setString(2, customer.getPlan());
            ps3.setDouble(3, customer.getCost());
            ps3.executeUpdate();

            System.out.println("Customer created with customer id : " + customer_id);
            conn.commit();
            ps2.close();
        }
    }

    public void readAllCustomers() throws SQLException {
        String query = "select c.id, c.name, c.email, a.city, a.state, p.plan_name, p.cost from customer c " +
                "right join address a on a.customer_id = c.id " +
                "right join plan p on p.customer_id = c.id";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id") +
                    ", Name: " + rs.getString("name") +
                    ", Email: " + rs.getString("email") +
                    ", City: " + rs.getString("city") +
                    ", State: " + rs.getString("state") +
                    ", Plan: " + rs.getString("plan_name") +
                    ", Cost: " + rs.getDouble("cost"));
        }
        stmt.close();
    }
    public void updateCustomerEmail(int id, String newEmail) throws SQLException {
        String query = "UPDATE Customer SET email = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, newEmail);
        ps.setInt(2, id);
       int res =  ps.executeUpdate();
        if(res == 0) System.out.println("No such ID!");
        else System.out.println("Customer email updated.");
        conn.commit();
        ps.close();
    }

    public void deleteCustomer(int id) throws SQLException {
        String query = "DELETE FROM Customer WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, id);
        int res = ps.executeUpdate();
        if(res == 0) System.out.println("No such ID!");
        else System.out.println("Customer deleted.");
        conn.commit();
        ps.close();
    }

}
