package exceptionhandling;

import java.util.Scanner;

public class NFE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String n = sc.nextLine();

        try {
            int num = Integer.parseInt(n);
            System.out.println("The number is: " + num);
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a valid number.");
        }
    }
}
