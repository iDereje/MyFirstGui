package brocode;

import java.util.Scanner;

public class Scratch {
  public static void main(String[]args) {

    Scanner scanner = new Scanner(System.in) ;
    System.out.println("Please enter your name  :  " ) ;
    String name = scanner.nextLine() ;

    System.out.println("Please enter your age  :  "  );
    int age = scanner.nextInt();
    scanner.nextLine() ;

    System.out.println("Please enter your favorite food ") ;
    String food = scanner.nextLine();


    System.out.println("Nice to meet you " + name + " " + " You say you are " +  age  +  "   of age " + " And you like " + food + "Cool this is also my fave Thing to eat  "   ) ;








  }


}
