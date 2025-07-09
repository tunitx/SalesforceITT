package Week1Assignment;

import Week1Assignment.Enum.EmpCategory;
import Week1Assignment.ServiceManager.EmpManager;

public class MainController {

    public static void main(String[] args) {
        EmpManager empManager = new EmpManager();
        empManager.addEmployee("tanish", "imta819@gmail.com",6367220, EmpCategory.JSE );

        empManager.addEmployee("tanish22", "imta819@gmail.com",6367220, EmpCategory.SSE );

        empManager.addEmployee("tanishw222", "imta819@gmail.com",6367220, EmpCategory.SSE );

        empManager.deleteEmployeeByID(821270929);
        empManager.displayEmployees();




    }
}
