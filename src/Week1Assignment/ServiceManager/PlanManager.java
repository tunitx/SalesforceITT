package Week1Assignment.ServiceManager;

import Week1Assignment.Enum.PlanType;
import Week1Assignment.Modals.Plan;
import Week1Assignment.Plans.Bronze;
import Week1Assignment.Plans.Gold;
import Week1Assignment.Plans.Silver;

public class PlanManager {

    public Plan createPlan(PlanType planType){
        if(planType == PlanType.Gold){
            return new Gold();
        }
        else if(planType == PlanType.Silver){
            return new Silver();
        }
        return new Bronze();
    }
}
