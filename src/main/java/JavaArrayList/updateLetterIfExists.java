package JavaArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class updateLetterIfExists {
    public static void main(String[] args) {
        // Ask user to enter a letter
        // if the letter exists in the list convert to "Got it"
        // otherwise add the element user entered into the list.


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter: ");

        char letter = input.next().charAt(0);

        List<Character> myList = new ArrayList<>();

        myList.add('M');
        myList.add('S');
        myList.add('T');
        myList.add('W');
        myList.add('M');

        if (myList.contains(letter)){
            myList.set(myList.indexOf(letter), 'X'); // set( ) method only updates the first occurrence.
                                                    // type in 'M'
        }else {
            myList.add(letter);
        }
        System.out.println(myList);




    }
}
