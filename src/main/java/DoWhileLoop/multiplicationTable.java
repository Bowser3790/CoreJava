package DoWhileLoop;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for multiplication table: ");

        int n = input.nextInt();
        int multiplicationTable = 1;

        while (multiplicationTable<11){
            System.out.println(n + "X" + multiplicationTable + "=" + (n*multiplicationTable));
            multiplicationTable++;
        }
        // difference between a while and do while loop is that a while loop: zero execution is possible
        // with a do while loop zero execution is impossible.




    }
}
