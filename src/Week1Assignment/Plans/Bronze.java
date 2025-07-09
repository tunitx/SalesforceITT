package Week1Assignment.Plans;

import Week1Assignment.Enum.PlanType;
import Week1Assignment.Modals.Plan;

public class Bronze  extends Plan {
    public Bronze(){
        super(PlanType.Bronze);
    }
    @Override
    public void planBenefits(){
        System.out.println("these are hte child class Bronze plan benefits");
    }

}
