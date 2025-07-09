package Week1Assignment.Plans;

import Week1Assignment.Enum.PlanType;
import Week1Assignment.Modals.Plan;

public class Silver  extends Plan {
    public Silver(){
        super(PlanType.Silver);
    }
    @Override
    public void planBenefits(){
        System.out.println("these are hte child class Silver plan benefits");
    }

}
