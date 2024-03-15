package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculete(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        if (elements.length != 3) {
            System.out.println("Ошибка: между цифрами и математическим знаком должен быть пробел");
            return Double.NaN;
        }
        int a = Integer.parseInt(elements[0]);
        int b = Integer.parseInt(elements[elements.length - 1]);
        char sign = elements[1].charAt(0);
        double result;

        switch (sign) {
            case '+':
                return result = a + b;
            case '-':
                return result = a - b;
            case '*':
                return  result = a * b;
            case '/':
                return result = (double) a / b;
            case '%':
                return result = a % b;
            case '^':
                return result = Math.pow(a, b);
            default:
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                return Double.NaN;
        }
    }
}