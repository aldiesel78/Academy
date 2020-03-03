package Albert;

import java.util.*;
import java.text.*;

public class Task11
{
        public static void main(String args[]) {
            // Date dateNow = new Date();
            // SimpleDateFormat formatForDateNow = new SimpleDateFormat("E dd.MM.yyyy ' \nМосковское время' hh:mm:ss a zzz");

            // System.out.println("Текущая дата " + formatForDateNow.format(dateNow));


            String date1 = "31.12.2020"; // Новый год
            String date2 = "02.03.2020"; // Текущая дата

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date dateOne = null;
        Date dateTwo = null;

        try {
            dateOne = format.parse(date1);
            dateTwo = format.parse(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Количество дней между датами в миллисекундах
        long difference = dateOne.getTime() - dateTwo.getTime();
        // Перевод количества дней между датами из миллисекунд в дни
        int days =  (int)(difference / (24 * 60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
        int h =  (int)(difference / (60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
            int min =  (int)(difference / (60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)


            // Вывод разницы между датами в днях на экран
        System.out.println(days + " дней " + h + " часов " + min + " минут ");
    }
}
