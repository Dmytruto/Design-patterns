import java.util.List;

import static java.util.Arrays.asList;

interface IProxy{
    public void passToVerify(String authorName) throws Exception;
}


class Publisher implements IProxy{
    public void passToVerify(String authorName){
        System.out.println("We can publish the book");
    }
}
public class AuthorChecker implements IProxy{
    public Publisher publisher = new Publisher();
    private static List<String> bannedPerson = asList("John Smith", "Luke SkyWalker");

    public void passToVerify(String authorName) throws Exception {
        if(bannedPerson.contains(authorName)){
            throw new Exception("Author is in ban list");
        }
        publisher.passToVerify(authorName);
    }
}
