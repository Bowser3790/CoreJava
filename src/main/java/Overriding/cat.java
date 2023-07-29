package Overriding;

public class cat extends mammal{
    @Override // overriding annotation => that checks the overriding rules.
    public void eat() {
        System.out.println("cats eat...");

        // this is overriding the parent method "Animals Eat"
        // instead this will run a more specific string to the current
                                        // class you are in. You don't want to say animals eat you want to say specifically
                                        // cats eat
                                        // in overriding method names should not be changed.
                                        // eat() needs to remain the same.
                                        // parameters should also remain the same.
                                        // if I put eat(int num) in parameter java will complain.
        // overriding is just for updating method(){body} => override body only
        /*
        1) Sometimes using method Directly from parent class may not be enough for us
        - we may need the method to specify.
        - when we need the method to specify, we can change the method body only.
        = this is called "Method Overriding"
        2) We cannot touch "Method Signature" (Method Name and Method Parameters) in "Method Overriding"
        3) The method in child class(Overriding Method) can use "same" or "wider" access modifier than the method in parent class
        - this means if I use protected access modifier then the options I have are protected or public access modifier.
        4) When you Change the "return type" in "method overriding", from child to parent you must have "IS-A" relationship.
        5) Return type of the overridden Method can be the "Top return Type" of the overriding method.
        6) If there is "IS-A" relationship between return types, those called "Covariant Return Types"
        7) Between the wrapper classes there is no parent-child relationship That is why you cannot have "IS-A" relationship
        If you do not have "IS-A" relationship you cannot change return type in "method overriding"
        8) Between the primitive data types there is no parent-child relationship that is why you cannot have "IS-A" relationship
        If you do not have "IS-A" relationship you cannot change return type in the "Method Overriding"
        9) If the return type is void you cannot change it in method overriding.
        10) Private methods in parent class cannot be overridden.
        11) Static Methods cannot be overridden

        can you override main methods? interview question.
        - no you cannot because main methods are static.
        - if you override a static method. Other classes that are dependent upon that. Therefor it is dangerous to override.


         Interview: what is the meaning of final variables, what is the meaning of final class, what is the meaning of final method?
         "final" keyword in Java:
         1) "final" keyword can be used for variables
         - If you use "final keyword for variables:
         i. You have to initialize the variable
         ii. After assigning a value you cannot update the value
         2) "final" keyword can be used for classes
         i. If you use "final keyword for a class, the class cannot have "child class"
         3) "final" keyword can be used for methods the methods cannot be overridden
         The body of a final method cannot be updated, so it cannot be overridden because in
         overriding we update the method body

    12) Polymorphism = Method Overloading + Method Overriding
    What is the difference between these two?
    i) "Method Overriding" needs "Inheritance"
    - if there is no inheritance there is no method overriding.
    - because in method overriding child will take some methods from parent and use it after updating.
    - if there is no child class there is no parent class there is no overriding
    - so inheritance is a must for overriding
    - but in overloading we are creating methods with the same name and different parameters in a single class
    - no need to have child or parent class.
    ii) method overloading happens in a single class and does not need "inheritance"
    - private methods cannot be overridden but can be overloaded.
    - We do not touch method signature in method overriding but we change "parameters" or method signature in "method overloading"
    - We cannot override "Static" methods but we can "overload" them
    -
    iii)
    Other name of Method Overloading is static polymorphism
    other name of method overriding is dynamic polymorphism.

    iV)
    another name of Method Overloading is Compile time polymorphism ==>
    another name of method overriding is Runtime polymorphism. ==>

    why compile time? ==> (Compilation Error) when you are typing the code it will give you notification when you make any mistakes
      - that's why java created override annotation to check overriding rules when you type the code

    why runtime? ==>> if you don't put @Override annotation, java doesn't check your code when you type the code
        - when you run the code it will give error
      - you will understand the issue after running the code.
      - normally overriding will not check you code when you type something wrong.

         */

    }

    @Override
    public mammal create() {
        return new cat();
    }
    @Override
    public cat occur(){
        return new cat();
    }


}
