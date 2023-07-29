package Interface;

public class Honda implements AC, Engine{
    @Override
    public void cool() {
        System.out.println("AC cools well");

    }// there is no limit to how many classes you put into implements

    @Override
    public void heat() {
        System.out.println("AC heats well");

    }

    @Override
    public void run() {
        System.out.println("Engine runs Well");

    }

    /*
    1) A parent class may have too many methods, but putting too many methods into a single class will make the
    class way too big and confusing. Creating large structures in Java is not good, we should create atomic structures
    in Java where less is better.
    2) To prevent large parent classes we can group the methods and put them in different classes that need multiple
    parent classes. This practice of multiple inheritance is not supported in Java.
    3) If multiple inheritance is not supported then what can we do?
    - if you use Interfaces as parents Java will let you create multiple parents for a class.
    In conclusion, Multiple Inheritance is allowed for Interface.

    4) If you use a huge parent class, when any part is broken in the huge parent class then the class structure
     will be down.
     - If you create multiple small parents, when any functionality is down it will be one small functionality that will
     be down.
     - This is preferable.
     5) If you make a class completely dependable on another class completely then this is called tightly coupled.
     - when your class is broken then your other class will be broken as well. - this is not good
     - developers prefer to use loose coupling because they don't want their applications to be down.
     - want to create almost independent structures
     6) Interfaces are fully abstract: what does that mean?
     - interfaces cannot have concrete methods all methods in an interfaces must be Abstract.
     - What does that mean> abstract methods must be implemented by concrete child methods.
     - If you want a developer not to forget any "mandatory functionalities" to implement for a child class
     using interfaces is perfect.
     7) To make an "Interface" parent of a "Concrete" class use "Implements" keyword rather than extends.
        To make an "Interface" parent of another "Interface" use "extends" keyword
        To make a "class" parent of another "class" use "extends" keyword.
        * To make a class parent of an interface it is impossible.
     8) Methods in an interface are public and abstract that is why there is no need to type public and abstract
        when you create a method.
    9)  *Interfaces do not have constructor that is why you cannot create an object from an Interface.
        You cannot create an object from an abstract class as well, but abstract classes have a constructor, the
        constructor cannot create an object in this case...

        In summary, abstract structures cannot create objects.

    10) Do not make an abstract method "static" because static means methods cannot be overridden but abstract methods
        are written to be overridden, so do not try to make any method in an interface "static".
        - if static return type is used it must have a body=> exam question
        - if method has body in interface "default" needs to be used. => exam question
    11) By using the Default keyword before the return type you can give an abstract method a body.
    12) It is allowed to create methods with the same name in different parent interfaces. If you create methods with the
        same name in different interfaces then make sure the method signatures and method return types are the same as well.

        Notes about default:
        - Variables are final in an interface as default, that is why when you create a variable you have to initialize.
        - Variables are public in an interface as default, that is why when you create a variable there is no need to
          declare as public,
        - Variables are static in an interface as default, that is why when you try to access a variable there is no need
          to create an object, use just the interface name.

         - An interface may have public or default access modifier, you cannot use protected and private access modifier,
         same in classes.


     */


}
