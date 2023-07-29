package ForLoop;

public class Palindrome {
    public static void main(String[] args) {
        String str = "anna";

        // Step 1 is find the reverse of a string
        String reverse = "";
        for (int i = str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);

            reverse = reverse + ch;
        }
        // Step 2 is to compare the string with reverse
        if (str.equals(reverse)){
            System.out.println(reverse + " is a palindrome!");
        }else{
            System.out.println(reverse + " is not a palindrome.");
        }


    }
}
