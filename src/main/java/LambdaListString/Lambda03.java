package LambdaListString;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {
        System.out.println(getSum(7,100));
        System.out.println(getMultiplication(2,11));
        System.out.println(getFactorial(11));
        System.out.println(getSumOfAllDigitsBetweenTwoInt(45,46));

    }
    // create a method to find the sum of integers from 7 to 100
    public static int getSum(int starting, int ending){
        // same as this if statement below.
        // if(starting>ending){
         //   int temp = starting;
        //    starting = ending;
         //   ending = temp;
        //} this will swap the starting number to ending number.
        return IntStream.rangeClosed(starting, ending).sum();
    }
    // create a method to find multiplication of integers from(2 inc) to (11 inc)
    public static int getMultiplication(int starting, int ending){
        return IntStream.rangeClosed(starting, ending).reduce(Math::multiplyExact).getAsInt();
        // getAsInt() converts the Method Expression into Integer.
    }

    // create a method to calculate the factorial of a given number (5! = 1*2*3*4*5)
    public static int getFactorial(int number){
        if (number == 0){
            return 1;
        } else if (number<0) {
            number = Math.abs(number);
            
        }
        return IntStream.rangeClosed(1,number).reduce(Math::multiplyExact).getAsInt();
    }
    // create a method to calculate the sum of even intgers between two numbers.
    public static int getEvenIntBetweenTwoNumbers(int starting, int ending){
        return IntStream.rangeClosed(starting,ending).filter(t->t%2==0).sum();
    }
    // create a method to calculate the sum of digits of every integer between two integers.
    public static int getSumOfAllDigitsBetweenTwoInt(int starting, int ending){ // 45 46 47 = 4+5+4+6+4+7

        return IntStream.rangeClosed(starting, ending).map(utils::getSumOfDigits).sum();
    }
}
