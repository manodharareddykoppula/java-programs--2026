abstract class Student{
    float marks;
    void mat(){
        System.out.println("the marks are"+marks);
    }
    abstract void phy();
}
abstract class G extends Student{
    void che(){
        System.out.println("the student got top marks in class");
    }
}
public class AbstractDemo extends G{
    @Override
    void phy() {
        System.out.println("the boys are intelligent");
    }

    public static void main(String[] args){
        AbstractDemo ad=new AbstractDemo();
        ad.phy();
        ad.mat();
        ad.che();
    }
}
