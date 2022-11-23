public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android  по ссылке");
        }
        //Задача 2
        System.out.println("Задача 2");
        int clientOS1 = 0;
        int produced = 2014;
        if (clientOS1 == 0 && produced < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (produced < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 3
        System.out.println("Задача 3");
        int year = 1804;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)  {
            System.out.println(year + " год - висосный");
        } else {
            System.out.println(year +" год не является висосным");
        }
        //Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 60;
        int deliveryDays = 1;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется " + deliveryDays + " день для доставки карты");
        }
        else {
            System.out.println("Потребуется " + (((deliveryDistance - 20) / 40 + deliveryDays+1)) + " дня(-ей) для доставки карты") ;
        }
        //Задача 5
        System.out.println("Задача 5");
        int monthNumber = 14;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
            System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                default:
                    System.out.println("Такого месяца не существует");
        }
    }
}
