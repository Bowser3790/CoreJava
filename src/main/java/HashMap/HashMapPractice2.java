package HashMap;

import java.util.HashMap;

public class HashMapPractice2 {
    public static void main(String[] args) {
        String t = "I am the wind, I am the fire, I am the rain ";
        System.out.println(getAllOccurances(t));
    }

    public static HashMap<String, Integer> getAllOccurances(String s){
        //s = s.replaceAll("[^a-zA-Z]", "");// these both basicall do the same exact operation.
        s = s.replaceAll("\\p{Punct}", "");


        HashMap<String, Integer> occurances = new HashMap<>();
        String [] words = s.split(" ");// if you want each character you have to change the regEx from "" to " "

        for (String w : words ){
            Integer getAllOccurances = occurances.get(w);
            if (getAllOccurances==null){
                occurances.put(w, 1);
            }else{
                occurances.replace(w, getAllOccurances+1);
            }


        }
        return occurances;

    }
}
