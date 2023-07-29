package accessModifierAndConstructors;

public class Students {
        /*
        1. we need a constructor to create a object from a class
        2. When we create a class in Java, Java automatically creates a constructor
        3. When we create a class we will not see a constructor (invisible).
        4. Invisible constructor is called "Default Constructor".
        5. To create a constructor do the following steps
            i. access modifier we will typically use a public access modifier.
            ii. use class name as constructor name
            iii. open closed constructor parenthesis
            iv. open closed curley braces

        6. when you manually create a constructor Java will automatically delete Default constructor.
        7. we can create many constructors in a class.
        i. Constructor names will be the same because every constructor uses class name as name.
        ii. Every constructor must have different parameters.
        8. What are the differences between method and "Constructor"?
            i. Methods have return types and constructors do not.
            ii. Methods are for actions and constructors are for object creation.
         */

    // default constructor is the same with the following constructor.
       // public students()

        public String stdName;
        public int age;
        public boolean success;
        public String gender;

    // create a constructor that uses variables.
        public Students(String stdName, int age, boolean success, String gender){
            this.stdName=stdName;
            this.age=age;
            this.success=success;
            this.gender=gender;

        }
        public Students(String stdName, int age, String gender){ // you can have many constructors in each class
                                                                // each constructor can use different variables
            this.stdName=stdName;
            this.age=age;
            this.gender=gender;
    }

        public Students(){

        }
        // to generate constructor automatically right click on screen
    // click generate
    // constructor
    // then select the variables you want in your constructor.

}
