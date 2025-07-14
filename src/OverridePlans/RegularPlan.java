package OverridePlans;

public class RegularPlan extends BasePlan{

    RegularPlan(){
        super("Regular Plan");
    }
    @Override
    protected void showBenefits() {
        System.out.println("No extra privileges. Better luck next time!");
    }
}
