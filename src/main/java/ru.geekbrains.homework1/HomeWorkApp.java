package ru.geekbrains.homework1;

public class HomeWorkApp {

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Cat cat1 = new Cat("пушок");
        Cat cat2 = new Cat("Рыжик");
        Dog dog = new Dog("Сосиска");
        Dog dog1 = new Dog("Бублик");

        cat.run(1000);
        cat.swim(2);
        dog.run(501);
        dog.swim(5);
        System.out.println(Animal.getCount() + " животных");
        System.out.println(Cat.getCount() + " китиков");
        System.out.println(Dog.getCount() + " собачек");
    }
}
