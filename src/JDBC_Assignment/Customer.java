package JDBC_Assignment;

public class Customer {
    private String name;
    private String email;

    private String city;
    private String state;

    private String plan;
    private double cost;


    public Customer(String name, String email, String city, String state, String plan, double cost){
        this.name = name;
        this.email = email;
        this.city = city;
        this.state = state;
        this.plan = plan;
        this.cost = cost;
    }

    public String getCity() {
        return city;
    }

    public double getCost() {
        return cost;
    }
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPlan() {
        return plan;
    }

    public String getState() {
        return state;
    }
}
