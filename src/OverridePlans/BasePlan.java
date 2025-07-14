package OverridePlans;

public abstract class BasePlan {
    private String plan;
    BasePlan(String plan){
        this.plan = plan;
    }
    protected String getPlan(){
        return this.plan;
    }
    protected void greet(){
        System.out.println("hi");
    }

    protected abstract void showBenefits();
}
