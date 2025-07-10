package Week1Assignment;

import Week1Assignment.Enum.EmpCategory;
import Week1Assignment.ServiceManager.EmpManager;
import Week1Assignment.ServiceManager.UserManager;

import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmpManager empManager = new EmpManager();
        UserManager userManager = new UserManager();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add User");
            System.out.println("2. Add Employee");
            System.out.println("3. Delete User by ID");
            System.out.println("4. Delete Employee by ID");
            System.out.println("5. View All Users");
            System.out.println("6. View All Employees");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            String option = sc.nextLine();

            switch (option) {
                case "1" -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter plan (Gold/Silver/Bronze): ");
                    String plan = sc.nextLine();
                    userManager.addUser(name, email, plan);
                }
                case "2" -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    long phone = Long.parseLong(sc.nextLine());
                    System.out.print("Enter category (JSE/SSE/LEAD/INTERN): ");
                    String categoryInput = sc.nextLine().toUpperCase();

                    try {
                        EmpCategory category = EmpCategory.valueOf(categoryInput);
                        empManager.addEmployee(name, email, phone, category);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid category entered.");
                    }
                }
                case "3" -> {
                    System.out.print("Enter User ID to delete: ");
                    long id = Long.parseLong(sc.nextLine());
                    userManager.deleteUserbyId(id);
                }
                case "4" -> {
                    System.out.print("Enter Employee ID to delete: ");
                    long id = Long.parseLong(sc.nextLine());
                    empManager.deleteEmployeeByID(id);
                }
                case "5" -> userManager.displayUsers();
                case "6" -> empManager.displayEmployees();
                case "0" -> {
                    System.out.println("Exiting program...");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
}
