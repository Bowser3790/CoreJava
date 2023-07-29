package JavaArrayList;

import java.util.ArrayList;
import java.util.List;

public class removeElementsLessThan6 {
    public static void main(String[] args) {

        // Remove elements from list less than 6 characters.
        List<String> n = new ArrayList<>();
        n.add("Christian");
        n.add("Marshall");
        n.add("Holt");
        n.add("Valentine");
        n.add("Bovio");
        n.add("Bevan");

        System.out.println(n);

//        for(String w : n){
//            if (w.length()<6){
//                n.remove(w); //ConcurrentModificationException
                // loop gives error because the List has been changed, we just removed elements from the list
                // now how do we change this error from triggering?
                // ** need to change for each loop to for loop. **
// way #1)
        for (int i = 0; i<n.size(); i++){
            if(n.get(i).length()<6){ // if index 0 [christian] is < 6 (false) breaks loop and prints chistian
                n.remove(n.get(i)); // if index 2 [holt] is < 6 is (True) execute code n.remove(n.get(i));
                i--;// if the remove code triggers then we need to decrease the index as a name was removed.

                // **** what does get() method do? it gives you the elements at the given index. *****
                // where get(i) is we could also say get(1) and we will get the index 1 string and run non-dynamically.

            }
        }
        System.out.println(n);
// way #2) using for each loop
        List<String> clonedN = new ArrayList<>(n); // this will pull the list into a new list (exact same list)
        for (String w : clonedN){
            if(w.length()<6){
                n.remove(w);

            }

        }
        System.out.println(n);





    }
}
