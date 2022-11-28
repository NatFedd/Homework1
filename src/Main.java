public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1. Задача 1
        System.out.println("Домашнее задание 1. Задача 1");
        int accumulation = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + accumulation;
            i = total / accumulation;
        }
        System.out.println("Месяц " + i + ". Сумма накоплений равна " + total + " рублей");
        //Домашнее задание 1. Задача 2
        System.out.println("Домашнее задание 1. Задача 2");




    }

}
