package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Введите первое число:");
            int a = scanner.nextInt();
            calculatorOne.setA(a);

            System.out.println("Введите знак математической операции:");
            String input = scanner.next();
            char sign = input.charAt(0);
            calculatorOne.setSign(sign);

            System.out.println("Введите второе число:");
            int b = scanner.nextInt();
            calculatorOne.setB(b);

            calculatorOne.calculete();
        
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            choice = scanner.next();
            while(!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("Ведите нужное слово: [yes/no]:");
                choice = scanner.next();
            }
        } while(!choice.equals("no"));
        
        System.out.println("Программа завершена. Всего доброго!");
    }
}