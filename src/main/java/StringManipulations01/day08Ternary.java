package StringManipulations01;

import java.io.ObjectStreamException;

public class day08Ternary {
    public static void main(String[] args) {
        // type code to select the min of two integers

        int a = 12;
        int b = 13;

        int r1 = a<b ? a : b;
        System.out.println("Min is: " + r1); // Min is: 12

        // Ex 2: Type code to calculate absolute value of an integer.

        int c = -5;
        int r2 = c<0 ? -1*c : c;
        System.out.println("Absolute value is: " + r2);// Absolute value is 5

        // if two integers are positive return the multiplication otherwise, give a message I don't know multiplication.
        int d = 3;
        int e = 5;

        // need to use Object data type here because object covers all data types
        // there is a integer and string in this ternary statment.

        Object r3 = d>0 && e>0 ? e*d : "I dont know how to multiply";
        System.out.println(r3);

    }
}
