public class Calculator {
    public static void main(String[] args) {
        float a = 10f;
        float b = 2f;
        char sign = '^';
        float result = 0f;
        if ((a > 0) && (b > 0)) {
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
                result = a;
                for (int i = 1; i != b; i++) {
                    result *= a;
                } 
            } 
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }    
    }
}