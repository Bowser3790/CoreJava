package HashMap;

import java.util.HashMap;

public class HashMap03 {
    // create a method that prints the number of letter occurances in a sentence.
    // java jim jones j = 3, a = 2...

    public static void main(String[] args) {
        String t = "Tony, was married to a tiger";
        System.out.println(getNumberOfOccurances(t));

    }

    public static HashMap<String, Integer> getNumberOfOccurances(String s) {
        s = s.replaceAll("[^a-zA-Z]", "");


        HashMap<String, Integer> occurances = new HashMap<>();

        String [] characters = s.split("");

        for(String w: characters){
            Integer numOfOccurance = occurances.get(w);
            if (numOfOccurance==null){
                occurances.put(w, 1);
            }else {
                occurances.replace(w, numOfOccurance+1);
            }
        }
        return occurances;

    }


}
