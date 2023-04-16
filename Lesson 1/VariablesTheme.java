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
        int discount = 11;
        int noDiscount = pen + book;
        int sizeDiscount = noDiscount * discount / 100;
        
        System.out.println("Pen and Book NO DISCOUNT = " + noDiscount);
        System.out.println("SALE = " + sizeDiscount);
        System.out.println("Pen and Book DISCOUNT = " + (noDiscount - sizeDiscount));
        
        System.out.println("\n3. Word derivation Java\n");
        
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        
        System.out.println("\n4. Output min and max values of integer numeric types\n");
        
        byte numberByte = 127;
        System.out.println(numberByte);
        System.out.println(++numberByte);
        System.out.println(--numberByte);

        short numberShort = 32_767;
        System.out.println("\n" + numberShort);
        System.out.println(++numberShort);
        System.out.println(--numberShort);

        int numberInt = 2_147_483_647;
        System.out.println("\n" + numberInt);
        System.out.println(++numberInt);
        System.out.println(--numberInt);

        long numberLong = 9_223_372_036_854_775_807l;
        System.out.println("\n" + numberLong);
        System.out.println(++numberLong);
        System.out.println(--numberLong);
        
        System.out.println("\n5. Rearranging Variable Values\n");
        
        int numberX = 2;
        int numberY = 5;
        
        System.out.println("- using the third variable");
        System.out.println("x = " + numberX + " | y = " + numberY);
        
        int numberZ = numberY;
        numberY = numberX;
        numberX = numberZ;
        
        System.out.println("x = "+ numberX + " | y = " + numberY);

        System.out.println("- using arithmetic operations");
        System.out.println("x = "+ numberX + " | y = " + numberY);
        
        numberX += numberY;
        numberY = numberX - numberY;
        numberX -= numberY;
        
        System.out.println("x = "+ numberX + " | y = " + numberY);

        System.out.println("- using the bitwise operation");
        System.out.println("x = "+ numberX + " | y = " + numberY);
        
        numberX ^= numberY;
        numberY ^= numberX;
        numberX ^= numberY;
        
        System.out.println("x = "+ numberX + " | y = " + numberY);
        
        System.out.println("\n6. Output of characters and their codes\n");
        
        char numberSign = '#';
        int numberSignCode = numberSign;
        char ampersand = '&';
        int ampersandCode = ampersand;
        char atSymbol = '@';
        int atSymbolCode = atSymbol;
        char circumflex = '^';
        int circumflexCode = circumflex;
        char underscore1 = '_';
        int underscoreCode = underscore1;

        System.out.println(numberSignCode + " | " + numberSign);
        System.out.println(ampersandCode + " | " + ampersand);
        System.out.println(atSymbolCode + " | " + atSymbol);
        System.out.println(circumflexCode + " | " + circumflex);
        System.out.println(underscoreCode + " | " + underscore1);
        
        System.out.println("\n7. Duke's ASCII art console output\n");
        
        char forwardSlash = '/';
        char backslash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore2 = '_';
        
        System.out.println("     " + forwardSlash + backslash);
        System.out.println("    " + forwardSlash + "  " + backslash);
        System.out.println("   " + forwardSlash + underscore2 + leftParenthesis + " " + rightParenthesis
            + backslash);
        System.out.println("  " + forwardSlash + "      " + backslash);
        System.out.println(" " + forwardSlash + underscore2 + underscore2 + underscore2 + underscore2
            + forwardSlash + backslash + underscore2 + underscore2 + backslash);
        
        System.out.println("\n8. Outputting the number of hundreds, tens and ones of a number\n");
        
        int number = 123;
        int hundreds = number / 100;
        int number1 = number % 100;
        int tens = number1 / 10;
        int ones = number1 % 10;
        
        System.out.println("The number N contains:");
        System.out.println(hundreds + " hundreds");
        System.out.println(tens + " tens");
        System.out.println(ones + " ones");
        System.out.println("\nThe sum of its digits = " + hundreds + tens + ones);
        System.out.println("Product = " + hundreds * tens * ones);
        
        System.out.println("\n9. Time output\n");
        
        int time = 86399; 
        int second = time % 60;
        int hour = time / 60;
        int minute = hour % 60;
        hour /= 60;
        
        System.out.println(hour + ":" + minute + ":" + second);
    }
}