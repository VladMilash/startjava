public class Calculator {
    public static void main(String[] args) {
        float number1 = 5f;
        float number2 = 2f;
        float a = number1;
        float b = number2;
        char plus = '+';
        char minus = '-';
        char multiply = '*';
        char divide = '/';
        char exponentiation = '^';
        char divisionModulus = '%';
        char sign = exponentiation;
        float result = 0f;
        if ((a > 0) && (b > 0)) {
            if (sign == plus) {
                result = a + b;
            } else if (sign == minus) {
                result = a - b;
            } else if (sign == multiply) {
                result = a * b;
            } else if (sign == divide) {
                result = a / b;
            } else if (sign == divisionModulus) {
                result = a % b;
            } else if (sign == exponentiation) {
                result = a;
                for (int i = 1; i != b; i++) {
                    result = result * a;
                } 
            } System.out.println(a + " " + sign + " " + b + " = " + result);
        }    
    }
}