package ForLoop;

public class LoopInterviewQ {
    public static void main(String[] args) {
        String t = "Hello";

        for (int i = 0; i<t.length(); i++){
            if (t.indexOf(t.charAt(i)) != t.lastIndexOf(t.charAt(i))){
                System.out.println(t.charAt(i));

            }
        }
        // how do you reverse a word...
        String u = "Ali Can";


        for (int i = u.length()-1; i>0; i--){
            char ch = u.charAt(i);
            System.out.println(ch);
        }

        int sum = 0;

        for (int z = 3; z < 8; z++){
            sum = sum + z;
            System.out.println(sum);
        }

        // Type code to calculate the multiplication of integers from 3 to 6

        int multiplication = 1;

        for (int q = 3; q<7; q++){
            multiplication = multiplication * q;

        }
        System.out.println(multiplication); // use outside of loop if you want just the sum of the whole loop.
        // if you want all the sum's of each loop then put sys.out inside the loop.

        // Type the code to find the sum of the digits in a given integer

        int num = 478;
        int sumOfNum = 0;

        for (int e = num; e>0; e=e/10){
            sumOfNum = sumOfNum + e%10;
        }
        System.out.println(sumOfNum);

        // Note 1: if you want to get the last digit if an integer use "number%10"
        // Note 2: if all numbers are Integers in a mathematical operation, the result will be in "Integer" data type.
        // if the result is in decimal data type, Java converts the decimal to Integer by removing the decimal part.
        // Java does not do rounding operation to convert decimals to integers
        // 57/ 10 = 5

        // Note 3: If you use different data types in a mathematical operation, the result will be in the largest data type.
        // 12/5.0  is 2.4
        //

    }
}
