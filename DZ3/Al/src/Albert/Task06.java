package Albert;

public class Task06 {

    public static void main(String[] args) {
        double area; // площадь
        double length; // пириметр

        int w = 5; //  ширина прямоугольника
        int h = 25; // высота прямоугольника

        // Рассчет площади прямоугольника =  ширина  * высота)
        area = w * h;

        // Рассчет пириметра прямоугольника  = 2 * (ширина  + высота )
        length = 2 * (w + h);


        // Показать результаты
        System.out.print("Площадь прямоугольника равен ");
        System.out.println(Math.round(area)); // без знаков после запятой
        System.out.print("Периметр прямоугольника равен ");
        System.out.println(Math.round(length)); // без знаков после запятой
    }
}
