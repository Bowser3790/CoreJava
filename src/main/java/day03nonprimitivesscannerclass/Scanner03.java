package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner03 {
    // Example 1: ask user to enter width and the length of a rectangle, then calculate perimeter
    // and the area of the rectangle.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width and length of the rectangle, please... ");
        double width = input.nextDouble();
        double length = input.nextDouble();
        System.out.println("The parameter size is: " + (2*width + 2*length));
        System.out.println("The area: " + (width*length));

    }
}
