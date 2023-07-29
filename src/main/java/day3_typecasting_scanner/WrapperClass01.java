package day3_typecasting_scanner;

public class WrapperClass01 {
    public static void main(String[] args) {
        int i = 12;
        // i. will not show any methods available.
        // Integer i = 12;
        // this will show you methods available this is called a wrapper class.
        // by default int is a primitive value and does not have any methods available.

        byte b = 23;
        Byte we = b;

        System.out.println(we.floatValue());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
