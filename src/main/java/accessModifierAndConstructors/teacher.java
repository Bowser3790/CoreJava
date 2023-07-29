package accessModifierAndConstructors;

public class teacher {
    public String name = "Tom"; // public is available to the entire project

    protected long phone = 9787776557L; // protected is available to the classes in the package and the
    // classes outside the package if the classes are child classes

    int salary = 6000;// available in the project

    private String ssn = "0030040005"; // only available inside the class
}
