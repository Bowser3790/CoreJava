package accessModifierAndConstructors;

public class teacherRunner {
    public static void main(String[] args) {
        teacher myTeacher = new teacher();
        System.out.println(myTeacher.name);

        System.out.println(myTeacher.phone);

        System.out.println(myTeacher.salary);

        //System.out.println(myTeacher.ssn);// notice you cannot access this
        // this ssn is a private class and cannot be accessed outside the class
        // if you are in a different package default variables will be unaccessable
        // If you are in a different package and the class you created the object
        // in is not the child class, protected variables will be "un-accessable"
        // by default (when we dont mention public or private access modifier) packages are private and if you try to
        // access a package from outside you will not be able to \

    }
}
