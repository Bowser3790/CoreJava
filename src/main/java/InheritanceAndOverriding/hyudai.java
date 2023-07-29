package InheritanceAndOverriding;

public class hyudai extends vehicle {

    public void gas(){
        System.out.println("3.5 Liter");
    }
    public void brakes(){
        System.out.println("Brakes fast, anti-lock brakes");
    }
    public hyudai(){
        super("Premium Vehicle");
        System.out.println("Honda Constructor");
    }
    public hyudai(int year){
        System.out.println("Honda constructor with int parameter");
    }
}
