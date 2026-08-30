package exceptionhandling;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the age:");
        age = sc.nextInt();

        if (age < 18) {
            throw new ArithmeticException("Age is less than 18");
        }

        System.out.println("Code executed successfully");
    }
}

