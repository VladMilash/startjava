package com.startjava.lesson_2_3_4.array;

import java.net.SocketOption;

public class ArraysTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        task1();
    }
    public static void task1() {
        int[] arrayNombers = {2, 1 , 3, 5, 4, 6, 7};
        System.out.print("До реверса: ");
        for (int i : arrayNombers) {
            System.out.print(i);
        }
        System.out.print("\nПосле реверса: ");
        for (int i = arrayNombers.length - 1; i >= 0; i--) {
            System.out.print(arrayNombers[i]);
        }
    }
}
