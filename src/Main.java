public class Main {

    public static void main(String[] args) {
         PublishingHouse publishingHouse = new PublishingHouse();
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
    }

}
