package Week3Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Controller {

    public static PlanType convertToEnum(String res){
        return switch (res.toUpperCase()){
            case "2G" -> PlanType.TWO_G;
            case "3G" -> PlanType.THREE_G;
            case "4G" -> PlanType.FOUR_G;
            case "5G" -> PlanType.FIVE_G;
            default -> PlanType.TWO_G;
        };
    }

    public static void  searchForPlans(Scanner sc)  {
        try{
            System.out.println("1. Search By price(<=)\n" + "2. Search by speed(>=)\n" + "3. Search by validity(==)\n" + "4. Search floor/ceil");
            int res = sc.nextInt();
            switch (res){
                case 1 -> {
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    PlanManager.searchByPrice(price);
                }
                case 2 -> {
                    System.out.print("Enter speed: ");
                    double speed = sc.nextDouble();
                    PlanManager.searchBySpeed(speed);
                }
                case 3 -> {
                    System.out.println("Enter validity: ");
                    int validity = sc.nextInt();
                    PlanManager.searchByValidity(validity);
                }
                case 4 -> {
                    System.out.println("Enter your price range: ");
                    double price = sc.nextDouble();
                    System.out.println("Plans you might be interested in : ");
                    PlanManager.getFloor(price);
                    PlanManager.getCeil(price);
                }
            }
        }
        catch (InputMismatchException | NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
    public static void addNewPlan(Scanner sc) {
        try{
            System.out.print("Enter Plan Name, price, speed, validity, and type, separated by a space: ");
            sc.nextLine();
            String [] res  = sc.nextLine().split(" ");
            PlanManager.addNewPlan(res[0], Double.parseDouble(res[1]), Double.parseDouble(res[2]), Integer.parseInt(res[3]), convertToEnum(res[4]));
            System.out.println("Plan added!");
        }
        catch (ArrayIndexOutOfBoundsException  | InputMismatchException  | NumberFormatException e){
            System.out.println(e.getMessage());
        }


    }

    public static void sortByPlans(Scanner sc) {
        try{
            System.out.println("1. Sort By price (ASC/DESC) \n" + "2. sort by speed\n" + "3. Sort by type");
            sc.nextLine();
            String [] res = sc.nextLine().split(" ");
            int query = Integer.parseInt(res[0]);
            switch (query){
                case 1 -> PlanManager.sortByPrice(res[1].equalsIgnoreCase("ASC"));
                case 2 -> PlanManager.sortBySpeed();
                case 3 -> PlanManager.sortByType();
            }
        }
        catch (ArrayIndexOutOfBoundsException | InputMismatchException | NumberFormatException e ){
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args)  {
        try{
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("1. Add New Plan \n" + "2. Display All plans\n" + "3. Search Plans\n" + "4. Sort By?");
                int res = sc.nextInt();
                switch (res){
                    case 1 -> addNewPlan(sc);
                    case 2 -> PlanManager.displayPlans();
                    case 3 -> searchForPlans(sc);
                    case 4 -> sortByPlans(sc);
                    default -> System.out.println("Invalid Input");
                }
            }
        }
        catch (InputMismatchException |  NumberFormatException | NullPointerException e ) {
            System.out.println(e.getMessage());
        }
    }
}
