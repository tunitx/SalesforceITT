package salesforceTraining;

import java.util.Scanner;

class User {
    String name;
    String plan;
    float price;

    public boolean calculatePrice() {
        if (plan.equalsIgnoreCase("Normal")) {
            price -= 0.05f * price;
        } else if (plan.equalsIgnoreCase("Premium")) {
            price -= 0.20f * price;
        } else {
            return false;
        }
        return true;
    }

    User(String name, String plan, float price) {
        this.name = name;
        this.plan = plan;
        this.price = price;
    }
}

public class Day1q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of users: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your name: ");
            String name = scanner.next();
            System.out.print("Enter your plan: ");
            String plan = scanner.next();
            System.out.print("Enter your price: ");
            float price = scanner.nextFloat();

            User user = new User(name, plan, price);

            if (!user.calculatePrice()) {
                System.out.println("Invalid plan type. Skipping user.\n");
                continue;
            }

            System.out.println("The discounted price for " + user.name + " is: " + user.price + "\n");
        }

        scanner.close();
    }
}
