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
        int variable1 = 2;
        int variable2 = 5;
        System.out.println("\nvariable1=" + variable1 + " variable2=" + variable2);
        int variableTemp = variable1;
        variable1 = variable2;
        variable2 = variableTemp;
        System.out.println("\nvariable1=" + variable1 + " variable2=" + variable2);
        System.out.println("\nC помощью арифметических операций:");
        System.out.println("\nvariable1=" + variable1 + " variable2=" + variable2);
        variable1 = variable1 + variable2;
        variable2 = variable1 - variable2;
        variable1 = variable1 - variable2;
        System.out.println("\nvariable1=" + variable1 + " variable2=" + variable2);
        System.out.println("\nC помощью побитовой операции ^:");
        System.out.println("\nvariable1=" + variable1 + " variable2=" + variable2);
        variable1 = variable1 ^ variable2;
        variable2 = variable2 ^ variable1;
        variable1 = variable1 ^ variable2;
        System.out.println("\nvariable1=" + variable1 + " variable2=" + variable2);
        
        System.out.println("\n6. Вывод символов и их кодов");
        int codVariable1 = 36;
        int codVariable2 = 42;
        int codVariable3 = 64;
        int codVariable4 = 124;
        int codVariable5 = 126;
        char symbolVariable1 = '$';
        char symbolVariable2 = '*';
        char symbolVariable3 = '@';
        char symbolVariable4 = '|';
        char symbolVariable5 = '~';
        System.out.println(codVariable1 + " " + symbolVariable1);
        System.out.println(codVariable2 + " " + symbolVariable2);
        System.out.println(codVariable3 + " " + symbolVariable3);
        System.out.println(codVariable4 + " " + symbolVariable4);
        System.out.println(codVariable5 + " " + symbolVariable5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char symbolVariable6 = '/';
        char symbolVariable7 = '\\';
        char symbolVariable8 = '_';
        char symbolVariable9 = '(';
        char symbolVariable10 = ')';
        System.out.println("    " + symbolVariable6 + symbolVariable7);
        System.out.println("   " + symbolVariable6 + "  " +  symbolVariable7);
        System.out.println("  " + symbolVariable6 + symbolVariable8 + symbolVariable9 + " " 
                + symbolVariable10 + symbolVariable7);
        System.out.println(" " + symbolVariable6 + "      " + symbolVariable7);
        System.out.println("" + symbolVariable6 + symbolVariable8 + symbolVariable8 
                + symbolVariable8 + symbolVariable8 + symbolVariable6 + symbolVariable7 
                + symbolVariable8 + symbolVariable8 + symbolVariable7);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int k = 123;
        int hundreds = k / 100;
        int dozens = k / 10;
        int units = k / 1;
        System.out.println("Число " + k + " содержит:");
        System.out.println("  " + "сотен - " + hundreds);
        System.out.println("  " + "десятков - " + dozens);
        System.out.println("  " + "единиц - " + units);
        int boofer;
        int summaK;
        boofer = k % 10;
        summaK = boofer; 
        boofer = k / 10; 
        boofer = boofer % 10; 
        summaK = summaK + boofer; 
        boofer = k / 10; 
        boofer = boofer / 10;
        summaK = summaK + boofer; 
        int boofer1;
        int compositionK;
        boofer1 = k % 10; 
        compositionK = boofer1; 
        boofer1 = k / 10; 
        boofer1 = boofer1 % 10; 
        compositionK = compositionK + boofer1; 
        boofer1 = k / 10;
        boofer1 = boofer1 / 10; 
        compositionK = compositionK + boofer1; 
        System.out.println("Сумма его цифр = " + summaK);
        System.out.println("Произведение = " + compositionK);

        System.out.println("\n9. Вывод времени");
        float sec = 86399.0f;
        float hour = sec / 3600;
        float minute = sec / 60;
        System.out.println(hour + ":" + sec + ":" + sec);       
    }
}
