package Week3Assignment;


public class InternetPlan {
    protected String name;
    protected double price;
    protected double speed;
    protected int validity;
    protected PlanType type;

    public InternetPlan(String name, double price, double speed, int validity, PlanType type){
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.validity = validity;
        this.type = type;
    }
    public String getPlan(){
        return switch (type){
            case TWO_G -> "2G";
            case THREE_G -> "3G";
            case FOUR_G -> "4G";
            case FIVE_G -> "5G";
        };

    }
    @Override
    public String toString(){
        String plan = this.getPlan();
        String res = "%s | MRP: %.2f | %.2f MBPS | %d days | %s";
        return String.format(res, this.name, this.price, this.speed, this.validity, plan);
    }

    public double getPrice() {
        return price;
    }

}
