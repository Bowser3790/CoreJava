package ReadFileIOExceptions;

public class customIllegalAgeRunner {
    public static void main(String[] args) {
        printAge(25);
        printAge(-25);

    }
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be less than 0");

        }else{
            System.out.println("Your age is: " + age);
        }

    }
}
