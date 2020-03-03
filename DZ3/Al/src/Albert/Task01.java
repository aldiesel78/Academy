package Albert;

public class Task01 {

        public static void main(String[] args){
            int x=16;
            int y=7;
            int a=x/y;
            int b=x%y;
            double z = x;

            System.out.println("Результат целочисленного деления x на y равен " +a+ ", а остаток от деления x на y равен "+b);
            System.out.printf("Квадратный корень из %.0f = %.0f%n", z, Math.sqrt(z));
        }
    }

