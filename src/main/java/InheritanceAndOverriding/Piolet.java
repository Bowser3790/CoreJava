package InheritanceAndOverriding;

import accessModifierAndConstructors.Honda;

public class Piolet extends hyudai {

    public void soundSystem(){
        System.out.println("Bose Sound System");
    }
    public Piolet(){
        super(2020);
        System.out.println("Piolet constructor super");


    }
    public Piolet(boolean hybrid){
        this();
        System.out.println("using this constructor Piolet");

    }

}
