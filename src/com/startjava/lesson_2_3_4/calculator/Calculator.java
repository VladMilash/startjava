package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;


public class Calculator {
    private String mathExpression;

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public void calculete() {
        String[] mathExpressionArray;
        mathExpressionArray = mathExpression.split(" ");
        if (mathExpressionArray.length != 3) {
            System.out.println("Ошибка: между цифрами и математическим знаком должен быть пробел");
            return;
        }
        int a = Integer.parseInt(mathExpressionArray[0]);
        int b = Integer.parseInt(mathExpressionArray[mathExpressionArray.length - 1]);
        char sign = mathExpressionArray[1].charAt(0);
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
                return;
        }

        System.out.print(a + " " + sign + " " + b + " = ");
        if (result % 1 == 0) {
            DecimalFormat format1 = new DecimalFormat("#");
            System.out.println(format1.format(result));
        } else {
            DecimalFormat format2 = new DecimalFormat("#.###");
            System.out.println(format2.format(result));
        }
    }
}