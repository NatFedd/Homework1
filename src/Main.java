public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1. Задача 1
        System.out.println("Домашнее задание 1. Задача 1");
        int ageMajority = 20;
        if (ageMajority > 18) {
            System.out.println("Вы совершеннолетний");
        }
        if (ageMajority == 18) {
            System.out.println("Поздравляем с днем рождения");
        }
        if (ageMajority < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }
        //Задача 2
        System.out.println("Задача 2");
        int age = 19;
        if (age >= 7)
        if (age <18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18)
        if (age <24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
        //Задача 3
        System.out.println("Задача 3");
        int thePlaceOccupied = 100;
        int capacityOneTrainCar = 102;
        int sittingPlace = 60;
        int standingPlace = capacityOneTrainCar - sittingPlace;
        int freeSeating =sittingPlace - thePlaceOccupied;
        int freeStanding  =capacityOneTrainCar - thePlaceOccupied;
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
            System.out.println("Поздравляем с днем рождения");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }
        //Домашнее задание 2. Задача 2
        System.out.println("Домашнее задание 2. Задача 2");
        int age1 = 8;
        if (age1 >= 7){
           System.out.println("Ребенок ходит в школу");
        } else {
            if (age1 >= 18) {
            if (age1 <24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
                if (age1 >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }}}}
        //Домашнее задание 2. Задача 3
            System.out.println("Домашнее задание 2. Задача 3");

}}