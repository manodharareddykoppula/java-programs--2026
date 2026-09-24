package collectionfw;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> name=new Stack<>();
        name.push("manodhara");
        name.push("Rakesh");
        name.push("Jeswanth");
        System.out.println(name);
        name.pop();
        System.out.println(name);
        System.out.println(name.empty());
        System.out.println(name);
        System.out.println(name.search("Tharun"));
        // here the element is not found ot returns the -1

    }
}
