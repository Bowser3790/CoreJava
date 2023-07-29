package JavaArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveIntegerWrapperClass {
    public static void main(String[] args) {
        List<Integer> number1 = new ArrayList<>();
        number1.add(33);
        number1.add(98);
        number1.add(22);
        number1.add(65);
        number1.add(10);
        number1.add(51);
        number1.add(11);
        number1.add(25);

        // if you put an integer into remove() method parenthesis, Java accepts the integer as "primitive int", if
        // number you put inside remove() method parenthesis is "primitive int", it will be index.
        // to fic the problem, primitive int to wrapper class by using "(Integer)11" see below for example

        number1.remove(11);  // this will look for index 13 and there is no index 11 =>
        // if it is primitive int then you will use index, if it is non-primitive then you have to make wrapper class. below
        boolean isRemoved = number1.remove((Integer) 11); // using the wrapper class to intervene
        System.out.println(isRemoved);// true
        System.out.println(number1);// [will print all numbers in array]

    }
}
