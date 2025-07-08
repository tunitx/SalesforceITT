package PolymorphismExample;

public class EmailNotification extends Notification
{
    public EmailNotification(String recipient, String message){
        super(recipient, message);
    }

    @Override
    protected void send(){
        System.out.println("Sending an email notification to " + this.recipient);
        System.out.println("The message is : " + this.message);
    }
}
