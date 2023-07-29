package EnumExceptions;

public class exceptionConvStrToIntDivideByChar {
    public static void main(String[] args) {
        String S1 = "240";
        System.out.println(divideStringByNumOfChar(S1));
        String S2 = "2a3v";
        System.out.println(divideStringByNumOfChar(S2));// numberFormatException
        String S3 = null;
        System.out.println(divideStringByNumOfChar(S3));
        String S4 = "";


    }
    // Create a method convert String to integer and Divide by (number of characters in the string -1);
    // String s = "240" 240/3 = 80
    // how did we handle multiple exceptions? interview question possible... or which exceptions have you used or seen?
    // we use multiple catch blocks to handle multiple exceptions or single catch block
    /*
        if you prefer to use 1 catch block use "Exception" in catch Parenthesis
        when you use multiple catch blocks the order is not important if and only if the Exception classes do not have
        parent child relationship among them.
        if there is a parent child relationship the child must be used first or your code will be unreachable and
        will throw an error.
     */

    public static int divideStringByNumOfChar(String s){ // 3 exceptions are possible in this scenario.
        int result = 0;

        try{
            int I1 =  s.length(); // null pointer exception is possible
            int I2 = Integer.valueOf(s); // non-digit characters NumberFormatException is possible
            return I2 / (I1-1); // ArithmeticException is possible

        }catch (NullPointerException e){
            System.out.println("Most likely the string is null... " + e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Most likely the string has contains non-digits... " + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Most likely the string divisor is zero... " + e.getMessage());
        }
        return result;
    }

}
