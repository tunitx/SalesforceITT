package Week1Assignment.Modals;

import Week1Assignment.Enum.EmpCategory;

public class Employee {
    private String name;
    private int id;
    private int phone;
    private String email;
    private EmpCategory empCategory;

   public  Employee (String name, String email, EmpCategory empCategory, int phone){
       this.email = email;
       this.empCategory = empCategory;
       this.name = name;
       this.phone = phone;

   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
