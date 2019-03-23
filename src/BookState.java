import java.util.Stack;

interface State {
    public void goToNextState(BookState book);
    public void Canceled(BookState book);
    public void printCurrentState();
}

public class BookState {
private State state = new Publish();

    public State GetState(){
        return state;
    }

    public void SetState(State state){
        this.state = state;
    }

    public void goToTheNextState(){
        state.goToNextState(this);
    }

    public void Canceled(){
        state.Canceled(this);
    }

    public void printCurrentState(){
        state.printCurrentState();
    }
}



class Publish implements State{

    public void goToNextState(BookState book){
        book.SetState(new OnSale());
    }

    public void Canceled(BookState book){
        book.SetState(new Cancel());
    }

    public void printCurrentState(){
        System.out.println("publish state");
    }
}



class OnSale implements State{

    public void goToNextState(BookState book){
        book.SetState(new AtDiscount());
    }

    public void Canceled(BookState book){
        book.Canceled();
    }

    public void printCurrentState(){
        System.out.println("on sale state");
    }
}

class AtDiscount implements State{

    public void goToNextState(BookState book){
        book.SetState(new NotAvailable());
    }

    public void Canceled(BookState book){
        book.Canceled();
    }

    public void printCurrentState(){
        System.out.println("at a discount state");
    }
}

class NotAvailable implements State{

    public void goToNextState(BookState book){
        book.SetState(new Cancel());
    }

    public void Canceled(BookState book){
        book.Canceled();
    }

    public void printCurrentState(){
        System.out.println("not available state");
    }
}

class Cancel implements State{
    public void goToNextState(BookState book){
        System.out.println("Book has allready canceled");
    }

    public void Canceled(BookState book){
        System.out.println("Book has allready canceled");
    }

    public void printCurrentState(){
        System.out.println("cancel state");
    }
}

