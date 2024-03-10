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

    private static void reverseArray() {
        System.out.println("1. Реверс значений массива");
        int[] integers = {2, 1, 3, 5, 4, 6, 7};
        System.out.print("До реверса: ");
        printArray(integers);

        int leftIndex = 0;
        int rightIndex = integers.length - 1;
        while (leftIndex < rightIndex) {
            int temp = integers[leftIndex];
            integers[leftIndex] = integers[rightIndex];
            integers[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        System.out.print("\nПосле реверса: ");
        printArray(integers);
    }

    private static void calculateFactorial() {
        System.out.println("\n\n2. Вычисление факториала");
        int[] integers = new int[10];
        int length = integers.length;
        for (int i = 0; i < length; i++) {
            integers[i] = i;
        }
        int factorial = 1;
        for (int i = 1; i <= length-2; i++) {
            factorial *= i;
            System.out.print(integers[i]);
            System.out.print(i < length - 2 ? " * " : " = " + factorial);
        }
    }

    private static void removeArrayElements() {
        System.out.println("\n\n3. Удаление элементов массива");
        Random random = new Random();
        double[] originalNums = new double[15];
        int lenght = originalNums.length;
        for (int i = 0; i < lenght; i++) {
            originalNums[i] = random.nextDouble();
        }
        System.out.println("Исходный массив:");
        printfArray(originalNums, "%.3f ", 8);

        double middleNum = originalNums[(lenght - 1) / 2];
        int counterZeroedCells = 0;
        for (int i = 0; i < lenght; i++) {
            if (originalNums[i] > middleNum) {
                originalNums[i] = 0;
                counterZeroedCells++;
            }
        }
        System.out.println("\nИзмененный массив:");
        printfArray(originalNums, "%.3f ", 8);

        System.out.println("\nКоличество обнуленных ячеек = " + counterZeroedCells);
    }

    private static void printAlphabetStaircase() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] alphabetLetters = new char[26];
        int lenght = alphabetLetters.length;
        for (int i = 0; i < lenght; i++) {
            alphabetLetters[i] = (char) ('A' + i);
        }
        int counterLines = 1;
        int counterOutputLetters = 0;
        while (counterLines <= lenght) {
            while (counterOutputLetters != counterLines) {
                for (int i = lenght - 1; counterOutputLetters != counterLines; i--) {
                    System.out.print(alphabetLetters[i]);
                    counterOutputLetters++;
                }
            }
            System.out.println();
            counterLines++;
            counterOutputLetters = 0;
        }
    }

    private static void fillUniqueNumbersArray() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        Random random = new Random();
        int[] uniqueNums = new int[30];
        int randomNum;
        boolean isUnique;
        for (int i = 0; i < uniqueNums.length; i++) {
            do {
                randomNum = random.nextInt(41) + 60;
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (uniqueNums[j] == randomNum) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            uniqueNums[i] = randomNum;
        }
        Arrays.sort(uniqueNums);
        printfArray(uniqueNums, " %s", 10);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    private static void printfArray(double[] array, String format, int printLineElements) {
        int counterOutputElements = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.printf(format, array[i]);
            counterOutputElements++;
            if (counterOutputElements % printLineElements == 0) {
                System.out.println();
            }
        }
    }

    private static void printfArray(int[] array, String format, int printLineElements) {
        int counterOutputElements = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.printf(format, array[i]);
            counterOutputElements++;
            if (counterOutputElements % printLineElements == 0) {
                System.out.println();
            }
        }
    }
}
