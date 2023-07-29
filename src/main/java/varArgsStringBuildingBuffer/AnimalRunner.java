package varArgsStringBuildingBuffer;

public class AnimalRunner {
    public static void main(String[] args) {
        Cats myCat = new Cats();
        myCat.meow();

        Dogs myDog = new Dogs();
        myDog.bard();
        myDog.eat();
        myDog.drink();

        Birds myBird = new Birds();
        myBird.tweet();
        myBird.eat();
        myBird.drink();
        // because of inheritance all of these objects have access to animal class where the common actions are occurring.
        /*
        Inheritance prevents the following issues
        i. Repetition
        ii. Difficulty in updating code
        iii. Difficulty in fixing code
        iv. Prevents atomic structure
        - Atomic Structure means don't put many things into a single class separated. Make every class as small as
        possible. If you can type your code in an atomic structure then your application will be fast.

        Child (sub) classes can use methods or variables from parent (super) classes but parent classes cannot use
        methods or variables from child classes

        For public and protected classes there are no issues with using inheritance.
        if you do not use access modifier then the default values will be accessible for inheritance.

        Default access modifier; if the class is in the same package inheritance is possible, but if the object and
        the parent class are in different packages then inheritance is impossible.

        private cannot use inheritance.

        "IS-a" ==> this means from child to parent relationship
        "HAS-a" ==> this means from parent to child relationship

        Java only accepts one parent class for child but a parent class can have many children.
        Java supports single inheritance.

        There can be grandparent inheritance. Multi-level inheritance.

         */

    }
}
