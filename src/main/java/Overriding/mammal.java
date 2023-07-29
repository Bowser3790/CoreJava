package Overriding;

public class mammal extends animal {

    public void feed(){
        System.out.println("Mammals Feed their babies with milk");
    }
    public mammal occur(){
        return new mammal();
    }
}
