public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4.0;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес боксеров равен " + totalWeight + " кг.");
        var difference1WeightBoxer = weightBoxer1 - weightBoxer2;
        System.out.println("Разница в весе двух боксеров вычисленная первым способом " + difference1WeightBoxer + " кг.");
        var difference2WeightBoxer = weightBoxer2 % weightBoxer1;
        System.out.println("Абсолютная разница в весе боксеров " + difference2WeightBoxer + "кг.");
        var quantityHours = 640;
        var durationWork = 8;
        var peoples = quantityHours / durationWork;
        System.out.println("Всего работников в компании " + peoples + " человек");
        peoples = peoples + 94;
        quantityHours = peoples * durationWork;
        System.out.println("Если в компании работает " + peoples + " человека, то всего " + quantityHours + " часа работы может быть поделено между сотрудниками");
    }
}