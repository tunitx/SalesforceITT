package OverridePlans;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(new RegularPlan());
        User user2 = new User(new GoldPlan());

        user1.showDetails();
        user2.showDetails();
    }
}
