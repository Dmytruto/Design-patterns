interface Notification {

    public void assemble();
}

public class BasicNotification implements Notification {
    @Override
    public void assemble(){
        System.out.println("Basic Notification");
    }
}

class NotificationDecorator implements Notification{
    protected Notification notification;

    public NotificationDecorator(Notification notification){
        this.notification = notification;
    }
    @Override
    public void assemble(){
        this.notification.assemble();
    }
}


class GmailNotification extends NotificationDecorator{

    public GmailNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of GmailNotification.");
    }

}

class SMSNotification extends NotificationDecorator{

    public SMSNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of SMSNotification.");
    }

}

class MessengerNotification extends NotificationDecorator{

    public MessengerNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of MessengerNotification.");
    }

}