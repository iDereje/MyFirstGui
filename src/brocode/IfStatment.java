package brocode;

import java.util.Scanner;

public class IfStatment {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter your age "  );


    int     age = scanner.nextInt();

        if(age>=18){
        
            System.out.println("You are Old enough  to drink " );
        }
        else if (age<13) {
            System.out.println("Are you crazy you haven't had   a bar-mitzvah yet  ");
        }
else {
            System.out.println("You are too young ");
        }
    }


}
