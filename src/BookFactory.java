
interface IBookFactory{
 void getBook();
}


class expensiveBook implements IBookFactory{
    public void getBook(){
        System.out.println("expensiveBook");
    }
}

class cheapBook implements IBookFactory{
    public void getBook(){
        System.out.println("cheapBook");
    }
}


public class BookFactory {
 public IBookFactory createBook(String book){
     switch (book){
         case ("expensive"):
             return new expensiveBook();
         case ("cheap"):
             return new cheapBook();
         default:
             return null;
     }
 }
}
