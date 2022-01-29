package JavaProject;

public class HelloWorld {
   
    public static void main(String[] args) {
        System.out.println("hello world"); 

        int myFirstNumber = 5;
        System.out.println(myFirstNumber);

        int myValue = 10000;

        // Max and Min int values in Java
        // Overflow and Underflow int values

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));

        // Byte Variables with max and min values
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Minimum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Minimum Value = " + myMaxShortValue);


        long myLongValue = 100L; 
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Minimum Value = " + myMaxLongValue);


        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Minimum Value = " + myMaxFloatValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Minimum Value = " + myMaxDoubleValue);


        // Char is similar to string but it can only assign 1 character. 
        // two bytes in memory
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
    }
}
