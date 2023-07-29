package EnumExceptions;

public class enum01 {
    public static void main(String[] args) {
        // exception means unexpected issues in coding
        /*
        when we have an exception we can handle it in two ways.
        i. Try-Catch Block
        ii. Throw exception and stop the application.
        We handle the exception mostly, if you do not handle the exception.
        i. Execution will be stopped.
        ii. Application will be blocked.
         */
        // Example 1. create a method that divides two integers

        // INTERVIEW QUESTION:
        //If the code you type doesn't work what should you do?
        // it is not working as expected...
        // I will read the Logs and
        // I will read the error messages.

        // **note that all methods in the exceptions package have different exceptions please focus on the
        // exceptions for each**


    System.out.println(divide2(10000, 80));
    System.out.println(divide2(0,10));
    System.out.println(divide2(10,0)); //Exception in thread "main" java.lang.ArithmeticException: / by zero



    }
    // using if else is not recommended. We are not math experts. Its difficult for a developer to learn all math rules.
    public static int divide(int a, int b){
        if(b==0){
            return 0;

        }else{
            return a/b;
        }


    }
    public static int divide2(int a, int b){
        int result = 0;
        try{
            result = a/b;
        }catch (ArithmeticException e){
            System.out.println("Do not divide by 0");

        }
        return result;
    }
}
