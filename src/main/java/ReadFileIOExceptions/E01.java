package ReadFileIOExceptions;

public class E01 {
    /*
    What are the difference between throw and throws Keywords?
    where do we use throw and where do we use throws?
    i. first difference:
    1) "throw" is used inside the "method body", such as IllegalArgumentException, when age is less than 0.
    2) "throws" is used in the "method signature" line.

    ii. second difference:
    1) "throw" can be used multiple times in a method body.
    2) "throws" can only be used once in the "method signature" line.

    iii. third difference:
    1) after "throw" we create an exception object.
    2) after "throws" we type just the name of the "exception class".

    iv. fourth difference:
    1) after "throw" you can throw just a single exception.
    2) after "throws" you can throw multiple exceptions.

    v. fifth difference:
    1) throw can be used just to throw runtime exception (un-checked exception) and cannot throw compile time
    exception(checked exceptions) *could be asked in an INTERVIEW*.
    2) "throws" can be used to throw both runtime and compile time exceptions.

    How do we create our own exception classes?
    1) Java created its own exception classes like division / 0 exception to create a red light to let you know the rules
    to create are ouw strict rules in our application we create our own exception classes called "custom exception Classes"
    2) "Custom exception classes" can be runtime or compile time exceptions
    i. to create runtime you must extend to "runtime exception classes"
    ii. to create compile time you must extend to "exception class"

    every exception class and custom exception class should have "Exception" keyword at the end of the variable.


     */

}
