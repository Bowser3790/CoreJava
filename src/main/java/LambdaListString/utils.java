package LambdaListString;

import LastLambdaDay33.Course;

import java.util.List;

public class utils {
    /*
    Utils class is storage for useful things:
    Interview Question:  Are you using Utils class in your project?
    every project has utils class. Yes, I use the Utils class
    what methods did you use for your project from the UTILS class?
     */

    public static void printInTheSameLineWithSpace(Object s){
        System.out.print(s + " ");
        // why did we use Object rather than String, Char, Int etc...
        // because if we use Object it will work for all of them.
    }
    public static int getSquare(int n){
        return n*n;
    }
    public static int getSumOfDigits(int num){
        int sum = 0;
        while (num!=0){
            sum = sum + num%10;
            num = num / 10;
        }
        return sum;



    }
}
