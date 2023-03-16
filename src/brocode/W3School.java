package brocode;

import java.util.Scanner;

public class W3School {

  public static void main (String[]args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number ");
    int num1 = input.nextInt();

    System.out.println("Enter operator");
    System.out.println("Enter the second number ") ;
    int num2 = input.nextInt();
    int minus = num1 - num2 ;
    int add = num1 + num2 ;
    int divide = num1 / num2 ;
    int multipy = num1 * num2 ;
    System.out.println("the add is " + add);
    System.out.println("this is sum  minus" + minus);
    System.out.println("This is divide"+divide);
    System.out.println("this is multipy" + multipy);









    input.close();


  }
}
