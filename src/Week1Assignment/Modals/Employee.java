package Week1Assignment.Modals;

import Week1Assignment.Enum.EmpCategory;

public class Employee {
    private String name;
    private Long id;
    private Long phone;
    private String email;
    private EmpCategory empCategory;

   public  Employee (String name, String email, EmpCategory empCategory, Long phone){
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

    public Long getPhone() {
        return phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
