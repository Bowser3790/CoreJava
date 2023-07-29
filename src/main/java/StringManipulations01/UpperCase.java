package StringManipulations01;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Type your name: ");
//        String upperCaseName = input.nextLine().toUpperCase();
//        System.out.println(upperCaseName);
//
//        // remove the spaces from the beginning and end of a string
//
//        System.out.println("Print your full name again: ");
//        String noSpaceName = input.nextLine().toUpperCase().trim();
//        System.out.println(noSpaceName);
//
//        System.out.println("Enter a String value: ");
//        String s = input.nextLine();
//        int numOfChars = s.length(); // gives you total number of characters in a string
//        System.out.println(numOfChars);

//        String s = "Alican";
//        String firstFourChars = s.substring(0,4).toLowerCase(); //get you however many values in a string you choose
//        System.out.println(firstFourChars);
//
//        // check to see if strings are the same
//
//        String r = "Java";
//        String p = "Java";
//
//        boolean same = r.equals(p);
//        System.out.println(same); // you can also use the method .equalsIgnoreCase()
//        // note that == checks if the values are the same in memory
//        // equals() checks to see if the actual values are the same
          String t = "Python";
          String b = new String("Python");
//        // if you compare this with == then the answer would be false
//        // if you compare this with equals() then it would be true
          boolean doesntEqual = t == b;
          boolean itDoesEqual =  t.equals(b);
          System.out.println(doesntEqual);
          System.out.println(itDoesEqual);






    }
}
