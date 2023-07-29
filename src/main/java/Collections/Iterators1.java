package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators1 {
    /*
    1) iterate do the same thing as loop
    2) Loops have infinite loop risk but iterators do not have infinite loop risk
    3) There are no performance differences between iterators and loops.
    4) Iterators are more effective at removing elements and updating elements in a collection.

    5) There are two types of iterators:
    i. Iterator: it can just remove elements, it is possible to update and add. It only works from left to right.
    ii. ListIterator: It can remove and update and add the elements. It works from left to right and right to left.





     */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Fran");
        myList.add("Chris");
        myList.add("Maria");

        Iterator<String> myIterator = myList.iterator();

        while (myIterator.hasNext()){ // hasNext() ==> Returns true if the iteration has
            // more elements. (In other words, returns true if next would
            // return an element rather than throwing an exception.)
            //Returns:
            //true if the iteration has more elements
            // the pointer goes to the next element and says is there another element and gives => boolean T or F
            myIterator.next();// returns the next element in an iteration.
            myIterator.remove();

        }
        System.out.println(myList);
    }

}
