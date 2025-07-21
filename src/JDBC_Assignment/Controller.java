package JDBC_Assignment;


import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try{
            CustomerService service = new CustomerService();
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("1. Create\n2. Read\n3. Update\n4. Delete\n5. Exit");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        sc.nextLine();
                        System.out.print("Name: "); String name = sc.nextLine();
                        System.out.print("Email: "); String email = sc.nextLine();
                        System.out.print("City: "); String city = sc.nextLine();
                        System.out.print("State: "); String state = sc.nextLine();
                        System.out.print("Plan: "); String plan = sc.nextLine();
                        System.out.print("Cost: "); int cost = sc.nextInt();
                        Customer customer = new Customer(name, email,city,state,plan,cost);
                        service.createCustomer(customer);
                        break;
                    case 2:
                        service.readAllCustomers();
                        break;
                    case 3:
                        System.out.print("ID: "); int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("New Email: "); String newEmail = sc.nextLine();
                        service.updateCustomerEmail(id, newEmail);
                        break;
                    case 4:
                        System.out.print("ID to delete: "); int delId = sc.nextInt();
                        service.deleteCustomer(delId);
                        break;
                    case 5:
                        System.exit(0);
                }
            }
        }
        catch (SQLException | ClassNotFoundException  | InputMismatchException e ){
            System.out.println(e.getMessage());
            e.printStackTrace();
            DBConnection.getConnection().rollback();
        }
        finally {
            DBConnection.getConnection().close();
        }

    }
}
