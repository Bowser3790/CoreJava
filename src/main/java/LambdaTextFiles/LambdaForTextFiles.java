package LambdaTextFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Formattable;
import java.util.stream.Collectors;


public class LambdaForTextFiles {
    public static void main(String[] args) throws IOException {
        // how to access a text file and print the text on console.

        Files.lines(Paths.get("src/main/java/LambdaTextFiles/myTextFile.txt")).
                forEach(System.out::println);

        // convert all text in the text file to uppercase then print text file to the console

        Files.lines(Paths.get("src/main/java/LambdaTextFiles/myTextFile.txt")).map(String::toUpperCase).
                forEach(System.out::println);

        // Check if the text file has word Java in it

        Boolean r1 = Files.lines(Paths.get("src/main/java/LambdaTextFiles/myTextFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);

        // print distinct words from a text file
//        Files.
//                lines(Paths.get("src/main/java/LambdaTextFiles/myTextFile.txt")). // when you create a stream within a stream like we did here with Lines() and Map()
//                map(t->t.split(" ")). // this creates inner streams when you split texts using map.
//                flatMap(Arrays::stream). // flatMap() breaks the inner streams (boundaries) and gives you only words see images in notes about flatMap()
//                distinct(). // any words repeated are not included on the console
//                forEach(System.out::println); // prints words looped
//
//        // Get words that end with "s" and print them on the console

//        Files.
//                lines(Paths.get("src/main/java/LambdaTextFiles/myTextFile.txt")).// stream created from lines () method and Inner stream coming from map method.
//                map(t->t.split(" ")).// Java-> when you get a line split it by using space. This code will give you the words but the words will be given to you in a stream.
//                flatMap(Arrays::stream). // used to break inner stream and put all words into outer stream.
//                filter(t-> t.endsWith("s")). // Java go through every word and see if the word ends in "s". If it does print on the console.
//                forEach(System.out::println);

        // Get words from a text file and print them in reverse order on the console.
        Files.
                lines(Paths.get("src/main/java/LambdaTextFiles/myTextFile.txt")).
                map(t-> t.split(" ")).
                flatMap(Arrays::stream).
                map(t-> t.replaceAll("[^a-zA-Z]", " ")).
                map(t->t.toLowerCase()).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(System.out::println);
        // find the total number of letters in the text file

        int r2 = Files.

                lines(Paths.get("src/main/java/LambdaTextFiles/myTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                map(t->t.replaceAll("[^a-zA-Z]", "")).
                map(t->t.length()).
                reduce(Math::addExact).
                get();
        System.out.println(r2);


    }



}
