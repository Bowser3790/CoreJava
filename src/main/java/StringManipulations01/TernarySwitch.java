package StringManipulations01;

import java.util.Scanner;

public class TernarySwitch {
    public static void main(String[] args) {
        // create a basic calculator

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 1st number");
        double num1 = input.nextDouble();

        System.out.println("Please enter 2nd number");
        double num2 = input.nextDouble();

        System.out.println("Enter operation symbol: +,-,/,*,%");
        char operation = input.next().charAt(0);

        // Note 1: inside the switch you can use int, byte, short, char and string
        // Note 2: inside the switch you cannot use Long (use if else, if), float (no decimal- case is for whole numbers),
        // boolean (only 2 values and if else is enough for this)

        switch (operation){
            case '+':
                System.out.println("the sum is: " + (num1+num2));
                break;
            case '-':
                System.out.println("the sum is: " + (num1-num2));
                break;
            case '/':
                System.out.println("the sum is: " + (num1/num2));
                break;
            case '*':
                System.out.println("the sum is: " + (num1*num2));
                break;
            case '%':
                System.out.println("the sum is: " + (num1*num2)/100);
                break;
            default:
                System.out.println("This operation was not defined in this calculator");
                break;

        }
    }



}
