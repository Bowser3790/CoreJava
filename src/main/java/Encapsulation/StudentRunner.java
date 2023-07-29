package Encapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student myStudent = new Student();
        String psycho = myStudent.getPsychologicalIssues();
        System.out.println(psycho);



        boolean studentSuccess = myStudent.isSuccess();
        System.out.println(studentSuccess); // true => this is using getter() where we are trying to read the data

        // when we are trying to set the data it will be different

        myStudent.setSuccess(false);

        boolean studentSuccess1 = myStudent.isSuccess();
        System.out.println(studentSuccess1);
    }

}
