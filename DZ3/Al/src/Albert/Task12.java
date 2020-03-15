package Albert;
import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;



public class Task12 {

        public static void main (String[] args) throws java.lang.Exception
        {
            DecimalFormat format = new DecimalFormat();
            format.setDecimalSeparatorAlwaysShown(false);
            double children;
            double cakes = 0 ;
            double milk = 0;
            double child ;
            Scanner in= new Scanner(System.in);
            children= in.nextDouble();
            while (in.hasNextDouble()){
                child= in.nextDouble();
                if ( child < 30) {
                    cakes++;
                    milk += 2;
                }
            }
            System.out.print(format.format(Math.ceil(milk/9)));
            System.out.print(" ");
            System.out.print(format.format(cakes));

        }
    }
