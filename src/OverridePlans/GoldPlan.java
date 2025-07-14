package OverridePlans;

public class GoldPlan extends BasePlan {

    GoldPlan(){
        super("Gold Plan");
    }

    @Override
    protected void showBenefits() {
        System.out.println("Free food and more leaves");
    }
}
