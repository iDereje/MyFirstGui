package brocode;

public class math {

    public static void main(String[] args) {

        double x = 3.14 ;
        double y = -10 ;

        // find the max number method
       double a = Math.max(x , y ) ;

        //finds the min method
        double b = Math.min(x , y ) ;


        // finds the absolute  value method (absolut value = no minus(-10 in absolut will consider as 10 ))
         double c = Math.abs(y) ;

         //finds the square unit of a number method

         double d = Math.sqrt(x);
// round a decimal number
         double e = Math.round(x);
         // floor a decimal number method
         double f = Math.floor(x);

         // ceiling decimal number
         double g = Math.ceil(x);




        System.out.println("                          ");
        System.out.println("----------solutions--------");
        System.out.println("                             ");


        System.out.println("-------max number   (x is 3.13 ,and y is -10. )---------------");
        System.out.println(a);

        System.out.println("--------min number (x is 3.13 ,and y is -10. )--------------");
        System.out.println(b);

        System.out.println("------------absolut value of -10 ----------");
        System.out.println(c);

        System.out.println("------------square unit ----------");
        System.out.println(d);

        System.out.println("------------round of 3.14 ----------");
        System.out.println(e);

        System.out.println("------------floor of 3.14 ----------");
        System.out.println(f);

        System.out.println("------------ceiling of 3.14  ----------");
        System.out.println(g);







    }

}
