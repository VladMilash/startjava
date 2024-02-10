public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int vlad = 10;
        boolean isMan = vlad - 10 == 0;
        if (!isMan) {
            System.out.println("Вы женского пола");
        } else {
            System.out.println("Вы мужского пола");
        }

        int yeaOfBirth = 2000;
        int currentYear = 2024;
        int age = currentYear - yeaOfBirth;
        if (age > 18) {
            System.out.println("Вам больше 18 лет");
        } else {
            System.out.println("Вам меньше или равно 18 лет");       
        }

        float doorHeight = 2.5f;
        float distance = 1.2f;
        float height = doorHeight - distance;
        if (height < 1.8) {
            System.out.println("Ваш рoст ниже среднего");
        } else {
            System.out.println("У вас достаточно высокий рост");
        }

        String name = "Vlad";
        char firstNameLetter = name.charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("Первая буква вашего имени: M");
        } else if(firstNameLetter == 'I') {
            System.out.println("Первая буква вашего имени: I");
        } else {
            System.out.println("У вас красивое имя");
        }

        System.out.println("\n2. Поиск большего числа");
        int number1 = 10;
        int number2 = 5;
        System.out.println("Первое число: " + number1 + " Второе число: " + number2);
        if (number1 > number2) {
            System.out.println(number1 + " больше " + number2);
        } else if (number1 < number2) {
            System.out.println(number1 + " меньше " + number2);
        } else {
            System.out.println(number1 +" равно " + number2);
        }

        System.out.println("\n3. Проверка числа");
        int number3 = 0;
        if (number3 == 0) {
            System.out.println(number3 + " является нулем");
        } 
        if (number3 > 0) {
            System.out.print(number3 + " является положительным");
        } else if (number3 < 0) {
            System.out.print(number3 + " является отрицательным");
        } if (number3 % 2 == 1) {
            System.out.println(" и нечетным");
        } else if ((number3 % 2 == 0) && (number3 != 0)) {
            System.out.println(" и четным");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах"); 
        int a = 123;
        int b = 223;
        int digit1Ofa = a / 100;
        int digit2Ofa = a % 100/10;
        int digit3Ofa = a % 10;
        int digit1Ofb = b / 100;
        int digit2Ofb = b % 100/10;
        int digit3Ofb = b % 10;
        if ((digit1Ofa != digit1Ofb) && (digit2Ofa != digit2Ofb) && (digit3Ofa != digit3Ofb)) {
            System.out.println("В данных числах нет одинаковых цифр в разрядах");
        } else if ((digit1Ofa == digit1Ofb) && (digit2Ofa == digit2Ofb) && 
            (digit3Ofa == digit3Ofb)) {
            System.out.println("Исходные числа: " + a + " " + b);
            System.out.println("Одинаковые цмфры: " + digit1Ofa + " " + digit1Ofb + " " 
                + digit2Ofa + " " + digit2Ofb + " " + digit3Ofa + " " + digit3Ofb);
            System.out.println("Номер их разрядов: 1, 2, 3");
        } else if ((digit2Ofa == digit2Ofb) && (digit3Ofa == digit3Ofb)){
            System.out.println("Исходные числа: " + a + " " + b);
            System.out.println("Одинаковые в них цифры: " + digit2Ofa + " " + digit2Ofb + " " 
                + digit3Ofa + " " + digit3Ofb);
            System.out.println("Номер их разрядов: 2, 3");
        } else if ((digit1Ofa == digit1Ofb) && (digit2Ofa == digit2Ofb)) {
            System.out.println("Исходные числа: " + a + " " + b);
            System.out.println("Одинаковые в них цифры: " + digit1Ofa + " " 
                + digit1Ofb + " " + digit2Ofa + " " + digit2Ofb);
            System.out.println("Номер их разрядов: 1, 2");
        } else if ((digit1Ofa == digit1Ofb) && (digit3Ofa == digit3Ofb)) {
            System.out.println("Исходные числа: " + a + " " + b);
            System.out.println("Одинаковые в них цифры: " + digit1Ofa + " " 
                + digit1Ofb + " " + digit3Ofa + " " + digit3Ofb);
            System.out.println("Номер их разрядов: 1, 3");
        } else if (digit1Ofa == digit1Ofb) {
            System.out.println("Исходные числа: " + a + " " + b);
            System.out.println("Одинаковые в них цифры: " + digit1Ofa + " " + digit1Ofb);
            System.out.println("Номер их разрядов: 1");
        } else if (digit2Ofa == digit2Ofb) {
            System.out.println("Исходные числа: " + a + " " + b);
            System.out.println("Одинаковые в них цифры: " + digit2Ofa + " " + digit2Ofb);
            System.out.println("Номер их разрядов: 2");
        } else if (digit3Ofa == digit3Ofb) {
            System.out.println("Исходные числа: " + a + " " + b);
            System.out.println("Одинаковые в них цифры: " + digit3Ofa + " " + digit3Ofb);
            System.out.println("Номер их разрядов: 3");
          }

         System.out.println("\n5. Определиние символа по коду");
         char symbol = '\u0057';
         if ((symbol == 'a') || (symbol == 'b') || (symbol == 'c') || (symbol == 'd') || 
            (symbol == 'e') || (symbol == 'f') || (symbol == 'g') || (symbol == 'h') || 
            (symbol == 'i') || (symbol == 'j') || (symbol == 'k') || (symbol == 'l') || 
            (symbol == 'm') || (symbol == 'n') || (symbol == 'o') || (symbol == 'p') || 
            (symbol == 'q') || (symbol == 'r') || (symbol == 's') || 
            (symbol == 't') || (symbol == 'u') || (symbol == 'v') || (symbol == 'w') || 
            (symbol == 'x') || (symbol == 'y') || (symbol == 'z')) {
            System.out.println("Символ: " + symbol + " " + "является маленькой буквой");
         } else if ((symbol == 'A') || (symbol == 'B') || (symbol == 'C') || (symbol == 'D') 
            || (symbol == 'E') || (symbol == 'F') || (symbol == 'G') || (symbol == 'H') || 
            (symbol == 'I') || (symbol == 'J') || (symbol == 'K') || (symbol == 'L') || 
            (symbol == 'M') || (symbol == 'N') || (symbol == 'O') || (symbol == 'P') || 
            (symbol == 'Q') || (symbol == 'R') || (symbol == 'S') || 
            (symbol == 'T') || (symbol == 'U') || (symbol == 'V') || (symbol == 'W') || 
            (symbol == 'X') || (symbol == 'Y') || (symbol == 'Z')) {
            System.out.println("Символ: " + symbol + " " + "является большой буквой");
         } else if ((symbol == '0') || (symbol == '1') || (symbol == '2') || (symbol == '3') 
            || (symbol == '4') || (symbol == '5') || (symbol == '6') || (symbol == '7') || 
            (symbol == '8') || (symbol == '9')) {
                System.out.println("Символ: " + symbol + " " + "является цифрой");
            } else {
                System.out.println("Символ: " + symbol + " " + "не буква и не цифра");
            }
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
         int deposit = 400000;
         if (deposit < 100000) {
            int sumPercentPlusDeposit = deposit * 105 / 100;
            int sumPercent = sumPercentPlusDeposit - deposit;
            System.out.println("Сумма вклада: " + deposit);
            System.out.println("Сумма начисленного %: " + sumPercent);
            System.out.println("Итоговая сумма с %: " + sumPercentPlusDeposit);
         } else if ((deposit >= 100000) && (deposit <= 300000)) {
            int sumPercentPlusDeposit1 = deposit * 107 / 100;
            int sumPercent1 = sumPercentPlusDeposit1 - deposit;
            System.out.println("Сумма вклада: " + deposit);
            System.out.println("Сумма начисленного %: " + sumPercent1);
            System.out.println("Итоговая сумма с %: " + sumPercentPlusDeposit1);
         } else if (deposit > 300000) {
            int sumPercentPlusDeposit2 = deposit * 110 / 100;
            int sumPercent2 = sumPercentPlusDeposit2 - deposit;
            System.out.println("Сумма вклада: " + deposit);
            System.out.println("Сумма начисленного %: " + sumPercent2);
            System.out.println("Итоговая сумма с %: " + sumPercentPlusDeposit2);
         }
        System.out.println("\n7. Определиние оценки по предметам");
         float estimation1 = 59f;
         float estimation2 = 92f;
         float everagePercent = (estimation1 + estimation2) / 2;
         System.out.println("Cредний % по предметам: " + everagePercent);
         if (estimation1 <= 60) {
            estimation1 = 2;
            System.out.println("Оценка по историиж: " + estimation1);
         } else if ((estimation1 > 60) && (estimation1 <= 73)) {
            estimation1 = 3;
            System.out.println("Оценка по историиж: " + estimation1);
         } else if ((estimation1 > 73) && (estimation1 <= 91)) {
            estimation1 = 4;
            System.out.println("Оценка по историиж: " + estimation1);
         } else if (estimation1 > 91) {
            estimation1 = 5;
            System.out.println("Оценка по историиж: " + estimation1);
         }
         if (estimation2 <= 60) {
            estimation2 = 2;
            System.out.println("Оценка по программированию: " + estimation2);
         } else if ((estimation2 > 60) && (estimation2 <= 73)) {
            estimation2 = 3;
            System.out.println("Оценка по программированию: " + estimation2);
         } else if ((estimation2 > 73) && (estimation2 <= 91)) {
            estimation2 = 4;
            System.out.println("Оценка по программированию: " + estimation2);
         } else if (estimation2 > 91) {
            estimation2 = 5;
            System.out.println("Оценка по программированию: " + estimation2);
         }
         float everageScoreEstimation = (estimation1 + estimation2) / 2;
         System.out.println("Средний балл оценок по предметам: " + everageScoreEstimation);
        
        System.out.println("\n8. Рассчет годовой прибыли");
        int monthlyProfit = 13000;
        int monthlyCostRent = 5000;
        int monthlyCostProduction = 9000;
        int annualProfit = monthlyProfit * 12;
        int annualCostRent = monthlyCostRent * 12;
        int annualCostProduction = monthlyCostProduction * 12;
        int totalAnnualProfit = annualProfit - annualCostRent - annualCostProduction;
        if (totalAnnualProfit == 0) {
            System.out.println("Прибыль за год: " + totalAnnualProfit + " руб.");
        } else if (totalAnnualProfit > 0) {
            System.out.println("Чистая прибыль за год: " + "+" + totalAnnualProfit + " руб.");
        } else {
            System.out.println("Чистая прибыль за год: " + totalAnnualProfit + " руб.");
        }

    }

}