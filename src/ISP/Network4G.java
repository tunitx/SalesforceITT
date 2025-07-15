package ISP;

import ISP.Exceptions.ConnectionException;
import ISP.Exceptions.SpeedLimitException;

public class Network4G implements Network {
    final Speed speed = new Speed("4G", 300, 200);
    @Override
    public void connect() throws ConnectionException {
        System.out.println("Connecting....");
        try {
            Thread.sleep(3000); // 3 seconds
            if(Math.random() > 0.7) throw new ConnectionException("Cant connect");
            System.out.println("Phone connected to 4G!");
        } catch (InterruptedException e) {
            throw new ConnectionException("thread issue");
        }

    }

    @Override
    public void disconnect() throws ConnectionException {
        System.out.println("Disconnecting....");
        try {
            Thread.sleep(2000);
            if(Math.random() > 0.7) throw new ConnectionException("Cant disconnect");
            System.out.println("4G network disconnected!");
        }
        catch (InterruptedException e){
            throw new ConnectionException("thread issue");
        }
    }

    @Override
    public void info(){
        if(Math.random() > 0.7) throw new SpeedLimitException("Speed limit exception");
        System.out.println("Network type: " + speed.type);
        System.out.println("Network speed: " + speed.lowerbound  + " - " + speed.upperbound + "MB per sec.");
    }

}
