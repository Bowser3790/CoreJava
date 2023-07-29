package JavaArray;

import java.util.Arrays;

public class PrintAddressVprintArray {
    public static void main(String[] args) {
        int num = 12;
        String str = "Tom";

        // Create array
        String sixGraders[] = new String[5];

        // how to print an array on the console
        System.out.println(sixGraders); // this will give you the address in the stack memory, not going to use this alot.

        System.out.println(Arrays.toString(sixGraders)); // this will print the elements in the array. You will use this mostly.

        // how do you add elements into an array
        sixGraders[1] = "Alan";
        sixGraders[0] = "Juan";
        sixGraders[2] = "Kimberly";
        sixGraders[3] = "Jason";
        sixGraders[4] = "Matthew";

        System.out.println(Arrays.toString(sixGraders));

        System.out.println(sixGraders[0] + "-" + sixGraders[4]);

        // how to find the number of elements in an array
        int numOfElements = sixGraders.length;// use length (not the method()) because we are not looking for the
                                             // string value we are looking for the array elements. [4] is already set.
                                            // if we were looking for the length() of Jason we would use this action.
        System.out.println(numOfElements);

        // notes 1) Primitive variables and strings can store just a single data in them,
        // sometimes we need to store multiple data in the same type in a single container
        // a new structure whose name is " array"
        // 2) Arrays cannot store "non-primitives", if you see non-primitives we stored they are references of non primitives
        // Arrays can store i) primitive data ii) references of the non-primitives

        // Interview question below:

        // how can you tell arrays can store non-primitives?
        // arrays can not store non-primitives
        // how can you tell arrays can not store non primitives?
        // as you can see I am able to put strings in an array...
        // say: it is not a string it is a reference stored in stack memory and the heap memory can store non-primitive data.
    }
}
