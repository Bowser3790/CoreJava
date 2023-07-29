package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Print your address: ");
        String address = input.nextLine(); // nextLint() is for getting all strings from the first character to the
                                           // last character
                                            // for integers make sure you use nextInt();

        System.out.println("Print your first name: ");
        String firstName = input.next(); // It is for getting just the first word in a String.

        System.out.println("Print your last name: ");
        String lastName = input.nextLine();

        System.out.println(firstName +" " + lastName);
        System.out.println(address);

    }
}
