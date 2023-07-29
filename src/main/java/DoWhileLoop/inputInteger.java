package DoWhileLoop;

import java.util.Scanner;

public class inputInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");


        int num = input.nextInt();
        num = Math.abs(num);

        int sumOfDigits = 0;

        while (num>0){
            sumOfDigits = sumOfDigits + num%10;
            num = num/10;
        }
        System.out.println(sumOfDigits);


    }
}
