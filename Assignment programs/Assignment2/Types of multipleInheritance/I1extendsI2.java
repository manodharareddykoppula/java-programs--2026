
interface I9{
     void add();
}
interface I8 extends I9{
    void add1();
}
class Show implements I8{
    @Override
    public void add() {
        System.out.println("I9 method");
    }

    @Override
    public void add1() {
System.out.println("I8 method");
    }
}

public class I1ExtendsI2 {
    public static void main(String[] args) {
Show s=new Show();
s.add();
s.add1();
    }
}
