import java.util.Scanner;
public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Введите первое число:");
            float a = scanner.nextFloat();
            System.out.println("Введите знак математической операции:");
            String input = scanner.next();
            char sign = input.charAt(0);
            System.out.println("Введите второе число:");
            float b = scanner.nextFloat();

            calculatorOne.setA(a);
            calculatorOne.setSign(sign);
            calculatorOne.setB(b);

            calculatorOne.calculete();
        
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            choice = scanner.next();
            while(!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("Ведите нужное слово: [yes/no]:");
                choice = scanner.next();
            }
        } while(!choice.equals("no"));
        
        calculatorOne.stop();
    }
}