package ISP;

import ISP.Exceptions.ConnectionException;



public class Phone {
    private Network network;


   protected Phone(){
        this.network = new Network2G();
    }

    protected void changeNetwork(Network network){
       this.network = network;
    }
    protected void disconnectNetwork() throws ConnectionException{
       network.disconnect();
    }
    protected void connectNetwork() throws ConnectionException {
       network.connect();
    }
    protected void networkInfo(){
       network.info();
    }

}
