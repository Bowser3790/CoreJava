package StringManipulations01;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {

        // Get the initial of a name which contains first and last name.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        char firstInitial = fullName.charAt(0);
        char lastInitial = fullName.split(" ")[1].charAt(0);

        System.out.println(firstInitial + " " + lastInitial);
    }
}
