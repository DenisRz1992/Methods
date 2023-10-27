import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Methods");

        // Задача 1

        printIsLeapYear(2023);
        RecommendedVersion(0, 2023);
        System.out.println(deliveryDays1(11));
    }

    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " год -  високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
    }

    public static void printIsLeapYear(int year) {
        printIsLeapYearResult(year, isLeap(year));
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && 100 != 0 || year % 400 == 0;
    }

    // Задача 2

    public static void RecommendedVersion(int clientOS, int clientDeviceYear) {
        boolean deviceIsOld = isDeviceIsOld(clientDeviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("облегченную версию для ");
        }
        if (clientOS == 0) {
            System.out.print("iOS по ссылке");
        } else {
            System.out.print("Android по ссылке");
        }
    }

    private static boolean isDeviceIsOld(int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        return clientDeviceYear <= currentYear;
    }

    // Задача 3

    public static String deliveryDays1(int deliveryDistance) {

        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            deliveryDays++;
        } else if (deliveryDistance > 100) {
            return "Доставки нет";
        }
        return "Потребуется " + deliveryDays + " дней";
    }
}