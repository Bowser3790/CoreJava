package LambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {
    // create a method to print the even list elements on the console

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(22);
        nums.add(33);
        nums.add(35);
        nums.add(50);
        nums.add(66);
        nums.add(77);
        nums.add(90);

        evenNums(nums);
        System.out.println();
        evenNums2(nums);
        System.out.println();
        oddNums(nums);
        System.out.println();
        printOddCube(nums);
        System.out.println();
        System.out.print(findSumOfSquareEvenElements(nums));
        System.out.println();
        System.out.print(productSquareDistinctEven(nums));
        System.out.println();
        System.out.print(maxValueListElements(nums));
        System.out.println();
        System.out.print(minValueListElement(nums));
        System.out.println();
        System.out.print(minValueListElement2(nums));


    }

    public static void evenNums(List<Integer> myList){
        for (Integer w: myList){
            if (w%2==0){
                System.out.print(w + " ");

            }
        }

    }
    public static void evenNums2(List<Integer> myList){
        myList.
                stream().
                filter(t->t%2==0).
                forEach(t->System.out.print(t + " "));
    }// filter() is for selecting some elements according to some rules. Here we need to select even integers.

    // create a method to print the square of odd list elements on the console
    // in the same line with a space between each two consecutive elements.
    public static void oddNums(List<Integer> myOddList){
        myOddList.
                stream().
                filter(t-> t%2!=0).
                map(t-> t*t). // map() is used to update list elements.
                forEach(t->System.out.print(t + " "));
    }
    // create a method to print the "cube" of "distinct" odd list elements
    // on the console in the same line with a space between two consecutive elements

    public static void printOddCube(List<Integer> myList){
        myList.
                stream().
                distinct().// using distinct() before filter() will give less numbers and make the program faster.
                filter(t->t%2!=0).// finds unique numbers
                map(t->t*t*t).
                forEach(t->System.out.print(t + " "));
    }
    // create a method to calculate the "Sum" of the "Squares" of "distinct" "even" elements.
    public static int findSumOfSquareEvenElements(List<Integer> myList){
        return myList.

                stream().
                distinct().
                filter(t-> t%2==0).
                map(t->t*t).
                reduce(0, (t,u)->t+u); // reduce() means decrement, finding sum of numbers.

    }
    // Create a method to calculate the "product" of the "square" if "distinct" "even" elements
    public static int productSquareDistinctEven(List<Integer> myList){
        return myList.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t).
                reduce(1,(t,u)->t*u); // product means multiplication.
        // start with 1 in reduce because if you multiply starting with 0 your answer will be 0.
    }

    // create a method to find the maximum value from the list elements
    public static int maxValueListElements(List<Integer> myList){
        return myList.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t : u);
        // note Integer.MIN_VALUE = -2billion (set up so it will be the lowest number to have a start point for list comparison.)
        // Integer.Max_VALUE is exact opposite and will be used when finding min value...
    }
    // way #1) to find MinValue
    public static int minValueListElement(List<Integer> myList){
        return myList.stream().distinct().reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t:u);

    }
    // Way #2) to fine MinValue
    public static int minValueListElement2(List<Integer> myList){
        return myList.stream().distinct().reduce(myList.get(0), (t,u)->t<u?t:u); // get(0) can be used for max value as well
    }
    // way #3 to find min or max values ... note that get() method changes data type to integer.
    public static int maxVal3(List<Integer> myList){
        return myList.stream().distinct().sorted().reduce((t,u)->u).get();
    }
    // way #3 to find minValue
    public static int minVal3(List<Integer> myList){
        return myList.stream().distinct().sorted().findFirst().get();// find first is returning optional integer and you
        // will need to use get() to change to an integer.
    }
    // 4th way to find Max value
    public static int maxValue4(List<Integer> myList){
        return myList.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
        // reverseOrder will put in descending order and find first will find the largest value first.
    }
    // create a method to find the minimum value which is greater than 7 and even from the list

    public static int minValGreaterThanSeven(List<Integer> myList){
        return myList.stream().distinct().filter(t->t>7 && t%2==0).sorted().findFirst().get();
    }
    // create a method to find the any value less than 25 and even from the List.
    public static int evenValUnderTwentyFive(List<Integer> myList){
        return myList.stream().distinct().filter(t-> t<25 && t%2==0).findAny().get();
        // use docs.oracle for documents on Java
    }




}
