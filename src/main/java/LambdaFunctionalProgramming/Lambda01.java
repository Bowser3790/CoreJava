package LambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

/*
So far we have learned structured programming:
i. In structured programming "Structure" is very important.
ii. Lambda is functional programming, focus is on the functions (meaning methods).
- functional programming takes much less time than structural programming
- less mistakes with using functional programming, tested by Java many times.
- Functional programming is a lot more readable

iii. "t -> code" is called "Lambda Expression".
In functional programming we may use "Lambda Expressions", it is not recommended.
We will prefer to use "Method Reference", Learned in next session.
 */

public class Lambda01 {
    public static void main(String[] args) {
        // create a method to print all List Elements on the console in the same line with a space among them
        List<Integer> nums = new ArrayList<>();

        nums.add(22);
        nums.add(33);
        nums.add(35);
        nums.add(50);
        nums.add(66);
        nums.add(77);
        nums.add(90);

        printElements(nums);
        System.out.println();
        printElements2(nums);



    }
    // Way #1) Structured programming:

    public static void printElements(List<Integer> myList){
        for(Integer w : myList){
            System.out.print(w + " ");
        }
    }
    // Way #2) Functional Programming:
    public static void printElements2(List<Integer> myList){
        myList.stream().forEach(t->System.out.print(t +" "));
        // Stream() converts List<> converts to Stream() (stream Structure has many useful methods)
        // you will not be able to use many methods that are in this library.
        // Stream() structure puts elements from top to bottom => 22,33,35,50,66,77,90 (note this is how I listed them
        // in the List<>.)

    }

}

