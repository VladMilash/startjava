package com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.util.Arrays;

public class ArraysTheme {
    public static void main(String[] args) {
        reverseArray();
        calculateFactorial();
        removeArrayElements();
        printAlphabetStaircase();
        fillUniqueNumbersArray();
    }

    public static void reverseArray() {
        System.out.println("1. Реверс значений массива");
        int[] reverseNum = {2, 1, 3, 5, 4, 6, 7};
        System.out.print("До реверса: ");
        for (int i : reverseNum) {
            System.out.print(i);
        }
        System.out.print("\nПосле реверса: ");
        for (int i = reverseNum.length - 1; i >= 0; i--) {
            System.out.print(reverseNum[i]);
        }
    }

    public static void calculateFactorial() {
        System.out.println("\n\n2. Вычисление факториала");
        int[] calculatedNum = new int[10];
        for (int i = 0; i < calculatedNum.length; i++) {
            calculatedNum[i] = i;
        }
        int factorial = 1;
        for (int i : calculatedNum) {
            if ((i > 0) && (i <= 8)) {
                factorial *= calculatedNum[i];
            }
            System.out.print((i > 0 && i < 8) ? (calculatedNum[i] + " * ")
                    : (i == 8 ? calculatedNum[i] + " = " + factorial : ""));
        }
    }

    public static void removeArrayElements() {
        System.out.println("\n\n3. Удаление элементов массива");
        Random random = new Random();
        double[] originalNum = new double[15];
        int lenght = originalNum.length;
        System.out.println("Исходный массив:");
        for (int i = 0; i < lenght; i++) {
            originalNum[i] = random.nextDouble();
            System.out.printf("%.3f ", originalNum[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println("\nИзмененный массив:");
        double middleNum = originalNum[(lenght - 1) / 2];
        int counterZeroedCells = 0;
        for (int i = 0; i < lenght; i++) {
            if (originalNum[i] > middleNum) {
                originalNum[i] = 0;
                counterZeroedCells++;
            }
            System.out.printf("%.3f ", originalNum[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println("\nКоличество обнуленных ячеек = " + counterZeroedCells);
    }

    public static void printAlphabetStaircase() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] letters = new char[26];
        int lenght = letters.length;
        char firstLatter = 65;
        for (int i = 0; i < lenght; i++) {
            letters[i] = firstLatter;
            firstLatter++;
        }
        int counterLines = 1;
        int counterOutputLetters = 0;
        while (counterLines <= lenght) {
            while (counterOutputLetters != counterLines) {
                for (int i = lenght - 1; counterOutputLetters != counterLines; i--) {
                    System.out.print(letters[i]);
                    counterOutputLetters++;
                }
            }
            System.out.println();
            counterLines++;
            counterOutputLetters = 0;
        }
    }

    public static void fillUniqueNumbersArray() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        Random random = new Random();
        int[] uniqueNum = new int[30];
        int randomNum;
        boolean isUnique;
        for (int i = 0; i < uniqueNum.length; i++) {
            do {
                randomNum = random.nextInt(41) + 60;
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (uniqueNum[j] == randomNum) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            uniqueNum[i] = randomNum;
        }
        Arrays.sort(uniqueNum);
        int counterLines = 0;
        for (int i : uniqueNum) {
            System.out.print(i + " ");
            counterLines++;
            if (counterLines % 10 == 0) {
                System.out.println();
            }
        }
    }
}
