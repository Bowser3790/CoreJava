package StringManipulations01;

import java.util.Scanner;

public class nestedIfStatment {
    public static void main(String[] args) {
        // If the worker is a male and the age is greater than 65 he will be retired otherwise he should work
        // If the worker is female and the age is greater than 60 he will be retired otherwise he should work
        // If the worker does not define himself as a male or female print "Undefined" on the console.

        Scanner input = new Scanner(System.in);
        System.out.println("Are you male or female: ");

        String gender = input.next();

        System.out.println("Enter your age: ");
        byte age = input.nextByte();

        if(gender.equalsIgnoreCase("Male"));{
            if(age<0){
                System.out.println("Invalid Age");
            } else if (age<66) {
                System.out.println("Male should still be working");

            } else {
                System.out.println("Male should be retired");

            }

        } if (gender.equalsIgnoreCase("Female")){
            if(age<0){
                System.out.println("age is not valid");
            } else if (age<55) {
                System.out.println("Female shoud still be working");

            }else{
                System.out.println("Female should be retired! Please retire Now!");
            }
        }else {
            System.out.println("Invalid entry");
        }

    }
}
