package exceptionhandling;

class IllegalArgumentExample {

     static void checkAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {

        try {
            checkAge(-23);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
