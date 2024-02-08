public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int finish = 21;
        int i = start;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else if (i % 2 != 0) {
                sumOdd += i;
            }
            i++;
        } while (i <= finish);
        System.out.println
        ("В отрезке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd); 

        System.out.println("\n2. Вывод чисел в порядке убывания");  
        for (int m = 10; m >= -1; m--) {
            System.out.print(m + ", ");
            }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цирф");
        int num1 = 1234;
        int reverced = 0;
        int sumRevence = 0;
        while (num1 != 0) {
            int digit = num1 % 10; 
            reverced = reverced * 10 + digit; 
            sumRevence += digit; 
            num1 /= 10;
        }
        System.out.print
        ("Реверсированное число: " + reverced + ", cумма его чисел: " + sumRevence);

        System.out.println("\n\n4. Вывод чисел в несколько строк");
        int counter = 0;
        int zirro = 15;
        for (int p = 1; p < 24; p++) {
            if (p % 2 != 0) {
                System.out.printf("%2d ", p);
                counter++;
            }
            if ((counter % 5 == 0) && (p % 2 != 0)) {
                System.out.print("\n");
            }
        }
        while (zirro != counter) {
            System.out.printf("%2d ", 0);
            counter++;
        }
         System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
         int num4 = 3242592;
         int num5 = num4;
         int counterNum5 = 0;
         int howTwos = 0;
         while (num5 > 10) {
            counterNum5 = num5 % 10;
            if (counterNum5 == 2) {
                howTwos++;
            }
            num5 = num5 / 10;
         }
         if (howTwos % 2 == 0) {
            System.out.println("В " + num4 + "четное количество двоек - " + howTwos);
         } else if (howTwos % 2 != 0) {
            System.out.println("В " + num4 + " нечетное количество двоек - " + howTwos);
         }

        System.out.println("\n6. Отображение геометричесих фигур");
        int rectangle = 10;
        for (int j = 5; j > 0; j--) {
            for (int counterСharactersRectanhle = 0; 
                counterСharactersRectanhle <= rectangle; counterСharactersRectanhle++) {
                System.out.print("*");
            }
            System.out.print("\n");
        } 
         System.out.println("");
         int start1 = 5;
         int maxСharactersTriangle = start1;
         int countTriangle;
         while (maxСharactersTriangle > 0) {
            countTriangle = 0;
            while (countTriangle < maxСharactersTriangle) {
                countTriangle++;
                System.out.print("#");
            }
            System.out.print("\n");
            maxСharactersTriangle--;
        }
        System.out.println("");
        int sizeTriangle2 = 3;
        int x;
        int y = 1;
        do {
            x = 0;
            do {
                System.out.print("$");
                x++;
            } while (x < y);
            System.out.print("\n");
            y++;
        } while (y <= sizeTriangle2);
        if (y > sizeTriangle2);
        y = sizeTriangle2 - 1;
        do {
            x = 0;
            do {
                x++;
                System.out.print("$");
            } while(x < y);
            y--;
            System.out.print("\n");
        } while (y > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        int c;
         char symbol = 15;
            for (c = 15; c <= 47; c++) {
                if (c % 2 != 0) {
                    System.out.printf("%4d%11s            %-1s%n", c, symbol, Character.getName(c));
                    symbol++;
                    symbol++;
                }
            }
         symbol = 98;
         for (c = 97; c <= 122; c++) {
            if ((c % 2 == 0) && (c < 100)) {
                System.out.printf("%4d%11s            %-1s%n", c, symbol, Character.getName(c));
                symbol++;
                symbol++;
            } else if ((c % 2 == 0) && (c >= 100)) {
                System.out.printf("%5d%10s            %-1s%n", c, symbol, Character.getName(c));
                symbol++;
                symbol++;
            }
         }

         System.out.println("\n8. Проверка, является ли число полиндромом");
         int startNumber = 1234321;
         int workingNumber = startNumber;
         int digit2;
         int reverseNumber = 0;
         while (workingNumber > 0) {
            digit2 = 0;
            digit2 = workingNumber % 10;
            reverseNumber = (reverseNumber * 10) + digit2;
            workingNumber = workingNumber / 10; 
         }
         if (startNumber == reverseNumber) {
            System.out.println("число " + startNumber + " является" + " палиндромом");
         } else {
            System.out.println("число " + startNumber + " не является" + " палиндромом");
         } 

         System.out.println("\n9. Проверка, является ли число счастливым");
         int startNumber2 = 555666;
         int workingNumber2 = startNumber2;
         int sum1 = 0;
         int sum2 = 0;
         int counterNumber = 0;
         int digit3;
         int abc;
         int def;
         def = startNumber2 % 1000;
         while (counterNumber < 3) {
            digit3 = 0;
            digit3 = workingNumber2 % 10;
            sum1 = sum1 + digit3;
            workingNumber2 = workingNumber2 / 10;
            counterNumber++;
         } 
         abc = workingNumber2;
         while (workingNumber2 > 0) {
            digit3 = 0;
            digit3 = workingNumber2 % 10;
            sum2 = sum2 + digit3;
            workingNumber2 = workingNumber2 / 10;
         }
         if (sum1 == sum2) {
            System.out.println("Число " + startNumber2 + " является счастливым");
            System.out.println("Сумма цифр " + abc + " = " + sum2 + ", а сумма " + def + " = " + sum1);
         } else if (sum1 != sum2) {
            System.out.println("Число " + startNumber2 + " не является счастливым");
            System.out.println("Сумма цифр " + abc + " = " + sum2 + ", а сумма " + def + " = " + sum1);
         }
         System.out.println("\n10. Отображение таблицы умножения Пифагора");
         int result;
         for (int y1 = 1; y1 <= 9; y1++) {
            for (int x1 = 1; x1 <= 9; x1++) {
                result = y1 * x1;
                if (result == 1) {
                    System.out.print("   | ");
                }
                else {
                System.out.printf("%2d ", result);
                }
                if((result > 1) && (result <=9) && (x1 == 1)) {
                    System.out.print("| ");
                }
            }
            System.out.print("\n");
            if (y1 == 1) {
                System.out.println(" ---------------------------");
            }
         }
    }
}