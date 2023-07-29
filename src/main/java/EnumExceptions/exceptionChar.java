package EnumExceptions;

public class exceptionChar {
    public static void main(String[] args) {

        System.out.println(getCharFromString("Get me the char from this string", 8));
        System.out.println(getCharFromString("Get me the char from this string", 50));// see below for error
        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 50

        }
    public static char getCharFromString(String s, int idx){
        try {
            return s.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Please use an index greater than -1 and less than length() -1");
            return ' ';
        }

    }
}
