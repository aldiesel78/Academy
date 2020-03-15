package Albert;

public class Task02 {

    public static void main(String[] args)
    {
        int a=249;
        System.out.println("Сумма цифр числа " + a +" равна "+((a%10)+((a/10)%10)+(a/100)));
    }
}

