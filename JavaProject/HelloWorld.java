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
    }
}
