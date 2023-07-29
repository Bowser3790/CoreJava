package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner01 {
    // see java notes for details
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age!");
        byte age = input.nextByte();
        System.out.println("The students age is " + age);
    }

}
