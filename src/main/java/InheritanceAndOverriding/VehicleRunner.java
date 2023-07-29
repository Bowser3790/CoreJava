package InheritanceAndOverriding;

/*
1) Every class except object class has a parent class in Java
2) Object class is the parent class of all classes in Java
3) Just object class does not have parent class in java
4) Java executes "constructors from top to bottom in inheritance
5) To be able to execute "Constructors" from top to bottom, Java goes to the "Object Class" first by the help of
"super()" code
6) "super()" is for calling constructor from the first level "Parent class"
7) "super()" is located by Java into every "constructor" but it is invisible.
8) If you want to make it visible, you can type it explicitly
9) When you type "super()" explicitly, you have to type it into the first line inside the constructor.

10) this() is for calling constructor from the class itself
11) When you type this() it needs to be the first line inside the constructor.
- this is the same for super() they both need to be on the first line in order to work.
- so they cannot be used in the same constructor together.

12) If a variable exist in a class java uses the variable from the class itself
13) If a class does not have the requested variable in it, Java looks for the variable in the parent class.
14) If you use "this" inside the constructor, it means you are calling a variable from the class itself.
15 If you use "super" inside the constructor, it means you are calling a variable from the first level parent class


some interview questions that might come up...

what is the different between this() and super()?
1. Super() is for calling constructor from the first level parent class
- Super is for calling the variable from first level parent class
2. this() is calling the constructor from current class that you are in.
- this() is for calling the variable from the class itself.
what is the difference between primitive and non-primitive data?

what is the difference between using inheritance and not using inheritance?

- what is the difference between constructors and methods.


 */

public class VehicleRunner {
    public static void main(String[] args) {



        hyudai myHyundai = new hyudai();
        myHyundai.gas();

        Civic myCivic = new Civic(true);
        myCivic.movesFast();
        myCivic.turbo();
        myCivic.price();

        int hashcode = myCivic.hashCode();
        System.out.println(hashcode);


        vehicle myVehicl = new vehicle();
        myVehicl.movesFast();



    }
}
