public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int counter = startRange;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else if (counter % 2 != 0) {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= endRange);
        System.out.println("В отрезке ["+ startRange + ", " 
                + endRange + "] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd); 

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int maxNumber = 0;
        int minNumber = 0;
        if (number1 > number2) {
            if (number1 > number3) {
                maxNumber = number1;
                if (number2 > number3) {
                    minNumber = number3;
                } else if (number2 < number3) {
                    minNumber = number2;
                }
            } else if (number1 < number3) {
                maxNumber = number3;
                minNumber = number2;
            }
        }
        else if (number1 < number2) {
            if (number2 > number3) {
                maxNumber = number2;
                if (number3 > number1) {
                    minNumber = number1;
                }
            } else if (number2 < number3) {
                maxNumber = number3;
                minNumber = number1;
            }
        }
        for (int i = maxNumber; i >= minNumber; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int originalNumber = 1234;
        int sumNumbers = 0;
        System.out.print("Реверсированное число: ");
        while (originalNumber > 0) {
            int separableNumber = originalNumber % 10;
            System.out.print(separableNumber);  
            sumNumbers += separableNumber; 
            originalNumber /= 10;
        }
        System.out.print(", cумма его чисел: " + sumNumbers);

        System.out.println("\n\n4. Вывод чисел в несколько строк");
        counter = 0;
        int maxZeros = 15;
        for (int i = 1; i < 24; i += 2) {
                System.out.printf("%2d ", i);
                counter++;
            if ((counter % 5 == 0) && (i % 2 != 0)) {
                System.out.println();
            }
        }
        while (maxZeros != counter) {
            System.out.printf("%2d ", 0);
            counter++;
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        originalNumber = 3242592;
        int originalNumberCopy = originalNumber;
        int numberTwos = 0;
        while (originalNumberCopy > 10) {
            if (originalNumberCopy % 10 == 2) {
                numberTwos++;
            }
            originalNumberCopy /= 10;
        }
        if (numberTwos % 2 == 0) {
            System.out.println("В " + originalNumber + 
                    "четное количество двоек - " + numberTwos);
        } else if (numberTwos % 2 != 0) {
            System.out.println("В " + 
                    originalNumber + " нечетное количество двоек - " + numberTwos);
        }

        System.out.println("\n6. Отображение геометричесих фигур");
        int rectangleLength = 10;
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j <= rectangleLength; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
         System.out.println();
         int lengthBaseTriangle = 5;
         int maxСharacters = lengthBaseTriangle;
         while (maxСharacters > 0) {
            counter = 0;
            while (counter < maxСharacters) {
                counter++;
                System.out.print("#");
            }
            System.out.println();
            maxСharacters--;
        }
        System.out.println();
        int heightTriangle = 3;
        int outputLength;
        int outputHeight = 1;
        do {
            outputLength = 0;
            do {
                System.out.print("$");
                outputLength++;
            } while (outputLength < outputHeight);
            System.out.println();
            outputHeight++;
        } while (outputHeight <= heightTriangle);
        if (outputHeight > heightTriangle);
        outputHeight = heightTriangle - 1;
        do {
            outputLength = 0;
            do {
                outputLength++;
                System.out.print("$");
            } while(outputLength < outputHeight);
            outputHeight--;
            System.out.println();
        } while (outputHeight > 0);

        System.out.println("\n7. Отображение ASCII-символов");
         char symbol = 15;
            for (int i = 15; i <= 47; i++) {
                if (i % 2 != 0) {
                    System.out.printf("%4d%11s            %-1s%n", i, symbol, Character.getName(i));
                    symbol++;
                    symbol++;
                }
            }
         symbol = 98;
         for (int i = 97; i <= 122; i++) {
            if ((i % 2 == 0) && (i < 100)) {
                System.out.printf("%4d%11s            %-1s%n", i, symbol, Character.getName(i));
                symbol++;
                symbol++;
            } else if ((i % 2 == 0) && (i >= 100)) {
                System.out.printf("%5d%10s            %-1s%n", i, symbol, Character.getName(i));
                symbol++;
                symbol++;
            }
         }

         System.out.println("\n8. Проверка, является ли число полиндромом");
         originalNumber = 1234321;
         originalNumberCopy = originalNumber;
         int reverseNumber = 0;
         int separableNumber;
         while (originalNumberCopy > 0) {
            separableNumber = 0;
            separableNumber = originalNumberCopy % 10;
            reverseNumber= (reverseNumber * 10) + separableNumber;
            originalNumberCopy = originalNumberCopy / 10; 
         }
         if (originalNumber == reverseNumber) {
            System.out.println("число " + originalNumber + " является" + " палиндромом");
         } else {
            System.out.println("число " + originalNumber + " не является" + " палиндромом");
         } 

         System.out.println("\n9. Проверка, является ли число счастливым");
         originalNumber = 555666;
         originalNumberCopy = originalNumber;
         int sumNumber2 = 0;
         int sumNumber1 = 0;
         counter = 0;
         int halfNumber1;
         int halfNumber2;
         halfNumber2 = originalNumber % 1000;
         while (counter < 3) {
            separableNumber = 0;
            separableNumber = originalNumberCopy % 10;
            sumNumber2 = sumNumber2 + separableNumber;
            originalNumberCopy = originalNumberCopy / 10;
            counter++;
         } 
         halfNumber1 = originalNumberCopy;
         while (originalNumberCopy > 0) {
            separableNumber = 0;
            separableNumber = originalNumberCopy % 10;
            sumNumber1 = sumNumber1 + separableNumber;
            originalNumberCopy = originalNumberCopy / 10;
         }
         if (sumNumber2 == sumNumber1) {
            System.out.println("Число " + originalNumber + " является счастливым");
            System.out.println("Сумма цифр " + halfNumber1 + " = " 
                    + sumNumber1 + ", а сумма " + halfNumber2 + " = " + sumNumber2);
         } else if (sumNumber2 != sumNumber1) {
            System.out.println("Число " + originalNumber + " не является счастливым");
            System.out.println("Сумма цифр " + halfNumber1 + " = " + sumNumber1 + ", а сумма " + 
                    halfNumber2 + " = " + sumNumber2);
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