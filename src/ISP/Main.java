package ISP;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.connectNetwork();
        phone.disconnectNetwork();
        phone.changeNetwork(new Network3G());
        phone.connectNetwork();
        phone.disconnectNetwork();
        phone.networkInfo();
    }
}
