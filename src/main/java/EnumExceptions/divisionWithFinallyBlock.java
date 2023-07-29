package EnumExceptions;

public class divisionWithFinallyBlock {
    public static void main(String[] args) {
        // Create division method and the method should print "Successfully Completed" even if exception is
        // thrown or not

        /*
        Interview Question:
        are you able to use try block alone? no
        are you able to use try block without catch block? yes, you can use finally block with try block.

        finally block is used to execute code whether the exception is thrown or not.
        1) you CANNOT use "Try" Block alone
        i. you can... use "Try" Block with a single "catch" Block
        ii. you can... use "Try" Block with multiple "catch" Blocks
        iii. you can... use a "Try" Block with a single "catch" Block and a single "finally" Block
        iv. you can... use a "Try" Block with multiple "catch" Blocks and a multiple "finally" Block
        v. you can... use a "Try" Block with just a "finally" Block
        vi. you can only use "finally" Block just once.

        Interview Question:
        Can you tell the differences between "Final", "Finally" and "Finalize" keywords?
        - Final variable, final method, final class
        i. final Variable must be initialized and cannot be updated
        ii. final methods cannot be overridden because their body cannot be changed.
        iii. final class can be child cannot have a child

        - Finally, talk about everything we have above in the "try-catch block"

        - Finalize is constantly scanning the memory if there is something unused in memory Java deletes it.
        - "mother constantly cleans house and when there is something on the floor the mother throws it in the trash
           if there is something to be deleted then Java throws it in the trash. This is known as the
           "Garbage Collector" task.

        i. "Garbage Collector" throws unused things from memory into the trash but before throwing unused things into
        the trash Java finalizes the process and then throws into trash.
        ii. there is a finalize method() in Java this method is under java's control and will not listen to what we say.
        this is java's responsibility.

        - Difference between Exception and Error?
        in the "Throwable Interface" there is Exceptions and errors.
        - the difference is that if you have an exception there are things that you can fix.
        - if you have an error there is nothing to fix because "you died" you can not fix things like
        "outOfMemory" and "stackOutOfMemory".
Compile Time Vs RunTime Exception
        - Exceptions are made of 2 parts "Runtime Exceptions" and "CompileTime Exceptions"
        - If you click on the green play button, you get an error after you click, it is called a runtime exception
        - If you do not click on the code and java is saying there is an error with a red underline it is a compileTime
        exception.

        Exceptions we worked with (INTERVIEW QUESTION) Which exceptions have you worked with?
        Runtime Exceptions:
        - ArithmaticException
        - NullPointerException
        - NumberFormatException
        - ArrayIndexOutOfBoundsException
        - StringIndexOutOfBoundsException
        - IllegalArgumentException
        CompileTime Exceptions:
        - FileNotFoundException
        - IOException


         */
        divide(4,2);
        divide(4,0);


    }
    public static int divide(int a, int b){
        int result = 0;
        try{
            result = a/b;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Sucessfully Completed");

        }
        return result;

    }
}
