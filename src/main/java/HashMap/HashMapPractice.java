package HashMap;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {
        String t = "Henry, Troy, Henry, Chris, Chris, Chris, William, Frank, William.";
        System.out.println(getNumOfOccurance(t));

    }

    public static HashMap<String, Integer> getNumOfOccurance(String s) {
        s = s.replaceAll("\\p{Punct}", "");

        HashMap<String, Integer> Occurances = new HashMap<>();

        String[] words = s.split(" ");

        for (String w : words) {
            Integer numOfOccurances = Occurances.get(w);
            if (numOfOccurances == null) {
                Occurances.put(w, 1);
            } else {
                Occurances.replace(w, numOfOccurances + 1);
            }
        }
        return Occurances;
    }
}
