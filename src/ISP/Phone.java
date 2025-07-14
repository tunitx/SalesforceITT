package ISP;

public class Phone {
    private Network network;

   protected Phone(){
        this.network = new Network2G();
    }

    protected void changeNetwork(Network network){
       this.network = network;
    }
    protected void disconnectNetwork(){
       network.disconnect();
    }
    protected void connectNetwork(){
       network.connect();
    }
    protected void networkInfo(){
       network.info();
    }

}
