package Week3Assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanManager  {
    protected static List<InternetPlan> plans = null;
    static {
             plans = new ArrayList<>();
            plans.add(new InternetPlan("Basic", 199, 20, 28, PlanType.FOUR_G));
            plans.add(new InternetPlan("Super Saver", 299, 50, 56, PlanType.FIVE_G));
            plans.add(new InternetPlan("Speedster", 399, 100, 28, PlanType.FOUR_G));
            plans.add(new InternetPlan("Unlimited", 499, 150, 84, PlanType.THREE_G));
            plans.add(new InternetPlan("Economy", 99, 10, 14, PlanType.FIVE_G));
            plans.add(new InternetPlan("Lite", 149, 5, 28, PlanType.TWO_G));
    }

    public static void addNewPlan(String name, double price, double speed, int validity,PlanType type){
        if(plans == null)
            plans = new ArrayList<>();
        plans.add(new InternetPlan(name,price, speed, validity,type));
    }

    // filter functions
    public static void searchByPrice(double price){
       plans.stream()
               .filter(p-> p.price <= price)
               .forEach(System.out::println);
    }
    public static void searchBySpeed(double speed){
        plans.stream()
                .filter(p -> p.speed >= speed)
                .forEach(System.out::println);
    }

    public static void searchByValidity(int validity){
        plans.stream()
                .filter(p -> p.validity == validity)
                .forEach(System.out::println);
    }

    // sort functions
    public static void sortByPrice(boolean comp){
        plans.stream()
                .sorted((a,b)-> comp ? Double.compare(a.price,b.price) : Double.compare(b.price,a.price))
                .forEach(System.out::println);
    }
    public static void sortBySpeed(){
        plans.stream()
                .sorted(Comparator.comparingDouble(p-> p.speed))
                .forEach(System.out::println);
    }

    public static void sortByType(){
        List<PlanType> type = List.of(PlanType.TWO_G, PlanType.THREE_G, PlanType.FOUR_G, PlanType.FIVE_G);
        plans.stream()
                .sorted(Comparator.comparing(p -> type.indexOf(p.type)))
                .forEach(System.out::println);       
    }
    
    public static void displayPlans(){
        plans.forEach(System.out::println);
    }
    
    
}
