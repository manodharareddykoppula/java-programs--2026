package exceptionhandling;

class ClassNotFoundExample {
    public static void main(String[] args) {

        try {
            Class.forName("Student123");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
