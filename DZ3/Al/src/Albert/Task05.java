package Albert;

public class Task05 {

    public static void main(String[] args) {
        double radius;
        double area;
        double length;

        radius = 17; // Радиус равен 17

        // Рассчет площади окружности=  π * радиус * радиус
        area = 3.14159 * radius * radius ;



        // Рассчет длины окрудности  = 2 * π * радиус
        length = 2 * 3.14159 * radius;


        // Показать результаты

        // System.out.println("Площадь окружности с радиусом " + radius + " равна " + area);
        System.out.print("Площадь окружности с радиусом ");
        System.out.print(Math.round(radius)); // без знаков после запятой
        System.out.println(" равна " + area);


        // System.out.println("Длина окружности с радиусом " + radius + " равна " + length);
        System.out.print("Длина окружности с радиусом ");
        System.out.print(Math.round(radius)); // без знаков после запятой
        System.out.println(" равна " + length);

    }
}

