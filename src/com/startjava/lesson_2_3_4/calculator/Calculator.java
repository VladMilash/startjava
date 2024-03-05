package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int a;
    private int b;
    private char sign;
    private int result;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculete() {
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;       
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }   
                break;
            default:
                System.out.println("Ошибка: недопустимый знак операции.");
                return;             
        }
        System.out.println(a + " " + sign + " " + b + " " + "=" + " " + result);
    }
}