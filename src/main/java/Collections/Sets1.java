package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets1 {
    public static void main(String[] args) {
        /*
        Sets are for storing unique data (no repetition).
        There are 3 sets
        i. HashSet
        - This is a technique that creates unique data(code)
        - HashSet does not put elements in any order => this makes code extremely fast.
        - HashSet allows you to store just one NULL as a value.
        ii. LinkedHashSet
        - this technique orders data(code)
        - LinkedHash Set is slower than hash set.

        iii. TreeSet
        - this technique orders in Natural Order (ascending order - Integer), (Alphabetical Order - String)
        - TreeSet is the slowest set out of all the techniques.

        Interview question;
        what do you use to store unique elements in natural order?
        - TreeSets
        *follow-up question.
        As you know treeSets are slow how do you prevent the code from working slow?
        -Create hashSet, add elements into hashSet. Convert the TreeSet to HashSet because hash set is the fastest.
        - see Example below question store email addresses in alphabetical order. Convert the alphabetized email addresses to
        hashSet to make the code execute faster.

         */
        HashSet<Integer> myHash = new HashSet<>();// hashSet is faster than linkedHashSet because linked orders the data

        myHash.add(12);
        myHash.add(100);
        myHash.add(23);
        myHash.add(33);
        myHash.add(27);
        myHash.add(33);
        myHash.add(77);
        myHash.add(42);
        myHash.add(1);
        myHash.add(null);// HashSet will allow you to put null into value.
        // if you have the same value twice in a set it will overwrite the 1st occurrence and use the 2nd occurrence.
        // will not give error.
        System.out.println(myHash);

        LinkedHashSet<Integer> myLinkedHash = new LinkedHashSet<>();
        myLinkedHash.add(12);
        myLinkedHash.add(10);
        myLinkedHash.add(23);
        myLinkedHash.add(33);
        myLinkedHash.add(27);
        myLinkedHash.add(1);
        myLinkedHash.add(26);
        myLinkedHash.add(null);
        System.out.println(myLinkedHash);

        boolean r5 = myLinkedHash.retainAll(myHash);
        System.out.println("my R5 " + r5);
        System.out.println( "my Hash " + myHash);
        System.out.println("My Linked Hash " + myLinkedHash);// prints all the numbers that are the same from myHash and
        // myLinkedHash

        /* real world question:
        you have all products sets, and you have discounted products set.
        all products set ==> TV, radio, Fridge, watch, laptop
        discounted products set ==> laptop, radio, chair

        all products set.retainAll(discountedProductsSet) ==> radio, laptop

        retainAll() can be used with LinkedSet, HashSet(), and TreeSet().
         */

        TreeSet<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(7);
        myTreeSet.add(-5);
        myTreeSet.add(10);
        myTreeSet.add(100);
        myTreeSet.add(55);
        System.out.println(myTreeSet);

        // example: store the following email addresses in alphabetical order.
        // abc@gmail.com, cdf@gmail.com, bdc@gmail.com, will@gmail.com, sarah@gmail.com
        // step 1)
        long F1Speed = System.nanoTime();
        TreeSet<String> myTreeSet1 = new TreeSet<>();
        myTreeSet1.add("abc@gmail.com");
        myTreeSet1.add("cdf@gmail.com");
        myTreeSet1.add("bdc@gmail.com");
        myTreeSet1.add("will@gmail.com");
        myTreeSet1.add("sarah@gmail.com");
        System.out.println("True Tree Set" + myTreeSet1);


        // Step 2)
        long F2Speed = System.nanoTime();
        HashSet<String> myHashSet1 = new HashSet<>();
        myHashSet1.add("abc@gmail.com");
        myHashSet1.add("cdf@gmail.com");
        myHashSet1.add("bdc@gmail.com");
        myHashSet1.add("will@gmail.com");
        myHashSet1.add("sarah@gmail.com");


        TreeSet<String> convertTreeToHash = new TreeSet<>(myHashSet1);
        System.out.println("Converted Tree"+ convertTreeToHash);


        long F3Speed = System.nanoTime();
        System.out.println("Tree speed: " + (F2Speed-F1Speed));// difference between the speed of code from F1 to F2
        System.out.println("Hash Speed " + (F3Speed-F2Speed));



    }
}
