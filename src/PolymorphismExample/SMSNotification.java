package PolymorphismExample;

public class SMSNotification extends Notification {
    public SMSNotification(String recipient, String message){
        super(recipient, message);
    }

    @Override
    protected void send(){
        System.out.println("Sending SMS notification to " + this.recipient);
        System.out.println("The message is " + this.message);
    }
}
