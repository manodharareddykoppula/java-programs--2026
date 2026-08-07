class A{
int x=10;
void add(){
System.out.println("the add is :" +(x+100));
}
}
class B extends A{
int y=20;
void sub(){
System.out.println("the sub is :"+(x-y));
}
}


public class Main{
public static void main(String[] args){
B b=new B();
b.sub();
b.add();
}
}
