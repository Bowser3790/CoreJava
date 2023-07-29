package Overriding;

public class finalKeyword {
    public static final int age = 12;
    public static void main(String[] args) {
        cat myCat = new cat();
        myCat.eat();

        //age++; // ==> this is complaining because when we use final keyword in the variable above for
              // age, we are saying that 12 is the final value and will not be changing.
    }
}
