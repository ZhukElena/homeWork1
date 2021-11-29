package ru.geekbrains.homework1;

public class Animal {
    private static Integer count = 0;

    public static Integer getCount() {
        return count;
    }

    public Animal(String name) {
        this.name = name;
       count++;
    }
    private final String name;

    public void run(Integer length) {
        System.out.println(name + " пробежал " + length + " m.");
    }

    public void swim(Integer length) {
        System.out.println(name + " проплыл " + length + " m.");
    }
}