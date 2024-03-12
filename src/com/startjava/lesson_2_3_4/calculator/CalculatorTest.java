package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = scanner.nextLine();
            calculatorOne.setMathExpression(mathExpression);

            calculatorOne.calculete();
            choice = getUserChoice();

        } while (!choice.equals("no"));
        System.out.println("Программа завершена. Всего доброго!");
    }

    private static String getUserChoice() {
        String choice;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            choice = scanner.nextLine();
            if (choice.equals("yes") || choice.equals("no")) {
                break;
            } else {
                System.out.println("Ведите нужное слово: [yes/no]:");
            }
        }
        return choice;
    }
}