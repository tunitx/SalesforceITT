package PolymorphismExample;

public class Notification {
    String recipient;
    String message;
    public Notification(String recipient, String message){
        this.message = message;
        this.recipient = recipient;
    }
    protected void send(){
        System.out.println("A generic notification");
    }

    // function overloading done at compile time
    protected void send(String message){
        System.out.println("Sending " + message);
    }

    protected void send(String recipient, String message){
        System.out.println("Sending message to " + recipient + " " + message);
    }
}
