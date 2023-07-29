package EnumExceptions;

public class exceptionUserAge {
    public static void main(String[] args) {
        // create a method to print users age on the console,
        // if the age is negative the user age should not be printed on the console.
        printAge(23);
        printGrade(101);

    }

    public static void printAge(int age) { // we use void here because the question tells us to print on the console. no return val.
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be less than 0");

        }
        System.out.println("Your age is " + age);

    }

    public static void printGrade(int grade) {
        if (grade < 0) {
            throw new IllegalArgumentException("Grade cannot be less than 0. Grade Entered: " + grade);//dynamic message

        } else if (grade> 100) {
            throw new IllegalArgumentException("Grade cannot be more than 100. Grade Entered: " + grade);//dynamic message

        }
    }
}
