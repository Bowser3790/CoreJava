package DoWhileLoop;

import java.util.Scanner;

public class PasswordDoWhile {
    public static void main(String[] args) {
        // Username is admin, pass is pwd123
        // ask user to give you user name
        // should see "Enter your username and password" message
        // if user enters correct credentials, he should get  you are in your account" message
        // otherwise, he should see " enter your username and password" message 3 times
        // after 3 times he should get "You account has been blocked"

        Scanner input = new Scanner(System.in);


        int counter = 0;

        do {
            if (counter == 4) {
                System.out.println("You account has been blocked");
                break;
            }
            System.out.println("Please enter your username:");
            String username = input.next();
            System.out.println("Please enter your password:");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")) {
                System.out.println("You are in your account");
                break;
            }else{
                System.out.println("Your user or password is incorrect.");
            }
            counter++;
        }while(true);
    }
}
