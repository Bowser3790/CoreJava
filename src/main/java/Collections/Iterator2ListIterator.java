package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator2ListIterator {
    public static void main(String[] args) {
        List<String> myList2 = new ArrayList<>();
        myList2.add("Tom");
        myList2.add("Fran");
        myList2.add("Chris");
        myList2.add("Maria");
        System.out.println(myList2);

        ListIterator<String>  myListIterator = myList2.listIterator();

        // the following loop will move the pointer to the end of the array
        while (myListIterator.hasNext()) {
            myListIterator.next();
        }
        // the following loop will work from the last element to the first element
        while(myListIterator.hasPrevious()) {
            String el = myListIterator.previous();

            System.out.print(el + "...!");

        }
    }
}
