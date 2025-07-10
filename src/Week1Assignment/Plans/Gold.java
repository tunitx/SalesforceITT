package Week1Assignment.Plans;

import Week1Assignment.Enum.PlanType;
import Week1Assignment.Modals.Plan;

public class Gold  extends Plan {
    public Gold(){
        super(PlanType.Gold);
    }
    @Override
    public boolean planBenefits(){
        System.out.println("these are hte child class gold plan benefits");
        return false;
    }

}
