public class Constructors {
    int number ;
    String name ;
    float marks;
public Constructors(){
    this.number = 225;
this.name = " manodhara";
this.marks = 92.30f;
}
void sample(){
    System.out.println("roll number is " + number);
    System.out.println(" name is" + name);
    System.out.println(" marks are" + marks);
}
    public static void main(String[] args){
Constructors obj = new Constructors();
obj.sample();
    }
    }
