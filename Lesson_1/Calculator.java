public class Calculator {
    public static void main(String[] args) {
        float a = 2f;
        float b = 10f;
        char sign = '^';
        float result = 0f;
            if (sign == '+') {
                result = a + b;
            } else if (sign == '-') {
                result = a - b;
            } else if (sign == '*') {
                result = a * b;
            } else if (sign == '/') {
                result = a / b;
            } else if (sign == '%') {
                result = a % b;
            } else if (sign == '^') {
                result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                } 
            } 
            System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}