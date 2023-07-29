package Encapsulation;

public class Student {
    // 1) When we type code, we may need to hide code for certain reasons.
    // Encapsulation means; hiding code
    // 2) After encapsulating data if you need to read the value you can use get() method (getter) See Student Runner
    // class for example.
    /*
    3) in getters:
        i. Access Modifier is public
        ii. Return type must be the same data type of the variable
        iii. (Structure) "Method Name" should be the same as the variable with "get" for String or "is" for boolean
        example: get + <variableName> for string, is + <variableName> for boolean
        iv. (Body Structure) "Method Body" will have return + <variableName>

     4) after encapsulating data you might need to update the value by using the "set method" aka setter.

     5) in setters: if there is no return type make sure to use void.
        i. Access Modifier is public
        ii. Return type must be void
        iii. (Structure) "Method Name" should be the same as the variable with "set" (set + <variableName>)
     Use set() to update in coding (like in lists set method is used to update list.)
        iv. Setters use parameters the parameter will be the same as the variable.


     benefits of encapsulation:

     6) If you want to create a "hidden", "updatable" but not readable" variable:
        i. make access modifier private
        ii. create a set method() for the variable
        iii. do not create a get method for the variable.

     */
    public String stdName;
    int stdGPA;

    private String psychologicalIssues = "Attention D D";
    private boolean Success = true;


    public String getPsychologicalIssues(){
        return psychologicalIssues;
    }
    public boolean isSuccess(){
        return Success;
    }
    public void setSuccess(boolean Success){ // this is called passing the value... passing value to this.success from the parameter.
        this.Success=Success;
    }


}
