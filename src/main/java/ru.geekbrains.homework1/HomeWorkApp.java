package ru.geekbrains.homework1;

import javax.swing.*;

public class HomeWorkApp {
    public static void main(String[] args) {
        //1
        invertArray();
        //2
        fillArray();
        //3
        changeArray();
        //4
        fillDiagonal();
        //5
        int arr[] = initArray(4, 4);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();


    }

    //1
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i : arr) {
            i = i == 0 ? 1 : 0;
            System.out.print(i);
        }
        System.out.println("\n");
    }

    //2
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(i + "=" + arr[i]);
        }

    }

    //3
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i : arr) {
            if (i <= 6) {
                i *= 2;
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    //4
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    //5
    public static int[] initArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i : arr) {
            i = initialValue;
        }
        return arr;
    }
}
