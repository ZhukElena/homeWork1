package ru.geekbrains.homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("pussy", 8),
                new Cat("kisa", 2),
                new Cat("borik", 5)
        };
        Plate plate = new Plate(10);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        plate.addFood(20);
        cats[2].eat(plate);
        System.out.println(cats[2]);
    }
}
