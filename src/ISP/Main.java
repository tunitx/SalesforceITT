package ISP;

import ISP.Exceptions.ConnectionException;
import ISP.Exceptions.SpeedLimitException;

public class Main {
    public static void main(String[] args) throws ConnectionException {
        Phone phone = new Phone();
        try{
            phone.connectNetwork();
            phone.disconnectNetwork();
            phone.changeNetwork(new Network3G());
            phone.connectNetwork();
            phone.disconnectNetwork();
            phone.networkInfo();
        }
        catch (ConnectionException | SpeedLimitException e){
            System.out.println("Exception caught");
            System.out.println(e.getMessage());
            throw e;
        }

    }
}
