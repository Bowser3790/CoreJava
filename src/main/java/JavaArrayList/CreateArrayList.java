package JavaArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateArrayList {
    // array list can only store non-primitive data;
    // this is a primitive data type and Java will give an error, ArrayList<int>

    public static void main(String[] args) {
        // way #1)
        ArrayList<Integer> ages = new ArrayList<>();

        // way #2)
        List<Integer> prices= new ArrayList<>();

        // how to add elements into an ArrayList
        ages.add(13);
        ages.add(9);
        System.out.println(ages);

        ages.add(1,44);
        System.out.println(ages);

        prices.add(330);
        prices.add(450);
        prices.add(500);
        System.out.println(prices);
        // addAll will add all values from 1 list to another

        ages.addAll(prices);
        System.out.println(ages);

        //
        ages.addAll(2,prices);
        System.out.println(ages);

        // how to remove all elements from a list
        prices.clear();
        System.out.println(prices);

        // how to check if a specific element exist in a list
        boolean r1 = ages.contains(11);
        System.out.println(r1);// true

        // ages.containsAll(prices); if all prices
        boolean r2 = ages.containsAll(prices);
        System.out.println(r2);

        List<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Angela");
        names1.add("Jerry");

        List<String> names2 = new ArrayList<>();
        names2.add("Walter");
        names2.add("William");
        names2.add("Winston");

        // equals() method checks if the lists have same element in the same indexes.
        boolean r3 = names1.equals(names2);
        System.out.println(r3);//false

        // type code to see if two lists have the same elements not in different index

        List<Character> m = new ArrayList<>();
        m.add('A');
        m.add('B');
        m.add('C');

        List<Character> z = new ArrayList<>();
        z.add('A');
        z.add('C');
        z.add('B');

        Collections.sort(m);
        Collections.sort(z);

        boolean r4 = m.equals(z);
        System.out.println(r4);




    }
}
