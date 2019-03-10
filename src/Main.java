public class Main {

    public static void main(String[] args) {
     PublishingHouse publishingHouse = new PublishingHouse();
     Strategy newStratagy = new exspensiveStratagy();
     publishingHouse.ChangeStratagy(newStratagy);
     publishingHouse.publish();
    }

}
