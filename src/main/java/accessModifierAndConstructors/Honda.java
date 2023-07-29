package accessModifierAndConstructors;

public class Honda {
    public static int numOfCars = 0;// when static it will continue to hold the
    // value of the variable numOfCars will continue to increase
    // below where it is not static will only increase the price of the car once
    // and will end up at 20200 for all the cars
    // if price was static it would continue to increase for every new car object.

    public int price = 20000;

    public Honda(){
        numOfCars++;
        price = price + 200;
    }




}
