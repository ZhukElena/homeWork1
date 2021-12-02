package ru.geekbrains.homework1;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isHungry=" + isHungry +
                '}';
    }

    public void eat(Plate plate) {
        this.isHungry = !plate.decreaseFood(appetite);
    }
}
