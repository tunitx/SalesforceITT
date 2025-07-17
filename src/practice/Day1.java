package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day1 {
    public static void main(String[] args) {
        Set<String> plans = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the following commands accordingly, separate your plan with a space");
        while(true){

            System.out.println("\"Add\" to add a new plan");
            System.out.println("\"Remove\" to remove a plan");
            System.out.println("\"Check\" to check if a plan exist");
            System.out.println("\"Size\" to find the number of plans");
            System.out.println("\"ShowAll\" to show all plans");
            System.out.println("\"exit\" to quit");

            String input = sc.nextLine();
            String [] inputTokens = input.split(" ",2);
            if(inputTokens[0].equalsIgnoreCase("exit")) break;
            switch (inputTokens[0].toLowerCase()){
                case "add" :
                    System.out.println(plans.add(inputTokens[1]) ? "Plan Added!" : "Plan already exists!");
                    break;
                case "remove" :
                    System.out.println(plans.remove(inputTokens[1]) ? "Plan removed" : "Plan doesn't exists!");
                    break;

                case "check" :
                    System.out.println(plans.contains(inputTokens[1]) ? "Yes" : "No");
                    break;

                case "size" :
                    System.out.println("Number of plans : " + plans.size());
                    break;
                case "showall" :
                    plans.forEach(System.out::println);
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }
}
