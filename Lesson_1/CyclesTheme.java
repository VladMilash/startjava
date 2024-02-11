public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int firstNumberRange = -10;
        int lastNumberRange = 21;
        int rangeNumberCounter = firstNumberRange;
        int sumEvenNumbersRange = 0;
        int sumOddNumbersRange = 0;
        do {
            if (rangeNumberCounter % 2 == 0) {
                sumEvenNumbersRange += rangeNumberCounter;
            } else if (rangeNumberCounter % 2 != 0) {
                sumOddNumbersRange += rangeNumberCounter;
            }
            rangeNumberCounter++;
        } while (rangeNumberCounter <= lastNumberRange);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + 
                sumEvenNumbersRange + ", а нечетных = " + sumOddNumbersRange); 

        System.out.println("\n2. Вывод чисел в порядке убывания");  
        for (int i = 10; i >= -1; i--) {
            System.out.print(i + ", ");
            }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цирф");
        int originalNumber = 1234;
        int revercedNumber = 0;
        int sumRevercedNumbers = 0;
        while (originalNumber != 0) {
            int separableNumber = originalNumber % 10; 
            revercedNumber = revercedNumber * 10 + separableNumber; 
            sumRevercedNumbers += separableNumber; 
            originalNumber /= 10;
        }
        System.out.print("Реверсированное число: " + 
                revercedNumber + ", cумма его чисел: " + sumRevercedNumbers);

        System.out.println("\n\n4. Вывод чисел в несколько строк");
        int halfIntervalCounter = 0;
        int maximumNumberOutputZeros = 15;
        for (int i = 1; i < 24; i++) {
            if (i % 2 != 0) {
                System.out.printf("%2d ", i);
                halfIntervalCounter++;
            }
            if ((halfIntervalCounter % 5 == 0) && (i % 2 != 0)) {
                System.out.print("\n");
            }
        }
        while (maximumNumberOutputZeros != halfIntervalCounter) {
            System.out.printf("%2d ", 0);
            halfIntervalCounter++;
        }
         System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
         int numberBeingChecked = 3242592;
         int workingNumberBeingChecked = numberBeingChecked;
         int counterWorkingNumber = 0;
         int numberTwos = 0;
         while (workingNumberBeingChecked > 10) {
            counterWorkingNumber = workingNumberBeingChecked % 10;
            if (counterWorkingNumber == 2) {
                numberTwos++;
            }
            workingNumberBeingChecked /= 10;
         }
         if (numberTwos % 2 == 0) {
            System.out.println("В " + numberBeingChecked + 
                    "четное количество двоек - " + numberTwos);
         } else if (numberTwos % 2 != 0) {
            System.out.println("В " + 
                    numberBeingChecked + " нечетное количество двоек - " + numberTwos);
         }

        System.out.println("\n6. Отображение геометричесих фигур");
        int rectangleLength = 10;
        for (int i = 5; i > 0; i--) {
            for (int counterСharactersRectanhle = 0; 
                    counterСharactersRectanhle <= rectangleLength; counterСharactersRectanhle++) {
                System.out.print("*");
            }
            System.out.print("\n");
        } 
         System.out.println();
         int lengthBaseTriangle = 5;
         int maximumСharactersTriangle = lengthBaseTriangle;
         int counterСharactersTriangle;
         while (maximumСharactersTriangle > 0) {
            counterСharactersTriangle = 0;
            while (counterСharactersTriangle < maximumСharactersTriangle) {
                counterСharactersTriangle++;
                System.out.print("#");
            }
            System.out.print("\n");
            maximumСharactersTriangle--;
        }
        System.out.println();
        int heightTriangle = 3;
        int outputСharactersLength;
        int outputСharactersHeight = 1;
        do {
            outputСharactersLength = 0;
            do {
                System.out.print("$");
                outputСharactersLength++;
            } while (outputСharactersLength < outputСharactersHeight);
            System.out.print("\n");
            outputСharactersHeight++;
        } while (outputСharactersHeight <= heightTriangle);
        if (outputСharactersHeight > heightTriangle);
        outputСharactersHeight = heightTriangle - 1;
        do {
            outputСharactersLength = 0;
            do {
                outputСharactersLength++;
                System.out.print("$");
            } while(outputСharactersLength < outputСharactersHeight);
            outputСharactersHeight--;
            System.out.print("\n");
        } while (outputСharactersHeight > 0);

        System.out.println("\n7. Отображение ASCII-символов");
         char firstСharacterOutput = 15;
            for (int i = 15; i <= 47; i++) {
                if (i % 2 != 0) {
                    System.out.printf("%4d%11s            %-1s%n", i, firstСharacterOutput, Character.getName(i));
                    firstСharacterOutput++;
                    firstСharacterOutput++;
                }
            }
         firstСharacterOutput = 98;
         for (int i = 97; i <= 122; i++) {
            if ((i % 2 == 0) && (i < 100)) {
                System.out.printf("%4d%11s            %-1s%n", i, firstСharacterOutput, Character.getName(i));
                firstСharacterOutput++;
                firstСharacterOutput++;
            } else if ((i % 2 == 0) && (i >= 100)) {
                System.out.printf("%5d%10s            %-1s%n", i, firstСharacterOutput, Character.getName(i));
                firstСharacterOutput++;
                firstСharacterOutput++;
            }
         }

         System.out.println("\n8. Проверка, является ли число полиндромом");
         int numberСheck = 1234321;
         int workingNumberСheck = numberСheck;
         int separableNumberСheck;
         int reverseNumberСheck = 0;
         while (workingNumberСheck > 0) {
            separableNumberСheck = 0;
            separableNumberСheck = workingNumberСheck % 10;
            reverseNumberСheck = (reverseNumberСheck * 10) + separableNumberСheck;
            workingNumberСheck = workingNumberСheck / 10; 
         }
         if (numberСheck == reverseNumberСheck) {
            System.out.println("число " + numberСheck + " является" + " палиндромом");
         } else {
            System.out.println("число " + numberСheck + " не является" + " палиндромом");
         } 

         System.out.println("\n9. Проверка, является ли число счастливым");
         int sixDigitNumber = 555666;
         int workingSixDigitNumber = sixDigitNumber;
         int sumSecondHalfSixDigitNumber = 0;
         int sumFirstHalfSixDigitNumber = 0;
         int countersixDigitNumber = 0;
         int separableNumberSixDigitNumber;
         int firstHalfSixDigitNumber;
         int secondHalfSixDigitNumber;
         secondHalfSixDigitNumber = sixDigitNumber % 1000;
         while (countersixDigitNumber < 3) {
            separableNumberSixDigitNumber = 0;
            separableNumberSixDigitNumber = workingSixDigitNumber % 10;
            sumSecondHalfSixDigitNumber = sumSecondHalfSixDigitNumber + separableNumberSixDigitNumber;
            workingSixDigitNumber = workingSixDigitNumber / 10;
            countersixDigitNumber++;
         } 
         firstHalfSixDigitNumber = workingSixDigitNumber;
         while (workingSixDigitNumber > 0) {
            separableNumberSixDigitNumber = 0;
            separableNumberSixDigitNumber = workingSixDigitNumber % 10;
            sumFirstHalfSixDigitNumber = sumFirstHalfSixDigitNumber + separableNumberSixDigitNumber;
            workingSixDigitNumber = workingSixDigitNumber / 10;
         }
         if (sumSecondHalfSixDigitNumber == sumFirstHalfSixDigitNumber) {
            System.out.println("Число " + sixDigitNumber + " является счастливым");
            System.out.println("Сумма цифр " + 
                    firstHalfSixDigitNumber + " = " + sumFirstHalfSixDigitNumber + ", а сумма " 
                    + secondHalfSixDigitNumber + " = " + sumSecondHalfSixDigitNumber);
         } else if (sumSecondHalfSixDigitNumber != sumFirstHalfSixDigitNumber) {
            System.out.println("Число " + sixDigitNumber + " не является счастливым");
            System.out.println("Сумма цифр " + 
                    firstHalfSixDigitNumber + " = " + sumFirstHalfSixDigitNumber + ", а сумма " + 
                    secondHalfSixDigitNumber + " = " + sumSecondHalfSixDigitNumber);
         }
         System.out.println("\n10. Отображение таблицы умножения Пифагора");
         int resultMultiplication;
         for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                resultMultiplication = i * j;
                if (resultMultiplication == 1) {
                    System.out.print("   | ");
                }
                else {
                System.out.printf("%2d ", resultMultiplication);
                }
                if((resultMultiplication > 1) && (resultMultiplication <=9) && (j == 1)) {
                    System.out.print("| ");
                }
            }
            System.out.print("\n");
            if (i == 1) {
                System.out.println(" ---------------------------");
            }
         }
    }
}