package HashTables;

import java.time.LocalDate;

public class StaticBlock {
    // when you talk about static block
    /*
    when you talk about static you can say:
    - static variables - they are created together with the class
    - Java Class Loader - when you run an application this loads all classes to the memory.
    - if the variable is static this is loaded into the memory with the class.

    Non-Static Variable are created with the object.
    - called instance or object variables
    - non-static variables are not loaded with the class.

    To Initialize variables you have 2 options
    i. Initialize directly like: public static int price = 500;
    ii. Initialize by using "Static Block"
    why do we need Static Block to initialize a static variable?
 1) sometimes to initialize a static variable we need to type code, to do that use static block.
- we dont always use a block for creating methods sometimes we just need to initialize a variable.
2) Static Blocks are executed before everything in a class even the main method.

3) Instance Blocks are used if you want to execute the same code in all constructors in a class. If you need
the same code for multiple constructors then there is no need to type it 10 times you just need to type it once.

    - if you are not going to use variable why are you loading it into memory...
    - example: if you are not going to drive a truck why are you going to buy the truck?

    i.
     */

    public static int price;
    static {
        LocalDate d = LocalDate.now();

        if (d.getMonthValue()==2){
            price = 1000;

        }else{
            price = 2000;
        }
    }
}
