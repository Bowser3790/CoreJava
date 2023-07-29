package JavaArray;

import java.util.Arrays;

public class greaterThanOrLessThan {
    // create a string array with 5 elements, ddelete the elements whose length is less than 5
    // [Orange, Blue, Yellow, Brown, Red]
    public static void main(String[] args) {
        String colors[] = new String[5];

        colors[0] = "Red";
        colors[1] = "Blue";
        colors[2] = "Brown";
        colors[3] = "Yellow";
        colors[4] = "Orange";

        // How many elements have greater than or equal to 5 characters.

        int counter = 0; // if you want to count elements create a counter integer

        for (String w: colors) {
            if (w.length() >= 5) {
                counter++;
            }
        }
        // create new array to store the elements whose lengths are greater than or equal to 5.
        String newArray[] = new String[counter];

        // Transfer the elements whose lengths are greater than or equal
        int idx = 0;

        for (String t : colors){
            if (t.length()>= 5){
                newArray[idx] = t;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
