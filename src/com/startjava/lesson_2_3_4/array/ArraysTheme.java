package com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.util.Arrays;

public class ArraysTheme {
    public static void main(String[] args) {
        reverseArray();
        calculateFactorial();
        removeArrayElements();
        printAlphabetStaircase();
        fillArrayUniqueNums();
    }

    private static void reverseArray() {
        System.out.println("1. Реверс значений массива");
        int[] integers = {2, 1, 3, 5, 4, 6, 7};
        System.out.print("До реверса: ");
        printArray(integers);

        int length = integers.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = integers[i];
            integers[i] = integers[length - 1 - i];
            integers[length - 1 - i] = temp;
        }

        System.out.print("После реверса: ");
        printArray(integers);
    }

    private static void calculateFactorial() {
        System.out.println("\n2. Вычисление факториала");
        int[] multipliers = new int[10];
        int length = multipliers.length;
        for (int i = 0; i < length; i++) {
            multipliers[i] = i;
        }
        int factorial = 1;
        for (int i = 1; i < length - 1; i++) {
            factorial *= i;
            System.out.print(multipliers[i]);
            System.out.print(i < length - 2 ? " * " : " = " + factorial);
        }
    }

    private static void removeArrayElements() {
        System.out.println("\n\n3. Удаление элементов массива");
        Random random = new Random();
        double[] randomNums = new double[15];
        int lenght = randomNums.length;
        for (int i = 0; i < lenght; i++) {
            randomNums[i] = random.nextDouble();
        }
        System.out.println("Исходный массив:");
        printfArray(randomNums, "%.3f ", 8);

        double middleNum = randomNums[(lenght - 1) / 2];
        int counterZeroedCells = 0;
        for (int i = 0; i < lenght; i++) {
            if (randomNums[i] > middleNum) {
                randomNums[i] = 0;
                counterZeroedCells++;
            }
        }
        System.out.println("\nИзмененный массив:");
        printfArray(randomNums, "%.3f ", 8);

        System.out.println("\nКоличество обнуленных ячеек = " + counterZeroedCells);
    }

    private static void printAlphabetStaircase() {
        System.out.print("\n4. Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        int lenght = alphabet.length;
        for (int i = 0; i < lenght; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = 0; i <= lenght; i++) {
            for (int j = lenght - 1; j >= lenght - i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    private static void fillArrayUniqueNums() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        Random random = new Random();
        int[] uniqueNums = new int[30];
        int randomNum;
        boolean isUnique;
        for (int i = 0; i < uniqueNums.length; i++) {
            do {
                randomNum = random.nextInt(41) + 59;
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
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i <= array.length-2) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
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
