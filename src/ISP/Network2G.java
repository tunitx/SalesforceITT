package ISP;

import ISP.Exceptions.ConnectionException;
import ISP.Exceptions.SpeedLimitException;


public class Network2G implements Network {
    final Speed speed = new Speed("2G", 0.1, 0.3);
    @Override
    public void connect() throws ConnectionException {
        System.out.println("Connecting....");
        try {
            Thread.sleep(2000); // 3 seconds
            if(Math.random() > 0.7) throw new ConnectionException("Having trouble connecting to network atm!");
            System.out.println("Phone connected to 2G!");

        } catch (InterruptedException e) {
            throw new ConnectionException("Thread exception");
        }

    }

    @Override
    public void disconnect() throws ConnectionException {
        System.out.println("Disconnecting....");
        try {
            Thread.sleep(2000);
            if(Math.random() > 0.7) throw new ConnectionException("Having trouble disconnecting to network!");
            System.out.println("2G network disconnected!");
        }
        catch (InterruptedException e){
            throw new ConnectionException("Thread issue");
        }

    }

    @Override
    public void info(){
        if(Math.random() > 0.7) throw new SpeedLimitException("Speed limit exception");
        System.out.println("Network type: " + speed.type);
        System.out.println("Network speed: " + speed.lowerbound  + " - " + speed.upperbound + "MB per sec.");
    }

}
