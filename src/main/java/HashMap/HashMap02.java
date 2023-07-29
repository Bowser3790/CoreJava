package HashMap;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        // type code to find the number of occurances of words in a sentence
        String t = "Java is easy, Java is OOP, Java makes OOP easy.";
        System.out.println(getNumOfOccurance(t));
        // Java => 3, is => 2, easy => 2, OOP => 2, makes => 1
        // break down to: no punctuation
        // Java is easy Java is OOP Java makes OOP easy. => s.replaceALL breaks this down.


    }

    static HashMap<String, Integer> getNumOfOccurance(String s) {
        s = s.replaceAll("\\p{Punct}", "");

        // put the results into a map, create a hashMap<>
        HashMap<String, Integer> occurances = new HashMap<>();
        // split string by spaces to get words and putting them into the word [] array.
        String[] words = s.split(" ");

        for (String w : words) {
            Integer numOfOccurances = occurances.get(w);
            if (numOfOccurances == null) {
                occurances.put(w, 1);
            } else {
                occurances.replace(w, numOfOccurances + 1);
            }
        }
        return occurances;

    }
}

