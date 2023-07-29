package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        // Type a program which calculates the area and the perimeter of a circle whose radius is entered by user.
        // (use float)
        // take pi number as 3.14159
        // Area of a circle is 3.14159 * radius * radius
        // Perimeter of a circle is 2 * 3.1459 * radius

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius of a circle: ");
        float radius = input.nextFloat();
        float pi = 3.1459F;
        System.out.println("Perimeter: " + (2*pi*radius));
        System.out.println("Area: " + (2*pi*radius*radius));

    }


}
