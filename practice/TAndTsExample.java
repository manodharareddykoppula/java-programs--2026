package exceptionhandling;

import java.util.Scanner;

public class TAndTsExample {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of an and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
    try{
        int result=a/b;
        System.out.println("the result is :"+result);
    }catch(ArithmeticException ae){
        System.out.println("do not enter zeros");
        }
    System.out.println("enter the age");
    int age=sc.nextInt();
    if (age<18){
        throw new  Exception("age is less than 18");
    }
    System.out.println("code executeed successfully");
    }

}
