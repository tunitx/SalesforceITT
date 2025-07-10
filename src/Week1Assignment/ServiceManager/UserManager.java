package Week1Assignment.ServiceManager;
import Week1Assignment.Modals.Plan;
import Week1Assignment.Modals.User;
import Week1Assignment.Plans.Bronze;
import Week1Assignment.Plans.Gold;
import Week1Assignment.Plans.Silver;


import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> Users;

    public UserManager() {
        Users = new ArrayList<>();
    }

    public User createUser(String name, String email, Plan plan){
        return new User(name, plan,email);
    }

   public long uniqueId(User user){
        return user.hashCode();
   }



    public void addUser(String name, String email, String plan) {
        Plan newPlan;
        switch (plan.toLowerCase()) {
            case "gold" -> newPlan = new Gold();
            case "silver" -> newPlan = new Silver();
            case "bronze" -> newPlan = new Bronze();
            default -> {
                System.out.println("Invalid plan entered.");
                newPlan = null;
            }
        }
        User user = createUser(name, email, newPlan);
        user.setId(uniqueId(user));

        Users.add(user);
    }
    public User getUserById(long id){
        for(User user : Users){
            if(user.id == id) return user;
        }
        System.out.println("NO SUCH USER AVAILABLE");
        return null;
    }
    public int deleteUserbyId(long id){
        for(User user : Users){
            if(user.id == id){
                Users.remove(user);
                return 1;
            }
        }
        System.out.println("NO SUCH USER AVAILABLE");
        return 0;
    }
    public void displayUsers(){
        if(Users.isEmpty()) {
            System.out.println("NO USERS AVAILABLE");
            return;
        }
        for(User user : Users){
            System.out.println("Name : " + user.getName());
            System.out.println("USER_ID : " + user.getId());
            System.out.println("Email : "+ user.getEmail());
            user.getSelectedPlan().planBenefits();
        }
    }
}
