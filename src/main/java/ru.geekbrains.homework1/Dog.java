package ru.geekbrains.homework1;

public class Dog extends Animal {
    private static final Integer MAX_RUN = 500;
    private static final Integer MAX_SWIM = 10;
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
        if (length > MAX_SWIM) {
            super.swim(MAX_SWIM);
        } else {
            super.swim(length);
        }
    }

    public Dog(String name) {
        super(name);
        count++;
    }
}
