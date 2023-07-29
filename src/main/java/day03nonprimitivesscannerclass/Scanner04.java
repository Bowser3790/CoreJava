package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        // Type a program which calculates the volume of the rectangular prism whose length, width,
        // and height are entered by user.
        // hint 1 Volume of a rectangular prism is width x length x height

        Scanner input = new Scanner(System.in);
        System.out.println("enter the width, length, and height: ");
        double width = input.nextDouble();
        double length = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("Volume: " + width*length*height);

    }
}
