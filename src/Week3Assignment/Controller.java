package Week3Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;
import static Week3Assignment.Util.*;


public class Controller {
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
