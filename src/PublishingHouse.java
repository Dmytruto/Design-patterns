interface Strategy {
    String printType();
    String coverType();
}

public class PublishingHouse {

    private static PublishingHouse publishingHouse = null;

    public static PublishingHouse GetInstanse(){
        if(publishingHouse == null)
            publishingHouse = new PublishingHouse();
        return publishingHouse;
    }

    private Strategy currentStratagy;
    void ChangeStratagy(Strategy newStratagy){
        this.currentStratagy = newStratagy;
    }
    void publish(){
        String print = currentStratagy.printType();
        String cover = currentStratagy.coverType();
        System.out.println("Book has " + print + " and " + cover);
    }

}

class exspensiveStratagy implements Strategy{
    public String printType(){
        return "offsetType";
    }

    public String coverType(){
        return "hardСardboardCover";
    }
}

class cheapStratagy implements Strategy{

    public String printType(){
        return "risographType";
    }

    public String coverType(){
        return "softCover";
    }
}
