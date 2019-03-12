import java.util.LinkedList;
import java.util.List;

interface ISubject{
    void AttachObserver(IObserver observer);
    void DetachObserver(IObserver observer);
    void Notify();
    String bookEvent();
}

interface IObserver {
   void Update(ISubject subject);
}

class FunSubscriber implements IObserver{

    public void Update(ISubject subject){
        System.out.println("Buy book");
    }

}

class DefaultSubscriber implements IObserver{

    public void Update(ISubject subject){
        String bookState = subject.bookEvent();
        if(bookState.equals("sales"))
            System.out.println("buy the book");
        else
        System.out.println("Wait for sales");
    }

}

public class PublishObserver implements ISubject {
    public List<IObserver> Observers;
    private String bookState = "waiting for release";
    public PublishObserver()     {
        Observers = new LinkedList<>();
    }
    public  String bookEvent(){
        return bookState;
    }

    public void AttachObserver(IObserver observer){
        Observers.add(observer);
    }
    public void DetachObserver(IObserver observer){
        Observers.remove(observer);
    }
    public void ChangeBookState(String bookState){
        this.bookState = bookState;
        Notify();
    }
    public void Notify() {
        for (IObserver x : Observers) {
            x.Update(this);
        }
    }
}
