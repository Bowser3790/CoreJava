package JavaArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

    public static void main(String[] args) {
        String a[] = new String [6];

        a[0]="Tom";
        a[1]="Frank";
        a[2]="Ajda";
        a[3]="Cortney";
        a[4]="Angelina";
        a[5]="Brad";

        System.out.println(Arrays.toString(a));

        List<String> myList = Arrays.asList(a);
        System.out.println(myList);
        /*
        so when you create a list from an array this is created as a list or like the list but it is actually
        not a list (under the hood).

- no operation will work if you try to change the size of the array.

- you cannot add() or remove()

- arrays are fixed in size and if you try to change this it will not allow you to.

- list will be fixed as well

you can still use:

get()

indexOf

size

replaceAll

etc.
         */



    }
}
