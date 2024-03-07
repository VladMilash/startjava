package com.startjava.lesson_2_3_4.array;

import java.net.SocketOption;
import java.util.Random;
import java.util.Arrays;

public class ArraysTheme {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("1. Реверс значений массива");
        int[] arrayNum = {2, 1, 3, 5, 4, 6, 7};
        System.out.print("До реверса: ");
        for (int i : arrayNum) {
            System.out.print(i);
        }
        System.out.print("\nПосле реверса: ");
        for (int i = arrayNum.length - 1; i >= 0; i--) {
            System.out.print(arrayNum[i]);
        }
    }

    public static void task2() {
        System.out.println("\n\n2. Вычисление факториала");
        int[] arrayNum = new int[10];
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = i;
        }
        int factorial = 1;
        for (int i : arrayNum) {
            if ((i > 0) && (i <= 8)) {
                factorial *= arrayNum[i];
            }
            System.out.print((i > 0 && i < 8) ? (arrayNum[i] + " * ")
                    : (i == 8 ? arrayNum[i] + " = " + factorial : ""));
        }
    }

    public static void task3() {
        System.out.println("\n\n3. Удаление элементов массива");
        Random random = new Random();
        double[] arrayNum = new double[15];
        int lenght = arrayNum.length;
        System.out.println("Исходный массив:");
        for (int i = 0; i < lenght; i++) {
            arrayNum[i] = random.nextDouble();
            System.out.printf("%.3f ", arrayNum[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println("\nИзмененный массив:");
        double middleСell = arrayNum[(lenght - 1) / 2];
        int counterZeroedCells = 0;
        for (int i = 0; i < lenght; i++) {
            if (arrayNum[i] > middleСell) {
                arrayNum[i] = 0;
                counterZeroedCells++;
            }
            System.out.printf("%.3f ", arrayNum[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println("\nКоличество обнуленных ячеек = " + counterZeroedCells);
    }

    public static void task4() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] arrayLetters = new char[26];
        int lenght = arrayLetters.length;
        char firstLatter = 65;
        for (int i = 0; i < lenght; i++) {
            arrayLetters[i] = firstLatter;
            firstLatter++;
        }
        int counterLines = 1;
        int counterOutputLetters = 0;
        while (counterLines <= lenght) {
            while (counterOutputLetters != counterLines) {
                for (int i = lenght - 1; counterOutputLetters != counterLines; i--) {
                    System.out.print(arrayLetters[i]);
                    counterOutputLetters++;
                }
            }
            System.out.println();
            counterLines++;
            counterOutputLetters = 0;
        }
    }

    public static void task5() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        Random random = new Random();
        int[] arrayNum = new int[30];
        int randomNum;
        boolean isUnique;
        for (int i = 0; i < arrayNum.length; i++) {
            do {
                randomNum = random.nextInt(41) + 60;
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (arrayNum[j] == randomNum) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            arrayNum[i] = randomNum;
        }
        Arrays.sort(arrayNum);
        int counterLines = 0;
        for (int i : arrayNum) {
            System.out.print(i + " ");
            counterLines++;
            if (counterLines % 10 == 0) {
                System.out.println();
            }
        }

    }

}
