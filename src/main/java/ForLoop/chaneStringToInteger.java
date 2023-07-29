package ForLoop;

import java.util.Scanner;

public class chaneStringToInteger {
    public static void main(String[] args) {
        // when getting charecters from a string there are 2 methods you could use
        //        // 1. char charAt() or 2. substring(i, i+1);
        //        // type code to find the sum of unique digits in an integer 123214
        // in this problem we will be changing string value to integer using Integer.valueOf(ch)=> ch is the container we created.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a random set of numbers: ");
        String Num = input.next().replaceAll("[^0-9]", "");

        int sumOfUniqueNum = 0;

        for (int i = 0; i<Num.length(); i++){
            String ch = Num.substring(i,i+1);
            if (Num.indexOf(ch) == Num.lastIndexOf(ch)){
                sumOfUniqueNum = sumOfUniqueNum + Integer.valueOf(ch); // changes string to integer
            }
        }
        System.out.println(sumOfUniqueNum);

    }
}
