public class Main {

    public static void main(String[] args) {
         PublishingHouse publishingHouse = PublishingHouse.GetInstanse();
         Strategy newStratagy = new exspensiveStratagy();
         publishingHouse.ChangeStratagy(newStratagy);
         publishingHouse.publish();

         System.out.println();
         PublishObserver publishObserver = new PublishObserver();
         FunSubscriber funSubscriber = new FunSubscriber();
         DefaultSubscriber defaultSubscriber = new DefaultSubscriber();
         publishObserver.AttachObserver(funSubscriber);
         publishObserver.AttachObserver(defaultSubscriber);
         publishObserver.ChangeBookState("waiting for release");
         publishObserver.ChangeBookState("sales");

         System.out.println();
         Notification notification = new MessengerNotification(new GmailNotification(new SMSNotification(new BasicNotification())));
         notification.assemble();


         System.out.println();
         BookFactory bookFactory = new BookFactory();
         IBookFactory book = bookFactory.createBook("cheap");
         book.getBook();
    }

}
