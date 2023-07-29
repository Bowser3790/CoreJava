package accessModifierAndConstructors;

public class StudentsRunner {

    // when you see runner class this is the class that has the main method in it.
    public static void main(String[] args) {
        Students std1 = new Students("Timmy", 18, true, "male" );

        Students std2 = new Students("Alex", 22, "Male");

        Students std3 = new Students();

        System.out.println(std1.stdName);
        System.out.println(std2.success);// default value for boolean is false
        // success variable is not in std2 and will go to default for value
        // int default value is 0
        // string default value is null
        System.out.println(std3.age);

    }
}
