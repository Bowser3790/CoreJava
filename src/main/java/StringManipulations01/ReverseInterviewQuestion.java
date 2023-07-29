package StringManipulations01;

public class ReverseInterviewQuestion {
    public static void main(String[] args) {
        // write a program to reverse a string
        String origionalString = "anna";
        String reverseString = "";

        for (int i = origionalString.length()-1; i>=0; i--) {
            char ch = origionalString.charAt(i);
            reverseString = reverseString + ch;
        }
        if (reverseString != origionalString){
            System.out.println("No, reverseString is NOT Palindrome");
        }else{
            System.out.println("Yes, reverseString IS a Palindrome");
        }



        }
        //System.out.println(reverseString);
    }


