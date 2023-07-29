package MiniProject;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counterNegativeNum = 0;
        int counterPositiveNum = 0;
        int total = 0;
        int number = 0;

        do {
            System.out.println("Please enter a positive number \n press 0 to finish ");
            number=input.nextInt();
            if(number<0){
                System.out.println("You can not put negative number: ");
                counterNegativeNum++;
            }else if(number>0) {
                total=total+number;
                counterPositiveNum++;
            }
        }while (number!=0);

        System.out.println("number of negative numbers entered by mistake " + counterNegativeNum);
        System.out.println("Number of positive number entered " + counterPositiveNum);
        System.out.println("sum of positive number entered " + total);




    }
}
