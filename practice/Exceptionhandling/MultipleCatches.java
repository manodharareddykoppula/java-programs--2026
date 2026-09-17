package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleClasses {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        int y;
        System.out.println("enter the values of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("enter the values of i and j");
        int i=sc.nextInt();
        int j =sc.nextInt();
        try{
            int z=x/y;
            int[]  r={1,2,3,4,5};
            System.out.println("array[" + i + "] = " + r[i]);
            System.out.println("array[" + j + "] ="+ r[j]);
            System.out.println(j);
        }catch(ArithmeticException ae){
            System.out.println("do no tenter zero");
        }catch(InputMismatchException ime){
            System.out.println("do not enter characters");
        }catch(ArrayIndexOutOfBoundsException aw){
            System.out.println("reenter the values");
        }
        System.out.println("code executed successfully");
    }
}
