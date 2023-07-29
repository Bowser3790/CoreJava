package JavaArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateAndRemoveElements {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<>();
        names1.add("Christian");
        names1.add("Franklin");
        names1.add("Tom");
        names1.add("Adriana");
        names1.add("Tommy");
        System.out.println(names1);
        // student graduated and you need to remove the student from the list.

        names1.remove("Franklin");
        System.out.println(names1);

        // names.remove("Alex"); removes "Alex" from the "names" list
        // remove() method returns true if the element exists and removed, otherwise it will return false.

        boolean isRemoved = names1.remove("Adriana");
        System.out.println(isRemoved);// True


        // names.remove(2); removes the element "at index2" from the "names" list
        // remove() method with index, you need to use string for this to execute the code.
        // Returns the names in array. A.K.A returns as a "primitive int".
        String isRemoved02 = names1.remove(1);
        System.out.println(names1);// [Christian, Tommy]


    }


}
