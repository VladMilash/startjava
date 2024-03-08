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
        printArray(reverseNum, true, false, true);
        System.out.print("\nПосле реверса: ");
        printArray(reverseNum, true, true, true);
    }

    public static void calculateFactorial() {
        System.out.println("\n2. Вычисление факториала");
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
        for (int i = 0; i < lenght; i++) {
            originalNum[i] = random.nextDouble();
        }
        System.out.println("Исходный массив:");
        printfArray(originalNum, "%.3f ", 8);

        double middleNum = originalNum[(lenght - 1) / 2];
        int counterZeroedCells = 0;
        for (int i = 0; i < lenght; i++) {
            if (originalNum[i] > middleNum) {
                originalNum[i] = 0;
                counterZeroedCells++;
            }
        }
        System.out.println("\nИзмененный массив:");
        printfArray(originalNum, "%.3f ", 8);

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
        printfArray(uniqueNum, " %s", 10);
    }

    private static void printArray(int[] array, boolean isPrintBracket, boolean isReverseOutput, boolean isPrintComma) {
        int lenght = array.length;
        if (isPrintBracket) {
            System.out.print("[");
        }
        if (!isReverseOutput) {
            for (int i = 0; i < lenght; i++) {
                System.out.print(array[i]);
                if (isPrintComma) {
                    if (i < lenght - 1) {
                        System.out.print(", ");
                    }
                } else {
                    if (i < lenght - 1) {
                        System.out.print(" ");
                    }
                }
            }
        }
        if (isReverseOutput) {
            for (int i = lenght - 1; i >= 0; i--) {
                System.out.print(array[i]);
                if (isPrintComma) {
                    if (i > 0) {
                        System.out.print(", ");
                    }
                } else {
                    if (i > 0) {
                        System.out.print(" ");
                    }
                }
            }
        }
        if (isPrintBracket) {
            System.out.println("]");
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
