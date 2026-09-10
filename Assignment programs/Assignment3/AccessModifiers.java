package accessmodifiers;

class A{
    int defaultvar=20;
     private int x =20;
     protected String name = "Manodhara";
     public int y=30;
    void display(){
        System.out.println("------PARENT CLASS------");
        System.out.println("the value of defaultvar is :"+defaultvar);
        System.out.println("the value of x is :"+x);
        System.out.println("the name of a person is :"+name);
        System.out.println("the value of y is :"+y);
    }
}
class B extends A{
    void show(){
        System.out.println("------CHILD CLASS------");
        //default variable can accessed
        System.out.println("the value of defaultvar is :"+defaultvar);
        //private variable cannot be accessed to other child class
        // System.out.println("the value of x is :"+x);
 //protected variable also accessed
        System.out.println("the name of a person is :"+name);
        //public variable accessed anywhere
        System.out.println("the value of y is :"+y);
    }
}

public class AccessSpecifierDemo {
    public static void main(String[] args) {
       B obj =new B();
       obj.show();
       obj.display();
    }
}
