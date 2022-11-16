public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int unknownI = 127;
        System.out.println("Значение с переменной unknownI с типом int равно " + unknownI);
        byte unknownB = 2;
        System.out.println("Значение с переменной unknownB с типом byte равно " + unknownB);
        short unknownS = 32767;
        System.out.println("Значение с переменной unknownS с типом short равно " + unknownS);
        long unknownL = -9223372036854775808L;
        System.out.println("Значение с переменной unknownL с типом long равно " + unknownL);
        float unknownF = 3.2f;
        System.out.println("Значение с переменной unknownF с типом float равно " + unknownF);
        double unknownD = -1.7;
        System.out.println("Значение с переменной unknownD с типом double равно " + unknownD);
        // Задача 2
        System.out.println("Задача 2");
        float unknownF1 = 27.12f;
        System.out.println("Значение с переменной unknownF1 с типом float равно " + unknownF1);
        long unknownL2 = 987678965549L;
        System.out.println("Значение с переменной unknownL2 с типом long равно " + unknownL2);
        double unknownD1 = 2.786;
        System.out.println("Значение с переменной unknownD1 с типом double равно " + unknownD1);
        boolean unknownBoo = false;
        System.out.println("Значение с переменной unknownBoo с типом boolean равно " + unknownBoo);
        short unknownS1 = 569;
        System.out.println("Значение с переменной unknownS1 с типом short равно " + unknownS1);
        int unknownI1 = -159;
        System.out.println("Значение с переменной unknownI1 с типом int равно " + unknownI1);
        long unknownL1 = 27897;
        System.out.println("Значение с переменной unknownL1 с типом long равно " + unknownL1);
        int unknownI2 = 67;
        System.out.println("Значение с переменной unknownI2 с типом int равно " + unknownI2);
        // Задача 3
        System.out.println("Задача 3");
        int studentsLP = 23;
        int studentsAS = 27;
        int studentsEA = 30;
        int numberSheetsPurchased = 480;
        int numberSheetsStudent = numberSheetsPurchased / (studentsLP + studentsAS + studentsEA);
        System.out.println("На каждого ученика рассчитано " + numberSheetsStudent + " листов бумаги");
        // Задача 4
        System.out.println("Задача 4");
        int productivityMminute = 16 / 2;
        double productivity20Mminutes = productivityMminute * 20;
        System.out.println("За 20 минут работы машины, произведено бутылок - " + productivity20Mminutes + " штук");
        double productivityDay = productivityMminute * 60 * 24;
        System.out.println("За 1 день работы машины, произведено бутылок - " + productivityDay + " штук");
        double productivity3Days = productivityDay * 3;
        System.out.println("За 3 дня работы машины, произведено бутылок - " + productivity3Days + " штук");
        double productivityMonth = productivityDay * 30;
        System.out.println("За месяц работы машины, произведено бутылок - " + productivityMonth + " штук");
        // Задача 5
        System.out.println("Задача 5");
        byte potsSchool = 120;
        byte potsWhitePaint = 2;
        byte potsBrownPaint = 4;
        int potsClass = potsWhitePaint + potsBrownPaint;
        int quantityClass = potsSchool / potsClass;
        int totalWhitePaint = quantityClass * potsWhitePaint;
        int totalBrownPaint = quantityClass * potsBrownPaint;
        System.out.println("В школе, где " + quantityClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        // Задача 6
        System.out.println("Задача 6");
        int bananaPiece = 5;
        int bananaGrams = 80;
        int bananaWeight = bananaPiece * bananaGrams;
        int milkMilliliters = 200;
        float milkWeight = milkMilliliters / 100f * 105;
        System.out.println(milkWeight);
        int iceCreamSundaeBriquette = 2;
        int iceCreamSundaeGrams = 100;
        int iceCreamSundaeWeight = iceCreamSundaeBriquette * iceCreamSundaeGrams;
        int rawEggPiece = 4;
        int rawEggGrams = 70;
        double rawEggWeight = rawEggPiece * rawEggGrams;
        double totalWeightGrams = bananaWeight + milkWeight + iceCreamSundaeWeight + rawEggWeight;
        double totalWeightKilogram = totalWeightGrams / 1000f;
        System.out.println("Общий вес блюда после смешивания в блендере составил " + totalWeightKilogram + " килограммов");
        // Задача 7
        System.out.println("Задача 7");
        int targetWeight = - 7 * 1000;
        System.out.println("Целевой вес для сбрасывания " + targetWeight + " граммов");
        int goalDay1 = - 250;
        System.out.println("Целевой вес для сбрасывания минимально в день " + goalDay1 + " граммов");
        int goalDay2 = - 500;
        System.out.println("Целевой вес для сбрасывания максимально в день " + goalDay2 + " граммов");
        int numberDays1 = targetWeight / goalDay1;
        System.out.println("Максимальный срок достижения поставленной цели " + numberDays1 + " дней");
        int numberDays2 = targetWeight / goalDay2;
        System.out.println("Минимаьный срок достижения поставленной цели " + numberDays2 + " дней");
        int weightedAverageDay = (numberDays1 + numberDays2) / 2;
        System.out.println("Средневзвешанное количество дней для достижения поставленной цели - " + weightedAverageDay);
        // Задача 8
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float salaryMasharaising = salaryMasha / 100f * 110;
        float differencesalaryMasha = salaryMasharaising - salaryMasha;
        float salaryDenisraising = salaryDenis / 100f * 110;
        float differencesalaryDenis = salaryDenisraising - salaryDenis;
        float salaryKristinaraising = salaryKristina / 100f * 110;
        float differencesalaryKristina = salaryKristinaraising - salaryKristina;
        System.out.println("Маша теперь получает " +salaryMasharaising + " рублей. Годовой доход вырос на " + differencesalaryMasha + " рублей");
        System.out.println("Денис теперь получает " +salaryDenisraising + " рублей. Годовой доход вырос на " + differencesalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " +salaryKristinaraising + " рублей. Годовой доход вырос на " + differencesalaryKristina + " рублей");
    }
}