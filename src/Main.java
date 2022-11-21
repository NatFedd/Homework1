public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1. Задача 1
        System.out.println("Домашнее задание 1. Задача 1");
        int ageMajority = 20;
        if (ageMajority > 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (ageMajority == 18) {
            System.out.println("Поздравляем с днем рождения");
        }
        if (ageMajority < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        //Домашнее задание 1. Задача 2
        System.out.println("Домашнее задание 1. Задача 2");
        int age = 9;
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }

        //Домашнее задание 1. Задача 3
        System.out.println("Домашнее задание 1. Задача 3");
        int thePlaceOccupied = 100;
        int capacityOneTrainCar = 102;
        int sittingPlace = 60;
        int standingPlace = capacityOneTrainCar - sittingPlace;
        int freeSeating = sittingPlace - thePlaceOccupied;
        int freeStanding = capacityOneTrainCar - thePlaceOccupied;
        if (thePlaceOccupied < standingPlace) {
            System.out.println("В вагоне свободны: " + freeSeating + " сидячих и " + standingPlace + " стоячих мест.");
        }
        if (thePlaceOccupied == sittingPlace) {
            System.out.println("В вагоне все сидячие места заняты, но " + standingPlace + " стоячих места свободны");
        }
        if (thePlaceOccupied > sittingPlace) {
            System.out.println("В вагоне все сидячие места заняты, но " + freeStanding + " стоячих мест(а) свободны");
        }
        if (thePlaceOccupied == capacityOneTrainCar) {
            System.out.println("В вагоне свободных мест нет");
        }

        //Домашнее задание 2. Задача 1
        System.out.println("Домашнее задание 2. Задача 1");
        int ageMajority1 = 8;
        if (ageMajority1 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        //Домашнее задание 2. Задача 2
        System.out.println("Домашнее задание 2. Задача 2");
        int age1 = 8;
        if (age1 >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else {
            if (age1 >= 18 && age1 < 24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            } else {
                if (age1 >= 24) {
                    System.out.println("человек окончил университет и ему пора искать первую работу");
                }
            }
        }
        //Домашнее задание 2. Задача 3
        System.out.println("Домашнее задание 2. Задача 3");
        int thePlaceOccupied1 = 102; // занято мест
        int capacityOneTrainCar1 = 102; // всего мест
        int sittingPlace1 = 60;
        int standingPlace1 = capacityOneTrainCar1 - sittingPlace1;
        int freeSeating1 = sittingPlace1 - thePlaceOccupied1;
        int freeStanding1 = capacityOneTrainCar1 - thePlaceOccupied1;

        if (thePlaceOccupied1 < capacityOneTrainCar1) {
            if (thePlaceOccupied1 < sittingPlace1) {
                System.out.println("В вагоне свободны: " + freeSeating1 + " сидячих и " + standingPlace1 + " стоячих мест.");
            }
            if (thePlaceOccupied1 == sittingPlace1) {
                System.out.println("В вагоне все сидячие места заняты, но " + standingPlace1 + " стоячих места свободны");
            }
            if (thePlaceOccupied1 > sittingPlace1) {
                System.out.println("В вагоне все сидячие места заняты, но " + freeStanding1 + " стоячих мест(а) свободны");
            }
        } else {
            System.out.println("В вагоне свободных мест нет");
        }

        //Домашнее задание 3. Задача 1
        System.out.println("Домашнее задание 3. Задача 1");
        int age2 = 24;
        if (age2 >= 2 && age2 <= 6)
            System.out.println("Возраст человека равен " + age2 + ", ему нужно ходить в детский сад");
        if (age2 >= 7 && age2 < 18)
            System.out.println("Возраст человека равен " + age2 + ", ему нужно ходить в школу");
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Возраст человека равен " + age2 + ", ему нужно ходить в университет");
        } else {
            System.out.println("Возраст человека равен " + age2 + ", ему нужно ходить на работу");
        }

        //Домашнее задание 3. Задача 2
        System.out.println("Домашнее задание 3. Задача 2");
        int age3 = 13;
        if (age3 < 5) {
            System.out.println("Возраст человека равен " + age3 + ", он не может кататться на аттракционе");
        } else if (age3 < 14) {
            System.out.println("Возраст человека равен " + age3 + ", он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Возраст человека равен " + age3 + ", он может кататься без сопровождения взрослого");
        }

        //Домашнее задание 3. Задача 3
        System.out.println("Домашнее задание 3. Задача 3");
        int one = 4;
        int two = 8;
        int three = 10;
        if (one >= two && one > three) {
            System.out.println("Самым большим числом является two и оно равно " + one);
        } else if (one > two && one <= three) {
            System.out.println("Самым большим числом является one и оно равно " + three);
        } else if (two > one && two > three) {
            System.out.println("Самым большим числом является one и оно равно " + two);
        } else {
            System.out.println("Самым большим числом является three и оно равно " + three);
        }

    }

}