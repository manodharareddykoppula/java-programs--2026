class C2{
    void demo2(){
        System.out.println("C2 method");
    }
}
interface I1{
    void show1();
}
// Invalid statement
//class in class extends not implements
//class in interface is implements not extends
class C1 implements C2 extends I1{  //here is the error
    public void demo1(){
        System.out.println("I1 method");
    }
}
public class Main{
    public static void main(String args[]){
        C1 obj = new C1();
        obj.demo2();
        obj.demo1();
    }
}
