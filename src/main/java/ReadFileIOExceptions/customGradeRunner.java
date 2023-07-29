package ReadFileIOExceptions;

public class customGradeRunner {
    public static void main(String[] args) throws customGradeException {
        printGrade(50);
        printGrade(101);


    }
    public static void printGrade(int grade) throws customGradeException {
        if(grade < 0){
            throw new customGradeException("Grade cannot be less than 0, re-enter grade:");


        } else if (grade>100) {
            throw new customGradeException("Grade cannot be more than 100, re-enter grade:");


        }else {
            System.out.println("Your grade is: " + grade);
        }
    }
}
