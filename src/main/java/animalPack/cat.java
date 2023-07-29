package animalPack;

import StringManipulations01.StringManipulationIndex;

public class cat extends mammal{
    public int age = 14;
    public String name = "A";
    public boolean old = false;
    public double X = 2.3;

    // this() method is for selecting the variable from the class you are in.

    public cat(){
        // super()=> means go to the parent class for the variable.
        System.out.println(this.age); // 14
        System.out.println(super.age);// 6
    }


}
