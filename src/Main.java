import java.time.LocalDate;

public class Main {

    // Задача 1
    public static void checkYearAndPrint(int year) {

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год - весокосный год.");
        } else {
            System.out.println(year + " год не является весокосным.");
        }
    }

    // Задача 2
    public static void announcesAndPrintOperationSystemAndVertion(int year, byte vertion) {

        int currentYear = LocalDate.now().getYear();
        //Проверка на корректные данные
        if (vertion != 1 && vertion != 0) {
            System.out.println("Введите корректные данные(0 или 1).");
            return;
        } else if (year > currentYear) {
            System.out.println("Введите корректные данные, год не может быть больше чем " + currentYear);
            return;
        }
        // Вывод более подходящей версии
        if (vertion == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию IOS");
        } else if (vertion == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию Android");
        } else if (vertion == 0 && year == currentYear) {
            System.out.println("Установите обычную версию IOS");
        } else {
            System.out.println("Установите обычную версию Android");
        }
    }

    //Задача 3
    public static byte calculateDayOfDelivery(int km) {

        if (km <= 20) {
            return 1;
        } else if (km <= 60) {
            return 2;
        } else if (km <= 100) {
            return 3;
        } else {
            throw new RuntimeException("Приносим свои извинения, туда не доставлюем.");
        }
    }

    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        checkYearAndPrint(2022);
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        announcesAndPrintOperationSystemAndVertion(2024,  (byte) 1);
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        int day = calculateDayOfDelivery(95);
        System.out.println("Время доставки " + day + " дня.");
    }


}
