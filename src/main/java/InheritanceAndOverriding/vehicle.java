package InheritanceAndOverriding;

public class vehicle {
    public void movesFast(){
        System.out.println("Fastest Vehicle");
    }
    public void price(){
        System.out.println("To buy a vehicle it cost $100.00");
    }
    public vehicle(){
        super();
        System.out.println("Vehicle Constructor Parent");
    }
    public vehicle (String name){
        this();
        System.out.println("vehicle constructor with String Parameter");

    }
}
