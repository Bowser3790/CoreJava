package Overriding;

public class animal {
    public void eat(){
        System.out.println("animals eat ");


    }
    public animal create(){
        return new animal(); // this is creating a new animal object
        //
    }
    public String word(){ // String in Java is a data type and a class.
        return "Tom";
        //what is string in Java?
        // class can be return types as well.
        // Why? because every class is a data type at the same time.
        // what is animal? class as well
        // non-primitive data types can be infinity
        // every class is a non-primitive data type.
        // you can use java classes as return type for these reasons above.

    }
}
