package interface1;

class C1{
    void show(){
        System.out.println("C1 method");
    }
}
// ERROR: An interface cannot implement a class
// An interface cannot create a object
interface I1 implements C1{
    void show1();
}
