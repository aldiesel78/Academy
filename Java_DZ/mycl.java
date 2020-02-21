package myCl;

import java.util.Scanner;

public class Mycl2
{

public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
int x,y;
System.out.println("Введите первое число");
        x=in.tInt();
System.out.println("Введите второе число (процент)");
y=in.tInt();
System.out.print("Результат ");
System.out.println((x/100)*y);


    }
}







package myCl;

import java.util.Scanner;

public class Mycl2
{

public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
int x;
System.out.println("Введите сторону квадрата");
x=in.tInt();
System.out.print("Площадь квадрата равна  ");
System.out.println(x*x);


    }

}
