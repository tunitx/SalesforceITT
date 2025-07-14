package Week1Assignment.Modals;

import Week1Assignment.Enum.PlanType;

public class Plan {
    private PlanType planType;
    public Plan(PlanType planType){
        this.planType = planType;
    }

    public PlanType getPlanType() {
        return planType;
    }

    public void setPlanType(PlanType planType) {
        this.planType = planType;
    }

    public boolean planBenefits(){
        System.out.println("these are the Abstract class benefits, override them in the specific plan type child class");
        return false;
    }

}
