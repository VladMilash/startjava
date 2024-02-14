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
        System.out.println("В отрезке ["+ startRange + ", " + endRange + 
                "] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd); 

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        if (b > max) {
            max = b;
        } 
        if (c > max) {
            max = c;
        }
        int min = a;
        if (b < min) {
            min = b;
        } 
        if (c < min) {
            min = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int originalNumber = 1234;
        int sumNumbers = 0;
        int digit;
        System.out.print("Реверсивное число: ");
        while (originalNumber > 0) {
            digit = originalNumber % 10;
            System.out.print(digit);  
            sumNumbers += digit; 
            originalNumber /= 10;
        }
        System.out.print(", cумма его чисел: " + sumNumbers);

        System.out.println("\n\n4. Вывод чисел в несколько строк");
        int howDigits = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%2d ", i);
            howDigits++;
            if (howDigits % 5 == 0) {
                System.out.println();
            }
        }
        int howZeros = 5 - (howDigits % 5);
        if ((howZeros > 0) && (howZeros < 5)) {
            while (howZeros > 0) {
                System.out.printf("%2d ", 0);
                howZeros--;
            }
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
        int length = 10;
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j <= length; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 

        System.out.println();
        int lengthBase = 5;
        int outputLength;
        while (lengthBase > 0) {
            outputLength = 0;
            while (outputLength < lengthBase) {
                outputLength++;
                System.out.print("#");
            }
            System.out.println();
            lengthBase--;
        }

        System.out.println();
        int height = 3;
        int outputHeight = 1;
        outputLength = 0;
        boolean isСountdown = false;
        do {
            do {
                System.out.print("$");
                outputLength++;
            } while (outputLength < outputHeight);
            System.out.println();
            if ((outputHeight < height) && (isСountdown == false)) {
                outputHeight++;
                outputLength = 0;
            } else {
                isСountdown = true;
                outputHeight--;
                outputLength=0;
            }
        } while (outputHeight > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("DECIMAL   " + "CHARACTER   " + "DESCRIPTION");
        char symbol1 = 15;
        char symbol2 = 98;
        for (int i = 15; i <= 122; i++) {
            if ((i % 2 != 0) && (i <= 47)) {
                System.out.printf("%4d%11s            %-1s%n", i, symbol1, Character.getName(i));
                symbol1 += 2;
            }
            if ((i % 2 == 0) && (i >= 98)) {
                System.out.printf("%4d%11s            %-1s%n", i, symbol2, Character.getName(i));
                symbol2 += 2;
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        originalNumber = 1234321;
        originalNumberCopy = originalNumber;
        int reverseNumber = 0;
        while (originalNumberCopy > 0) {
            digit = originalNumberCopy % 10;
            reverseNumber= (reverseNumber * 10) + digit;
            originalNumberCopy /= 10; 
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
        halfNumber1 = originalNumber / 1000;
        for (int i = 5; i >= 0; i--) {
            counter++;
            if (counter <= 3) {
                sumNumber2 = sumNumber2 + (originalNumberCopy % 10);
                originalNumberCopy /= 10;
            } else {
                sumNumber1 = sumNumber1 + (originalNumberCopy % 10);
                originalNumberCopy /= 10;
            }
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