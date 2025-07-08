package OverridePlans;

// has a relationship w Plan
public class User {
    BasePlan plan;
    public User(BasePlan plan){
        this.plan = plan;
    }

    public void showDetails(){
        System.out.println("This is a "  + plan.getPlan());
        plan.showBenefits();
    }

}
