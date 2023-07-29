package PassingValuesArgs;

public class CreatingMethods {
    public static void main(String[] args) {
        int r1 = addTwoInt(10, 70);
        System.out.println(r1);

        String firstLast = getFirstAndLastChar("Angelina Jolie");

        int r3 = getSumOfAsciiChar("Skippy");
        System.out.println(r3);

    }
    // create a method that adds two integers

    public static int addTwoInt(int a, int b){
        return a+b;

    }
    // create a method that prints the first and the last character of a string on the console
    public static String getFirstAndLastChar(String s){

        return  "" +  s.charAt(0) + s.charAt(s.length()-1); // if you put the "" at the beginning of the code
                                                                    // you are able to concatinate
                                                                    // if you do not then this will add ascii values
                                                                    // "Ae"
    }
    // create a method that prints the sum of the ASCII values of characters in a string



    public static int getSumOfAsciiChar(String s){
        int sumOfAscii = 0;

        for(int i=0; i<s.length(); i++){
            sumOfAscii = sumOfAscii + s.charAt(i);// this is taking the ascii value of the character and adding them
        }
        return sumOfAscii;
    }
}
