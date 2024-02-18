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
        System.out.println("Объем опертивной памяти: " + ram + ram1 + ram2);
        long monitor = 3840l;
        long monitor2 = 2160l;
        char monitor3 = 'x';
        System.out.println("Разрешение экрана: " + monitor + monitor3 + monitor2);
        float weight = 4.5f;
        System.out.println("Вес, кг: " + weight);
        double frequency = 2.5d;
        System.out.println("Частота процессора, ГГц: " + frequency);
        boolean hasTouchCreen = false;
        System.out.println("Сенсорный экран: " + hasTouchCreen);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int prisePen = 100;
        int priseBook = 200;
        int discountPercentage = 11;
        int priseAllProdukt = prisePen + priseBook;
        System.out.println("Общая стоисть товаров без скидки: " + priseAllProdukt);
        int discountAmount = (priseAllProdukt * discountPercentage) / 100;
        int discountedPriceGoods = priseAllProdukt - discountAmount;
        System.out.println("Сумма скидки: " + discountAmount);
        System.out.println("Общая стоимость товаров со скидкой: " + discountedPriceGoods);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("\n   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteVariable = 127;
        System.out.println("byte");
        System.out.println(byteVariable);
        ++byteVariable;
        System.out.println(byteVariable);
        --byteVariable;
        System.out.println(byteVariable);

        short shortVariable = 32767;
        System.out.println("\nshort");
        System.out.println(shortVariable);
        ++shortVariable;
        System.out.println(shortVariable);
        --shortVariable;
        System.out.println(shortVariable);
        
        int intVariable = 2147483647;
        System.out.println("\nint");
        System.out.println(intVariable);
        ++intVariable;
        System.out.println(intVariable);
        --intVariable;
        System.out.println(intVariable);
        
        long longVariable = 9223372036854775807l;
        System.out.println("\nlong");
        System.out.println(longVariable);
        ++longVariable;
        System.out.println(longVariable);
        --longVariable;
        System.out.println(longVariable);

        System.out.println("\n5. Перестановка значений переменных");
        System.out.println("\nС помощью третьей переменной:");
        int a = 2;
        int b = 5;
        System.out.println("\na=" + a + " b=" + b);
        int digit = a;
        a = b;
        b = digit;
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
        char symbol1 = '$';
        char symbol2 = '*';
        char symbol3 = '@';
        char symbol4 = '|';
        char symbol5 = '~';
        System.out.println((int) symbol1 + " " + symbol1);
        System.out.println((int) symbol2 + " " + symbol2);
        System.out.println((int) symbol3 + " " + symbol3);
        System.out.println((int) symbol4 + " " + symbol4);
        System.out.println((int) symbol5 + " " + symbol5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        symbol1 = '/';
        symbol2 = '\\';
        symbol3 = '_';
        symbol4 = '(';
        symbol5 = ')';
        System.out.println("    " + symbol1 + symbol2);
        System.out.println("   " + symbol1 + "  " +  symbol2);
        System.out.println("  " + symbol1 + symbol3 + symbol4 + " " +  symbol5 + symbol2);
        System.out.println(" " + symbol1 + "      " + symbol2);
        System.out.println("" + symbol1 + symbol3 + symbol3 + symbol3 + symbol3
                 + symbol1 + symbol2 + symbol3 + symbol3 + symbol2);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int dozens = number / 10;
        int units = number / 1;
        System.out.println("Число " + number + " содержит:");
        System.out.println("  " + "сотен - " + hundreds);
        System.out.println("  " + "десятков - " + dozens);
        System.out.println("  " + "единиц - " + units);
        int sumNumber = 0;
        int compositionNumber = 1;
        digit = number % 10;
        sumNumber += digit;
        compositionNumber *= digit;
        number /= 10;
        digit = number % 10;
        sumNumber += digit;
        compositionNumber *= digit;
        number /= 10; 
        sumNumber += number;
        compositionNumber *= number;
        System.out.println("Сумма его цифр = " + sumNumber);
        System.out.println("Произведение = " + compositionNumber);

        System.out.println("\n9. Вывод времени");
        float sec = 86399.0f;
        float hour = sec / 3600;
        float minute = sec / 60;
        System.out.println(hour + ":" + sec + ":" + sec);       
    }
}
