package com.startjava.lesson_1.base;

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
            System.out.println(a + " равно " + b);
        }

        System.out.println("\n3. Проверка числа");
        a = 4;
        System.out.print(a + " является ");
        if (a == 0) {
            System.out.print(" нулем");
        } else {
            if (a > 0) {
                System.out.print("положительным");
            } else {
                System.out.print("отрицательным");
            }    
            if (a % 2 == 0) {
                System.out.print(" и четным");
            } else {
                System.out.print(" и нечетным");
            }
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах");
        a = 111;
        b = 111;
        int aHundreds = a / 100;
        int aTens = (a % 100) / 10;
        int aOnes = a % 10;
        int bHundreds = b / 100;
        int bTens = (b % 100) / 10;
        int bOnes = b % 10;
        System.out.print("Числа: " + a + ", " + b);
        if ((aHundreds != bHundreds) && (aTens != bTens) && (aOnes != bOnes)) {
            System.out.print(" не имеют одинаковых цифр");
        } else {
            System.out.println(" имеют одинаковые цифры: ");
            if (aHundreds == bHundreds) {
                System.out.println(aHundreds + " разряд-1 ");
            }
            if (aTens == bTens) {
                System.out.println(aTens + " разряд-2 ");
            }
            if (aOnes == bOnes) {
                System.out.println(aOnes + " разряд-3 ");
            }
        }

        System.out.println("\n5. Определение символа по коду");
        char symbol = '\u0057';
        System.out.print("Символ: " + symbol);
        if ((symbol >= 'a') && (symbol <= 'z')) {
            System.out.println(" является маленькой буквой");
        } else if ((symbol >= 'W') && (symbol <= 'Z')) {
            System.out.println(" является большой буквой");
        } else if ((symbol >= '0') && (symbol <= '9')) {
            System.out.println(" является цифрой");
        } else {
            System.out.println(" не буква и не цифра");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301000;
        int payoutPercent = 5;
        if ((deposit >= 100000) && (deposit <= 300000)) {
            payoutPercent = 7;
        } else if (deposit > 300000) {
            payoutPercent = 10;
        }
        int totalSum = deposit + (deposit / 100 * payoutPercent);
        int sumPercent = totalSum - deposit;
        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Сумма начисленного %: " + sumPercent);
        System.out.println("Итоговая сумма с %: " + totalSum);

        System.out.println("\n7. Определение оценки по предметам");
        float historyPercent  = 59f;
        float historyGrade = 2;
        if ((historyPercent > 60) && (historyPercent <= 73)) {
            historyGrade = 3;
        } else if ((historyPercent > 73) && (historyPercent <= 91)) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }
        float programmingPercent = 92f;
        float programmingGrade = 2;
        if ((programmingPercent > 60) && (programmingPercent <= 73)) {
            programmingGrade = 3;
        } else if ((programmingPercent > 73) && (programmingPercent <= 91)) {
            programmingGrade = 4;
        } else if (programmingPercent > 91) {
            programmingGrade = 5;
        }
        float everagePercent = (historyPercent + programmingPercent) / 2;
        float everageGrade = (historyGrade +  programmingGrade) / 2;
        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);
        System.out.println("Средний % по предметам: " + everagePercent);
        System.out.println("Средний балл оценок по предметам: " + everageGrade);
        
        System.out.println("\n8. Рассчет годовой прибыли");
        int monthlyProfit = 13000;
        int monthlyCostRent = 5000;
        int monthlyCostProduction = 9000;
        int totalAnnualProfit = (monthlyProfit - monthlyCostRent - monthlyCostProduction) * 12;
        System.out.print("Чистая прибыль за год: ");
        if (totalAnnualProfit > 0) {
            System.out.print("+" + totalAnnualProfit + " руб.");
        } else {
            System.out.print(totalAnnualProfit + " руб.");
        }
    }
}