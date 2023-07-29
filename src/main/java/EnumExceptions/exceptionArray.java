package EnumExceptions;

public class exceptionArray {
    public static void main(String[] args) {
        String a[] = {"Tom", "Mary", "Bonnie", "William", "Tony"};
        System.out.println(getElement(a, 2));
        System.out.println(getElement(a,5));//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 5 out of bounds for length 5

    }

    // Create a method to get any string array.
    public static String getElement(String[] a, int idx){
        try {
            return a[idx];// need a return statement for all blocks

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Do not use values 0 or greater than Length-1");
            return ""; // when you say I am going to return a String in the method String getElement()
            // you need to return a string in the try block and the catch block.

        }

        }

}
