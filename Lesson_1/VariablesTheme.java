public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        int ssd = 2; 
        char ssd1 = 't';
        char ssd2 = 'r';
        char ssd3 = 's';
        char ssd4 = 'd';
        System.out.println("Объем жесткого диска: " + ssd + ssd1 + ssd2 + " " + ssd3 + ssd3 + ssd4);
        short ram = 64;
        char ram1 = 'g';
        char ram2 = 'b';
        System.out.println("Объем оперативной памяти: " + ram + ram1 + ram2);
        long monitor = 3840l;
        long monitor2 = 2160l;
        char monitor3 = 'x';
        System.out.println("Разрешение экрана: " + monitor + monitor3 + monitor2);
        float weight = 4.5f;
        System.out.println("Вес, кг: " + weight);
        byte processor = 3;
        System.out.println("Процессор: Intel Core i" + processor);
        double frequency = 2.5d;
        System.out.println("Частота процессора, ГГц: " + frequency);
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
        
        long longVariable = 9223372036854775807l;
        System.out.println("long " + longVariable + " " + ++longVariable + " " + --longVariable);

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
        int sumNumber = hundreds + tens + ones;
        int compositionNumber = hundreds * tens * ones;
        System.out.println("Сумма его цифр = " + sumNumber);
        System.out.println("Произведение = " + compositionNumber);

        System.out.println("\n9. Вывод времени");
        int totalSeconds  = 86399;
        int hours = totalSeconds / 3600;
        int remainSeconds = totalSeconds % 3600;
        int minutes = remainSeconds / 60;
        int seconds = remainSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
