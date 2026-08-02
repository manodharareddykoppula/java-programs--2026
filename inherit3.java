class animal{
String name = " lion";
void an(){
    System.out.println(" lion is the my fav animal");
}
}
class bird extends animal{
    String names = " parrot , sparrow";
    void bi(){
        System.out.println("parrot is my fav bird");// multi inheritanceis executed
    }
}
class sea extends animal {
    float marks = 99.23f;
    void mar(){
        System.out.println(" you got 1 st rank");
    }
}

public class Inherit3 {
    public static void main(String[] args) {
        sea as = new sea();
       

        as.mar();
        as.an();
        as.an();
    }
}
