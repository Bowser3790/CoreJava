package PassingValuesArgs;

public class MethodOverLoading {
    public static void main(String[] args) {


        // multiply two integers
        int result = multiply(14, 14);
        System.out.println(result);

        // how do you call methods



        // multiply(3.2,5);


    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    // create a method that multiplies one double and one integer;
    public double multiply(double a, int b) {
        return a * b;
    }

    // create a method that multiplies one int and one double;
    public double multiply(int a, double b) {
        return a*b;

    }

    //Create a method multiplies three integers
    public int multiply(int a, int b, int c) {
        return a*b*c;

    }
}

