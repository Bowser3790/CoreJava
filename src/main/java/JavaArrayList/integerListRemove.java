package JavaArrayList;

import java.util.ArrayList;
import java.util.List;

public class integerListRemove {

    public static void main(String[] args) {
        // create an integer list and remove the duplications.

        List<Integer> myList = new ArrayList<>();

        // Create an integer list, add 5 elements into it, change the elements less than 10 to 77.

        myList.add(22);
        myList.add(1);
        myList.add(22);
        myList.add(25);
        myList.add(1);

        System.out.println(myList);

        // way #1)

        List<Integer> noDuplication = new ArrayList<>(); // create a list that will store non-duplicate
        // integers from myList

        for(Integer w : myList){
            if(!noDuplication.contains(w)){ // use !noDuplicate = if number does not exist in noDuplicate list, add it.
                noDuplication.add(w);
            }

        }
        System.out.println(noDuplication);

        // way #2)
        for (int i=0; i< myList.size(); i++){
            Integer el = myList.get(i);

            if(myList.indexOf(el) != myList.lastIndexOf(el)){
                myList.remove(el);// removes the first occurance of a number.
                i--;
            }
        }
    }

}
