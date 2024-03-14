package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";

        do {
            if (choice.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = scanner.nextLine();
                outputResult(mathExpression, calculatorOne.calculete(mathExpression));
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            choice = scanner.nextLine();
        } while (!choice.equals("no"));
        System.out.println("Программа завершена. Всего доброго!");
    }

    private static void outputResult(String mathExpression, double result) {
        System.out.print(mathExpression + " = ");
        DecimalFormat format = (result % 1 == 0) ? new DecimalFormat("#") :
                new DecimalFormat("#.###");
        System.out.println(format.format(result));
    }
}