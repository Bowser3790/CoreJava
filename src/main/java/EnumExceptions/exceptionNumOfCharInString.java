package EnumExceptions;

public class exceptionNumOfCharInString {
    // create a method to count the number of characters in a string.
    public static void main(String[] args) {
        String S1 = "Java";
        String S2 = null;
        System.out.println(getNumOfCharInString(S1));
        System.out.println(S2);

    }
    public static int getNumOfCharInString(String s){
        try{
            return s.length();

        }catch (NullPointerException e){
            System.out.println("Please enter a string other than null...");
            return 0; // return 0 because we have an int return type.

        }

    }
}
