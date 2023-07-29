package ForLoop;

import java.util.Scanner;

public class rowsColumns {
    public static void main(String[] args) {
        // write a java program to print rectangle star pattern using for loop
        // get the number of rows and columns from user.
        Scanner input = new Scanner(System.in);
        System.out.println("Print number of Rows: ");
        int rows = input.nextInt();

        System.out.println("Print number of columns: ");
        int columns = input.nextInt();

        for (int i = 1; i<=rows; i++){
            for (int k = 1; k<=columns; k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
