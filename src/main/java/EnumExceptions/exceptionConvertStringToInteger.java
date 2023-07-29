package EnumExceptions;

public class exceptionConvertStringToInteger {
    public static void main(String[] args) {
        String str1 = "2019";
        String str2 = "1a2b";
        System.out.println(convertStringToInteger(str1) + 5);
        System.out.println(convertStringToInteger(str2));
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "1a2b"
        // we need to add this into our try catch block.
        //
        // Interview question: what is a NumberFormatException:
        //
        // Answer: if you have a string that your converting "123" you will be 'ok' with ValueOf() method
        // if you use the string "1a2b" valueOf() method will not convert letters to numbers and will throw a
        // NumberFormatException


    }
    // create method to convert string to integer.
    public static int convertStringToInteger(String s){
        try{
            return Integer.valueOf(s);
        }catch (NumberFormatException e){
            System.out.println(s + ", java is unable to convert letters to numbers with valueOf() method, only use numbers");
            System.out.println(e.getMessage());// how to get technical message rather than message you created.
            e.printStackTrace();// a lot of details about error. Use e.printStackTrace() method
            return 0;
        }
    }
}
