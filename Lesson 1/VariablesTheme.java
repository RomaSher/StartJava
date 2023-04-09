public class VariablesTheme {

    public static void main(String[] args) {

        System.out.println("\n1. Outputting Variable Values to the Console\n");
        
        byte windows = 10;
        short charger = 130;
        int system = 64;
        long nvidia = 4_294_967_296l;
        float intel = 2.8f;
        double ram = 15.9d;
        char monitor = 'F';
        boolean mouse = true;
        
        System.out.println("Windows " + windows);
        System.out.println("Charger " + charger + "W");
        System.out.println("System x" + system);
        System.out.println("Nvidia " + nvidia + " bytes");
        System.out.println("Intel " + intel + "GHz");
        System.out.println("RAM " + ram + "Gb");
        System.out.println("Monitor " + monitor + "ullHD");
        System.out.println("Wireless mouse - " + mouse);
        
        System.out.println("\n2. Calculation of the cost of goods with a discount\n");
        
        int pen = 100;
        int book = 200;
        int sale = 11;
        
        int nosale = pen + book;
        int sizesale = nosale * sale / 100;
        
        System.out.println("Pen and Book NOSALE = " + nosale);
        System.out.println("SALE = " + sizesale);
        System.out.println("Pen and Book SALE = " + (nosale - sizesale));
        
        System.out.println("\n3. Word derivation Java\n");
        
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        
        System.out.println("\n4. Output min and max values of integer numeric types\n");
        
        byte b = 127;
        System.out.println(b);
        ++b;
        System.out.println(b);
        --b;
        System.out.println(b);

        short s = 32_767;
        System.out.println("\n" + s);
        ++s;
        System.out.println(s);
        --s;
        System.out.println(s);

        int i = 2_147_483_647;
        System.out.println("\n" + i);
        ++i;
        System.out.println(i);
        --i;
        System.out.println(i);

        long l = 9_223_372_036_854_775_807l;
        System.out.println("\n" + l);
        ++l;
        System.out.println(l);
        --l;
        System.out.println(l);
        
        System.out.println("\n5. Rearranging Variable Values\n");
        
        int x = 2;
        int y = 5;
        
        System.out.println("- using the third variable");
        System.out.println("x = " + x + " | y = " + y);
        
        int z;
        z = y;
        y = x;
        x = z;
        
        System.out.println("x = "+ x + " | y = " + y);

        System.out.println("- using arithmetic operations");
        System.out.println("x = "+ x + " | y = " + y);
        
        x += y;
        y = x - y;
        x -= y;
        
        System.out.println("x = "+ x + " | y = " + y);

        System.out.println("- using the bitwise operation");
        System.out.println("x = "+ x + " | y = " + y);
        
        x ^= y;
        y ^= x;
        x ^= y;
        
        System.out.println("x = "+ x + " | y = " + y);
        
        System.out.println("\n6. Output of characters and their codes\n");
        
        byte code1 = 35;
        char symbol1 = (char) code1;
        byte code2 = 38;
        char symbol2 = (char) code2;
        byte code3 = 64;
        char symbol3 = (char) code3;
        byte code4 = 94;
        char symbol4 = (char) code4;
        byte code5 = 95;
        char symbol5 = (char) code5;
        
        System.out.println(code1 + " | " + symbol1);
        System.out.println(code2 + " | " + symbol2);
        System.out.println(code3 + " | " + symbol3);
        System.out.println(code4 + " | " + symbol4);
        System.out.println(code5 + " | " + symbol5);
        
        System.out.println("\n7. Duke's ASCII art console output\n");
        
        char num1 = '/';
        char num2 = '\\';
        char num3 = '(';
        char num4 = ')';
        char num5 = '_';
        
        System.out.println("     " + num1 + num2);
        System.out.println("    " + num1 + "  " + num2);
        System.out.println("   " + num1 + num5 + num3 + " " + num4 + num2);
        System.out.println("  " + num1 + "      " + num2);
        System.out.println(" " + num1 + num5 + num5 + num5 + num5 + num1 + num2 + num5 + num5 + num2);
        
        System.out.println("\n8. Outputting the number of hundreds, tens and units of a number\n");
        
        int number = 123;
        int numberHundreds = number / 100;
        int number1 = number % 100;
        int numberTens = number1 / 10;
        int numberUnits = number1 % 10;
        
        System.out.println("The number N contains:");
        System.out.println(numberHundreds + " hundreds");
        System.out.println(numberTens + " tens");
        System.out.println(numberUnits + " units");
        System.out.println("\nThe sum of its digits = " + numberHundreds + numberTens + numberUnits);
        System.out.println("Product = " + numberHundreds * numberTens * numberUnits);
        
        System.out.println("\n9. Time output\n");
        
        int time = 86399; 
        int second = time % 60;
        int hour = time / 60;
        int minute = hour % 60;
        hour /= 60;
        
        System.out.println(hour + ":" + minute + ":" + second);
    }
}