package Week1Assignment.ServiceManager;

import Week1Assignment.Enum.EmpCategory;
import Week1Assignment.Modals.Employee;

import java.util.ArrayList;

public class EmpManager {
    private ArrayList<Employee> Employees;

    public EmpManager(){
        Employees = new ArrayList<>();
    }
    public Employee createEmployee(String name, String email, int phone, EmpCategory empCategory){
        // add logic later to make the ids unique
        return new Employee(name, email, EmpCategory.JSE,phone);
    }

    public int uniqueId(Employee emp) {
        return emp.hashCode();
    }

    public void addEmployee(String name, String email, int phone, EmpCategory empCategory){
        Employee employee = createEmployee(name, email,phone, empCategory);
        employee.setId(uniqueId(employee));
        Employees.add(employee);
    }
    public Employee getEmployeeByID(int id){
        for(Employee emp : Employees){
            if(emp.getId() == id) return emp;
        }
        return null;
    }
    public int deleteEmployeeByID(int id){
        for(Employee emp : Employees){
            if(emp.getId() == id){
                Employees.remove(emp);
                return 1;
            }
        }
        return 0;
    }
    public void displayEmployees(){
        for(Employee emp : Employees){
            System.out.println("Name : " + emp.getName());
            System.out.println("EMP_ID : " + emp.getId());
        }
    }
}
