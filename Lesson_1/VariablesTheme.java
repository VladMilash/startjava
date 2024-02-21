public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        int ssdSpace = 2; 
        System.out.println("Объем жесткого диска, Тб: " + ssdSpace);
        char ssdNumbers = '1';
        System.out.println("Количество ssd: " + ssdNumbers);
        short ramAmount = 64;
        System.out.println("Объем оперативной памяти, Гб: " +  ramAmount);
        long ramFrequency = 3200l;
        System.out.println("Частота оперативной памяти, МГц: " +  ramFrequency);
        float laptopWeight = 4.5f;
        System.out.println("Вес, кг: " + laptopWeight);
        byte cpuType = 3;
        System.out.println("Тип процессора: Intel Core i" + cpuType);
        double cpuFrequency = 2.5d;
        System.out.println("Частота процессора, ГГц: " + cpuFrequency);
        boolean hasTouchCreen = false;
        System.out.println("Сенсорный экран: " + hasTouchCreen);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int discountPercent = 11;
        int priseAllProduct = pricePen + priceBook;
        System.out.println("Общая стоимость товаров без скидки: " + priseAllProduct);
        int discountAmount = (priseAllProduct * discountPercent) / 100;
        int discountPrice = priseAllProduct - discountAmount;
        System.out.println("Сумма скидки: " + discountAmount);
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("\n   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteValue = 127;
        System.out.println("byte " + byteValue + " " + ++byteValue + " " + --byteValue);

        short shortValue = 32767;
        System.out.println("short " + shortValue + " " + ++shortValue + " " + --shortValue);
        
        int intValue = 2147483647;
        System.out.println("int " + intValue + " " + ++intValue + " " + --intValue);
        
        long longValue = 9223372036854775807l;
        System.out.println("long " + longValue + " " + ++longValue + " " + --longValue);

        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("\nС помощью третьей переменной:");
        int a = 2;
        int b = 5;
        System.out.println("\na=" + a + " b=" + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("\na=" + a + " b=" + b);
        
        System.out.println("\nC помощью арифметических операций:");
        System.out.println("\na=" + a + " b=" + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("\na=" + a + " b=" + b);
        
        System.out.println("\nC помощью побитовой операции ^:");
        System.out.println("\na=" + a + " b=" + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("\na=" + a + " b=" + b);
        
        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println((int) dollar + " " + dollar);
        System.out.println((int) asterisk + " " + asterisk);
        System.out.println((int) atSign + " " + atSign);
        System.out.println((int) verticalBar + " " + verticalBar);
        System.out.println((int) tilde + " " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " +  backslash);
        System.out.println("  " + slash + underscore + 
                leftParenthesis + " " +  rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore
                 + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;
        System.out.println("Число " + number + " содержит:");
        System.out.println("  " + "сотен - " + hundreds);
        System.out.println("  " + "десятков - " + tens);
        System.out.println("  " + "единиц - " + ones);
        int sumDigits = hundreds + tens + ones;
        int compositionDigits = hundreds * tens * ones;
        System.out.println("Сумма его цифр = " + sumDigits);
        System.out.println("Произведение = " + compositionDigits);

        System.out.println("\n9. Вывод времени");
        int totalSeconds  = 86399;
        int hh = totalSeconds / 3600;
        int ss = totalSeconds % 60;
        int mm = totalSeconds / 60 % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}