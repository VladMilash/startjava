public class Calculator {

    private float a;
    private float b;
    private char sign;
    private float result;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
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
                break;             
        }
        System.out.println(a + " " + sign + " " + b + " " + "=" + " " + result);
    }
    
    public void stop() {
            System.out.println("Программа завершена. Всего доброго!");
        }    
}