public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMan = true;
        if (!isMan) {
            System.out.println("Вы женского пола");
        } else {
            System.out.println("Вы мужского пола");
        } 
        int age = 18;
        if (age > 18) {
            System.out.println("Вам больше 18 лет");
        } else {
            System.out.println("Вам меньше или 18 лет");       
        }
        double height = 3.5;
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
            System.out.println("Первая буква вашего имени не M и не I");
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 10;
        int b = 5;
        System.out.println("Первое число: " + a + ", второе число: " + b);
        if (a > b) {
            System.out.println(a + " больше " + b);
        } else if (a < b) {
            System.out.println(a + " меньше " + b);
        } else {
            System.out.println(a +" равно " + b);
        }

        System.out.println("\n3. Проверка числа");
        a = -11;
        System.out.print(a);
        if (a == 0) {
            System.out.println(" является нулем");
        } else if (a > 0) {
            System.out.print(" является положительным");
        } else {
            System.out.print(" является отрицательным");
        } if ((a % 2 == 0) && (a != 0)) {
            System.out.println(" и четным");
        } else {
            System.out.println(" и нечетным");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        a = 333;
        b = 111;
        int aDigit1 = a / 100;
        int aDigit2 = (a % 100)/10;
        int aDigit3 = a % 10;
        int bDigit1 = b / 100;
        int bDigit2 = (b % 100)/10;
        int bDigit3 = b % 10;
        System.out.print("Числа: " + a + ", " + b);
        if ((aDigit1 != bDigit1) && (aDigit2 != bDigit2) && (aDigit3 != bDigit3)) {
            System.out.println(" не имеют одинковых цифр");
        } else {
            System.out.print(" имеют одинковые цифры: ");
        }
        if ((aDigit1 == bDigit1) && (aDigit2 == bDigit2) && (aDigit3 == bDigit3)) {
            System.out.print(aDigit1 + 
                    ", " + aDigit2 + ", " + aDigit3 + " номера разрядов: 1, 2, 3");
        } else if ((aDigit1 == bDigit1) && (aDigit2 == bDigit2)) {
            System.out.print(aDigit1 + ", " + aDigit2 + " номера разрядов: 1, 2");
        }  else if ((aDigit1 == bDigit1) && (aDigit3 == bDigit3)) {
            System.out.print(aDigit1 + ", " + aDigit3 + " номера разрядов: 1, 3");
        } else if ((aDigit2 == bDigit2) && (aDigit3 == bDigit3)) {
            System.out.print(aDigit2 + ", " + aDigit3 + " номера разрядов: 2, 3");
        } else if (aDigit1 == bDigit1) {
            System.out.print(aDigit1 + ", " + aDigit1 + " номер разрядa: 1");
        } else if (aDigit2 == bDigit2) {
             System.out.print(aDigit2 + ", " + aDigit2 + " номер разрядa: 2");
        } else if (aDigit3 == bDigit3) {
             System.out.print(aDigit3 + ", " + aDigit3 + " номер разрядa: 3");
        }

        System.out.println("\n5. Определение символа по коду");
        char symbol = '\u0057';
        System.out.print("Символ: " + symbol);
        if ((symbol == 'a') || (symbol == 'b') || (symbol == 'c') || (symbol == 'd') || 
            (symbol == 'e') || (symbol == 'f') || (symbol == 'g') || (symbol == 'h') || 
            (symbol == 'i') || (symbol == 'j') || (symbol == 'k') || (symbol == 'l') || 
            (symbol == 'm') || (symbol == 'n') || (symbol == 'o') || (symbol == 'p') || 
            (symbol == 'q') || (symbol == 'r') || (symbol == 's') || 
            (symbol == 't') || (symbol == 'u') || (symbol == 'v') || (symbol == 'w') || 
            (symbol == 'x') || (symbol == 'y') || (symbol == 'z')) {
            System.out.println(" является маленькой буквой");
        } else if ((symbol == 'A') || (symbol == 'B') || (symbol == 'C') || (symbol == 'D') 
            || (symbol == 'E') || (symbol == 'F') || (symbol == 'G') || (symbol == 'H') || 
            (symbol == 'I') || (symbol == 'J') || (symbol == 'K') || (symbol == 'L') || 
            (symbol == 'M') || (symbol == 'N') || (symbol == 'O') || (symbol == 'P') || 
            (symbol == 'Q') || (symbol == 'R') || (symbol == 'S') || 
            (symbol == 'T') || (symbol == 'U') || (symbol == 'V') || (symbol == 'W') || 
            (symbol == 'X') || (symbol == 'Y') || (symbol == 'Z')) {
            System.out.println(" является большой буквой");
        } else if ((symbol == '0') || (symbol == '1') || (symbol == '2') || (symbol == '3') 
            || (symbol == '4') || (symbol == '5') || (symbol == '6') || (symbol == '7') || 
            (symbol == '8') || (symbol == '9')) {
                System.out.println(" является цифрой");
            } else {
                System.out.println(" не буква и не цифра");
            }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301000;
        int sumPercent;
        int totalSum;
        if (deposit < 100000) {
            totalSum = (deposit * 105) / 100;
            sumPercent = totalSum - deposit;
        } else if ((deposit >= 100000) && (deposit <= 300000)) {
            totalSum = (deposit * 107) / 100;
            sumPercent = totalSum - deposit;
        } else {
            totalSum = (deposit * 110) / 100;
            sumPercent = totalSum - deposit;
        }
        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Сумма начисленного %: " + sumPercent);
        System.out.println("Итоговая сумма с %: " + totalSum);

        System.out.println("\n7. Определение оценки по предметам");
        float historyPercent  = 59f;
        float programmingPercent = 92f;
        float everagePercent = (historyPercent + programmingPercent) / 2;
        float assessmentHistory;
        float assessmentProgramming;
        if (historyPercent <= 60) {
            assessmentHistory = 2;
        } else if ((historyPercent > 60) && (historyPercent <= 73)) {
            assessmentHistory = 3;
        } else if ((historyPercent > 73) && (historyPercent <= 91)) {
            assessmentHistory= 4;
        } else {
            assessmentHistory = 5;
        }
        if (programmingPercent <= 60) {
            assessmentProgramming = 2;
        } else if ((programmingPercent > 60) && (programmingPercent <= 73)) {
            assessmentProgramming = 3;
        } else if ((programmingPercent > 73) && (programmingPercent <= 91)) {
            assessmentProgramming = 4;
        } else {
            assessmentProgramming = 5;
        }
        float everageEstimation = (assessmentHistory +  assessmentProgramming) / 2;
        System.out.println("История: " + assessmentHistory);
        System.out.println("Программирование: " + assessmentProgramming);
        System.out.println("Средний балл оценок по предметам: " + everageEstimation);
        System.out.println("Средний % по предметам: " + everagePercent);
        
        System.out.println("\n8. Рассчет годовой прибыли");
        int monthlyProfit = 13000;
        int monthlyCostRent = 5000;
        int monthlyCostProduction = 9000;
        int annualProfit = monthlyProfit * 12;
        int annualCostRent = monthlyCostRent * 12;
        int annualCostProduction = monthlyCostProduction * 12;
        int totalAnnualProfit = annualProfit - annualCostRent - annualCostProduction;
        if (totalAnnualProfit > 0) {
            System.out.println("Чистая прибыль за год: " + "+" + totalAnnualProfit + " руб.");
        } else {
            System.out.println("Чистая прибыль за год: " + totalAnnualProfit + " руб.");
        }
    }

}