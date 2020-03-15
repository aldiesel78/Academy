package Albert;

public class Task08 {
    public static void main(String[] args)
    {
        final float SPEED = 331f; // Объявляем константу - скорость распространения звука м/с при температуре воздуха 0 градусов Цельсия
        double time= 12; // время между ударом молнии и раскатом грома в секундах
        System.out.println(SPEED * time);
    }
}
