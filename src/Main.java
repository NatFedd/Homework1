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
        int b = 0;
        while (b < 10) {
            b++;
            System.out.print(b + " ");
        }
        System.out.println(" ");
        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println(" ");


        //Домашнее задание 1. Задача 3
        System.out.println("Домашнее задание 1. Задача 3");
        int birthRate = 17;
        int mortality = -8;
        int population = 12_000_000;
        for (int years = 1; years <= 10; years++) {
            population = population + birthRate + mortality;
            System.out.println("Год " + years + ", численность населения составляет " + population + " человек");
        }

        //Домашнее задание 2. Задача 1
        System.out.println("Домашнее задание 2. Задача 1");
        float accumulation1 = 15000;
        for (int month = 1; accumulation1 < 12_000_000; month++) {
            accumulation1 = accumulation1 + accumulation1 / 100 * 7;
            System.out.println("Месяц " + month + ". Сумма накоплений равна " + accumulation1 + " рублей");
        }

        //Домашнее задание 2. Задача 2
        System.out.println("Домашнее задание 2. Задача 2");
        float accumulation2 = 15000;
        for (int month = 1; accumulation2 < 12_000_000; month++) {
            accumulation2 = accumulation2 + accumulation2 / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ". Сумма накоплений равна " + accumulation2 + " рублей");
            }
        }

        //Домашнее задание 2. Задача 3
        System.out.println("Домашнее задание 2. Задача 3");
        float accumulation3 = 15000;
        for (int month = 1; month < 108; month++) {
            accumulation3 = accumulation3 + accumulation3 / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ". Сумма накоплений равна " + accumulation3 + " рублей");
            }

        }
        //Домашнее задание 2. Задача 4
        System.out.println("Домашнее задание 2. Задача 4");
        int friday = 3;
        for (int day = 1; day <= 31; day++) {
            if ((day - friday) % 7 == 0)
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
        //Домашнее задание 3. Задача 1
        System.out.println("Домашнее задание 3. Задача 1");
        int now = 2022;
        int y1Before = 200;
        int y1After = 100;
        for (int y1 = now - y1Before; y1 < (now + y1After); y1++) {
            if (y1 % 79 == 0) {
                System.out.println(y1);

        }
            //Домашнее задание 3. Задача 2
            System.out.println("Домашнее задание 3. Задача 2");
            int figure = 2;
            for (int fig1 = 1; fig1 <= 10 ; fig1++)
        System.out.println(figure + "*" + fig1 + "=" + (figure*fig1));
        }
        }

    }

