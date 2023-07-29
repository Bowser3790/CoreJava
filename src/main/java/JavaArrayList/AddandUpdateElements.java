package JavaArrayList;

import java.util.ArrayList;
import java.util.List;

public class AddandUpdateElements {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        // Create an integer list, add 5 elements into it, change the elements less than 10 to 77.

        myList.add(22);
        myList.add(13);
        myList.add(8);
        myList.add(25);
        myList.add(1);

        System.out.println(myList);

        // way #1)

        for (int i =0; i< myList.size(); i++){
            if (myList.get(i)<10){
                myList.set(i,77); // set() method is used to update a specific list element by
                // using the index and the new value.

            }
        }
        System.out.println(myList); // [22, 13, 77, 25, 77]

        // Way #2)

        for (int w : myList){
            if (w<10){
                myList.set(myList.indexOf(w), 77);
            }
        }
        System.out.println(myList); // [22, 13, 77, 25, 77] same output
    }


}
