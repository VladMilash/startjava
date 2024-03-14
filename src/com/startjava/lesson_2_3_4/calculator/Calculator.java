package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;

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

        if ((sign != '+') && (sign != '-') && (sign != '*') && (sign != '/') && (sign != '%') && (sign != '^')) {
            System.out.println("Ошибка: неверный математический знак");
            return Double.NaN;
        }

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
                return Double.NaN;
        }

        System.out.print(a + " " + sign + " " + b + " = ");
        if (result % 1 == 0) {
            DecimalFormat format1 = new DecimalFormat("#");
            System.out.println(format1.format(result));
        } else {
            DecimalFormat format2 = new DecimalFormat("#.###");
            System.out.println(format2.format(result));
        }
        return result;
    }
}