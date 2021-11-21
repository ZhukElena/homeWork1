package ru.geekbrains.homework1;

import java.util.Scanner;

public class HomeWorkApp {
    public static final char EMPTY_FIELD = '·';

    public static void main(String[] args) {
        char[][] arr = createField(3);
        drawField(arr);
        while (true) {
            arr = makeTurn(arr, 'X');
            drawField(arr);
            if (checkWin(arr, 'X')) {
                System.out.println("Выиграл Х");
                break;
            }
            if (checkDraw(arr)){
                System.out.println("Ничья");
                break;
            }
            arr = makeTurn(arr, '0');
            drawField(arr);
            if (checkWin(arr, '0')) {
                System.out.println("Выиграл 0");
                break;
            }
            if (checkDraw(arr)){
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static boolean checkWin(char[][] arr, char player) {
        //горизонтальная проверка
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != player) {
                    break;
                } else if (j == arr[i].length - 1) {
                    return true;
                }
            }
        }

        //вертикальная проверка
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[0][j] == player) {
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i][j] != player) {
                        break;
                    } else if (i == arr.length - 1) {
                        return true;
                    }
                }
            }
        }

        //диагональная проверка
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] != player) {
                break;
            } else if (i == arr.length - 1) {
                return true;
            }
        }


        //проверка обратной диагонали
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][arr.length - i - 1] != player) {
                break;
            } else if (i == arr.length - 1) {
                return true;
            }
        }

        return false;
    }

    public static boolean checkDraw(char[][] arr) {
        for (char[] chars : arr) {
            for (char aChar : chars) {
                if (aChar == EMPTY_FIELD) {
                    return false;
                }
            }
        }
        return true;
    }

    public static char[][] makeTurn(char[][] arr, char player) {
        while (true) {
            System.out.println("Вы играете за " + player);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите координату 'i'");
            int i = scanner.nextInt() - 1;
            System.out.println("Введите координату 'j'");
            int j = scanner.nextInt() - 1;

            if (i > arr.length || j > arr.length) {
                System.out.println("Вы ввели неверно! Гляньте на размер поля");
                continue;
            }

            if (arr[i][j] != EMPTY_FIELD) {
                System.out.println("Поле занято, выберете другое");
                continue;
            }

            arr[i][j] = player;
            return arr;
        }
    }

    public static void drawField(char[][] arr) {
        for (char[] chars : arr) {
            for (char aChar : chars) {
                System.out.print(aChar + "|");
            }
            System.out.println();
            for (int i = 0; i < arr.length * 2; i++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }


    public static char[][] createField(int size) {
        char[][] arr = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = EMPTY_FIELD;
            }
        }
        return arr;
    }
}
