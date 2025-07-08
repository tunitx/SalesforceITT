package ISP;

public class Network3G implements Network {
    final Speed speed = new Speed("3G", 5, 1);
    @Override
    public void connect() {
        System.out.println("Connecting....");
        try {
            Thread.sleep(3000); // 3 seconds
            System.out.println("Phone connected to 3G!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting....");
        try {
            Thread.sleep(2000);
            System.out.println("2G network disconnected!");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void info(){
        System.out.println("Network type: " + speed.type);
        System.out.println("Network speed: " + speed.lowerbound  + " - " + speed.upperbound + "MB per sec.");
    }

}
