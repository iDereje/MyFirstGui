package brocode;

import java.util.Scanner;

public class Scanner1 {

  public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Whats your name ? ");
    String name = scanner.nextLine();


    System.out.println("And how old are you ?") ;
    String age = scanner.nextLine();

    System.out.println("And what is your favorite food ? " );
    String food = scanner.nextLine();


    System.out.println("So you say your name is " + name +" "+ "and you are " + age +"" +" you like !" + food + "awsome me as well  ") ;






  }
}
