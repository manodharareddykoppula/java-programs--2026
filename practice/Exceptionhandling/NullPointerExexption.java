package exceptionhandling;

public class NullPointerExexption {
    public static void main(String[] args) {

        String name =null;

        try {
            System.out.println("Length of name: " + name.length());

        } catch (NullPointerException npe) {
            System.out.println("The string is null. Cannot access its length.");
        }

    }
}
