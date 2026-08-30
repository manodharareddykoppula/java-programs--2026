package exceptionhandling;

class ThrowsExample {


    public static void main (String[] args) throws ArithmeticException{
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
