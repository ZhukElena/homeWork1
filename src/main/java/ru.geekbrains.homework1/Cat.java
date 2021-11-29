package ru.geekbrains.homework1;

public class Cat extends Animal {
    private static final Integer MAX_RUN = 200;
    private static Integer count = 0;

    public static Integer getCount() {
        return count;
    }

    @Override
    public void run(Integer length) {
        if (length > MAX_RUN) {
            super.run(MAX_RUN);
        } else {
            super.run(length);
        }
    }

    @Override
    public void swim(Integer length) {
        System.out.println("Коты не умеют плавать(((");
    }

    public Cat(String name) {
        super(name);
        count++;
    }
}
