package ru.geekbrains.homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        //1
        if (sum(3, 7)) {
            System.out.println("sum >= 10 && sum <= 20");
        } else {
            System.out.println("!sum >= 10 && sum <= 20");
        }

        //2
        number(7);

        //3
        if (comparison(-3)) {
            System.out.println("отрицательное");
        } else {
            System.out.println("положительное");
        }

        //4
        line("понял", 3);
    }

    //1
    public static boolean sum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    //2
    public static void number(int a) {
        if (a % 2 == 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //3
    public static boolean comparison(int a) {
        return a < 0;
    }

    //4
    public static void line(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
}

