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
                result = (double) a + b;
                break;
            case '-':
                result = (double) a - b;
                break;
            case '*':
                result = (double) a * b;
                break;
            case '/':
                result = (double) a / b;
                break;
            case '%':
                result = (double) a % b;
                break;
            case '^':
                result = (double) Math.pow(a, b);
                break;
            default:
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                return Double.NaN;
        }
        return result;
    }
}