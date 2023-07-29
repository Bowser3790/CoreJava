package LambdaListString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaString1 {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Angela");
        names1.add("Jerry");
        names1.add("Walter");
        names1.add("William");
        names1.add("Winston");
        names1.add("Tom");
        names1.add("Jerry");
        names1.add("ChristopherJames");

        printSortedUppercaseUnique(names1);
        System.out.println();
        printUpperUniqueSortWithLength(names1);
        System.out.println();
        printUpperSortByLastChar(names1);
        System.out.println();
        printUpperSortByLastChar2(names1);
        System.out.println();
        printSquaresOfLengthReverseOrder(names1);
        System.out.println();
        System.out.println(checkIfLengthLessThanTwelve(names1));

    }

    // 1) print list elements on the console in natural order, with uppercase and un-repeated.

    public static void printSortedUppercaseUnique(List<String> names){
        names.
                stream().
                distinct().
                sorted().
                map(t->t.toUpperCase()).
                forEach(t-> System.out.print(t + " "));
    // map is for updating existing elements
    // sorted is for sorting in natural order
    // distinct() is for unique elements
        // t->toUppercase = get element and convert to uppercase.
        // use forEach to print each element.
    }

    // Print the List elements on the console by ordering them according to their lengths, with upper-cases, and
    // un-repeatedly
    public static void printUpperUniqueSortWithLength(List<String> names){
        names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length)).
                forEach(utils::printInTheSameLineWithSpace);
    // using Comparator.comparing and then typing any rule, you can sort the elements according to your rule.
    }
    //Print the List elements on the console by ordering them in reverse order z-> a, with upper-cases, and
    // un-repeatedly

    public static void printUpperSortByLastChar(List<String> names){
        names.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t +" "));
    }
    // create a method prints the List elements on the console by ordering them according to their last characters,
    // with upper-case, and un-repeatedly.
    public static void printUpperSortByLastChar2(List<String> names){
        names.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t->System.out.print(t + " "));
    }
    // create a method to sort according to their lengths and then according to their first characters
    // TOM, JIM, ALEX, MARY, MICHAEL etc...
    public static void printSortedByLengthName(List<String> names){
        names.
                stream().
                sorted(Comparator.comparing(String::length).// if a string needs a method parameter then it cannot be used in a method reference.
                        thenComparing(t->t.charAt(0))).
                forEach(utils::printInTheSameLineWithSpace);
        // We created a "Method Reference" in utils class. Why did we do this? There are 3 reasons we can use a "Method Reference"
        // Utils::printInThe... is a method reference.
        // 1) Put the class name first :: then use the method name without ().
        // 2) sometimes using Method Ref is not possible charAt() need parrameter to work
        // - method reference does not use parameter and this is why methods like charAt() is not able to be a method reference.
        // 3) Use it for very specific method for your project. such as what we did here ...
        // we have been using the same System.out.print(t + " "); so rather than do that for every method we create
        // make a Method Reference and print using classNameFirst :: MethodName;
        // this is called functional programming because we are using only methods to complete the task

    }
    // create a method that takes the square of the length of every element, prints them distinctly in reverse order
    //
    public static void printSquaresOfLengthReverseOrder(List<String> names){
        names.
                stream().
                map(String::length).
                distinct().
                map(utils::getSquare).
                sorted(Comparator.reverseOrder()).
                forEach(utils::printInTheSameLineWithSpace);


    }
    // create a method to check if the lengths of "all elements" are less than 12
    // (all elements you should use the method allMatch()
    // all match means will all match the given rule or not here we need the rule to to ell elements less than 12 length
    public static boolean checkIfLengthLessThanTwelve(List<String> names){
        return names.stream().allMatch(t-> t.length()<12);

    }

    // create a method to check if the initial of any element is not 'X'
    public static boolean checkInitialsNotToBeX(List<String> names){
        return names.stream().noneMatch(t->t.startsWith("X")); // will print true if none of the Initials are "X"
        // this is an important method because you could be testing lists that you are looking for price or manufacturer names.
    }

    // Create a method to check at least one elements is ending in "r"
    public static boolean checkAtLeastOneElementEndsInr(List<String> names){
        return names.stream().anyMatch(t-> t.endsWith("r")); // if any name matches last character is "r" return True.

    }



}
