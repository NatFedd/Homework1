public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1. Задача 1
        System.out.println("Домашнее задание 1. Задача 1");
        for (int i = 1; i <= 10; i++) {
        System.out.println("Итерация цикла " + i);
    }
        //Домашнее задание 1. Задача 2
        System.out.println("Домашнее задание 1. Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла " + i);
        }
        //Домашнее задание 1. Задача 3
        System.out.println("Домашнее задание 1. Задача 3");
        for (int i = 0; i < 17; i+=2) {
            System.out.println("Итерация цикла " + i);
        }
        //Домашнее задание 1. Задача 4
        System.out.println("Домашнее задание 1. Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
        //Домашнее задание 2. Задача 1
        System.out.println("Домашнее задание 2. Задача 1");
        for (int i = 1904; i <= 2096; i+=4) {
            System.out.println(i + " год является високосным " );
        }
        //Домашнее задание 2. Задача 2
        System.out.println("Домашнее задание 2. Задача 2");
        for (int i = 7; i <= 98; i+=7) {
            System.out.print(i + " " );
        }
        System.out.println();
        //Домашнее задание 2. Задача 3
        System.out.println("Домашнее задание 2. Задача 3");
        int number = 1;
            System.out.print(number+ " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");
        }
        System.out.println();
        //Домашнее задание 3. Задача 1
        System.out.println("Домашнее задание 3. Задача 1");
        int accumulation = 29000;
        int total1 = 0;
        for (int i=0; i < 12; i++) {
            total1 = total1 + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }
        //Домашнее задание 3. Задача 2
        System.out.println("Домашнее задание 3. Задача 2");
        int accumulation1 = 29000;
        float total2 = 0;
        for (int i=0; i < 12; i++) {
            total2 = total2 + total2/100;
            total2 = total2 + accumulation1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }
    }
}
