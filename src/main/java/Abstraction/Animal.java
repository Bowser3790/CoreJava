package Abstraction;

public abstract class Animal {

    /*
    1) sometime in method we do not need the body because it's not specific to the child classes which will not use the
    body. This is why we should not type it.
    If we do not type the method body this means the method will not have a body and this is called "Abstract Method"

    2) Methods with body is called "concrete method"

    3) Concrete methods focus on "How to do it". Abstract methods focus on "What to do".

    4) When you create Abstract Method in parent class, the functionality is mandatory for the child class.

    5)  If functionality is not mandatory then create a concrete method.
        If functionality is mandatory then create abstract method.

    6) to create an abstract method
        i. Remove method body
        ii. (method level) abstract keyword between access modifier and return type.
        iii. (Class level) change the concrete class to abstract class by using abstract keyword between
        "access modifier" and class keyword.

     * how to explain in an interview:
     - Dog class is child of animal class which is using eat() with no method body. Child must implement abstract methods()
     or you will get a compile time error.

     7) after creating an abstract method don't forget to use them in all concrete child classes.
     - if you don't use them all in concrete child classes you will get compile time error.
    Making child class abstract:
     - you can make child classes abstract by using abstract keyword between access modifier and class keyword.

    8) You can use both concrete methods and abstract methods in abstract class.
    - concrete methods inside abstract classes is optional
    - abstract methods inside abstract classes are not optional

    9) Abstract classes can have "Abstract Methods" => Abstract Methods are un-complete methods => no body
    - if you create an object from an abstract methods the object will have missing body parts.
    - Meaning the object will not be perfect, if the object is not perfect it can cause issues in the application
    - Because of this java will not allow you to create an object from an abstract class.

    10) Abstract classes are classes that have a constructor => like other classes but the constructor cannot create an object

    11) We create abstract classes and methods for child classes to use. Therefore, if you make the access modifier
        "private" then you are saying you dont want the child class to be able to see it and this is a contradiction.
        Java complains and does not allow you to use private access modifier with abstract methods.

     Can abstract classes be private? trick question
     - this is because all classes no matter if they are abstract or not have the availability of
     'public or protected' there is no option for private when talking about classes.

     12) 'Static' -> can abstract methods be static?
     - no - Why?
     - we don't want to change static methods because you will affect other classes and methods that are dependent on
     that method. We dont want birds eating like a cat or dogs eating like a cat. This will not be good.

     13) when you use an abstract method you should obey overriding rules
     for example if you have a public method you can not change child method access modifier to protected because it is
     more narrow than public and this is not allowed.


for final class we have to initialize the variable and you cannot override/ update/ change the value.

final classes cannot have child class and cannot extend the class

Note: final methods cannot be abstract, java does not allow it because this is a contradiction.
abstract methods do not have a body. Child classes need to determine the functionality by changing the body
from no-body to have body. final methods() need to keep their body because it is final. this means that
java does not allow final methods.

Benefits of abstraction
1) don't have to type code that is not being used. Don't type unused code.
2) If you want to focus on "what to do" rather than "how to do" then use abstract methods()
3) If you want to make functionality mandatory for the child classes then use abstract methods()


    Interview Question:
    Explain abstraction!



     */

    public abstract void eat(); // this method is not optional in the child classes

    public void play(){
        System.out.println("Animals Play.");
    }

    public final void drink(){
        System.out.println("Drinking water...");
    }



    }

