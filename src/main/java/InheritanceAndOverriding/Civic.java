package InheritanceAndOverriding;


public class Civic extends hyudai {

    public void turbo(){
        System.out.println("Turbo wizz");
    }
    public Civic(){
        super(2021);
        System.out.println("Civic Constructor");
    }
    public Civic(boolean hybrid){
        this();
        System.out.println("Civic constructor with boolean parameters ");
    }
}
