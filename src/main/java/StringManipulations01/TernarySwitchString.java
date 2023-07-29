package StringManipulations01;

import java.util.Scanner;

public class TernarySwitchString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a country in Europe, America, Germany, Turkey, Peru, Spain: ");

        String countryInitial = input.next().toLowerCase();

        switch (countryInitial){
            case "america":
                System.out.println("AM");
                break;
            case "europe":
                System.out.println("EU");
                break;
            case "spain":
                System.out.println("SP");
                break;
            case "germany":
                System.out.println("GE");
                break;
            case "turkey":
                System.out.println("TK");
                break;
            default:
                System.out.println("Please enter a valid country!");
                break;
        }

    }
}
