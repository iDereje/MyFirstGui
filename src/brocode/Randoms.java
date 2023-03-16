package brocode;

import java.util.Random;

public class Randoms {
    public static void main(String[]args){

    Random random = new Random() ;
     int a = random.nextInt();

        System.out.println(" this is an integer(from -2B to +2B) 'random' number :" );
        System.out.println(a);
        System.out.println("------------------------------------");

        int b = random.nextInt(6)+1;
        System.out.println("This is random number limited up to six : " );
        System.out.println("------------------------------------");
        System.out.println(b);

        double c = random.nextDouble();
        System.out.println("This is  a random with a . notation  :" );
        System.out.println("--------------------------------------------------------");
        System.out.println(c);











    }

}
