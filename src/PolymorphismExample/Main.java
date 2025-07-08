package PolymorphismExample;
import java.util.Scanner;

enum NotificationType{
    SMS, EMAIL, INVALID
}

public class Main {
    public static Notification getNotifier(String message, String recipient, NotificationType type ){
        return switch (type){
            case SMS -> new SMSNotification(recipient, message);
            case EMAIL -> new EmailNotification(recipient, message);
            default -> null;
        };
    }

    private static NotificationType getUserInput(Scanner sc){
        System.out.println("Choose notification option ");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. Quit");
        System.out.print("Your choice: ");

        String input = sc.nextLine();
       return switch (input){
           case "1" -> NotificationType.EMAIL;
           case "2" -> NotificationType.SMS;
           case "3" -> null;
           default ->  NotificationType.INVALID;
       };

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            NotificationType type = getUserInput(sc);
            // quit
            if(type == null) break;
            else if(type == NotificationType.INVALID){
                System.out.println("Invalid option, try again!");
                continue;
            }
            String message;
            String recipient;
            System.out.print("Enter the recipient: ");
            recipient = sc.nextLine();
            System.out.print("Enter the message: ");
            message = sc.nextLine();

            Notification notification = getNotifier(message, recipient, type);
            notification.send();
        }
        System.out.println("Exiting Program...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }
}

