public class Main {

    public static void main(String[] args){
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


         BookState state = new BookState();
         state.printCurrentState();

         state.goToTheNextState();
         state.printCurrentState();
         state.goToTheNextState();
         state.printCurrentState();
         state.goToTheNextState();
         state.printCurrentState();
         state.goToTheNextState();
         state.printCurrentState();
         state.goToTheNextState();
         state.printCurrentState();
         System.out.println();

         Book newBook = new Book.BookBuilder()
                 .SetCoverType("hardСardboard")
                 .SetPrintType("offset")
                 .SetPageSize("129 mm × 198 mm")
                 .SetFontFamily("Times New Roman")
                 .SetFontSize("12mm")
                 .GetBook();
         System.out.println(newBook);


         System.out.println();
         AuthorChecker publisher = new AuthorChecker();
         try {
              publisher.passToVerify("Dmytro");
              publisher.passToVerify("John Smith");
         }
         catch (Exception e){
              System.out.println(e.getMessage());
         }
    }

}
