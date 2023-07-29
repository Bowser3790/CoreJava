package HashMap;

import java.util.HashMap;

public class HMPractice3 {
    public static void main(String[] args) {
        String t = "Thomas Does not hang out with the boys in the other yard, thomas does not play baseball with them either";
        System.out.println(getEveryOccurance(t));

    }

    public static HashMap<String,Integer> getEveryOccurance(String s){
       // s=s.replaceAll("[^a-zA-Z]", "");
        s=s.replaceAll("^\\p{Punct}","");

        HashMap<String, Integer> occurance = new HashMap<>();
        String [] words = s.split(" ");

        for(String w : words){
            Integer numOfOccurnce = occurance.get(w);
            if (numOfOccurnce==null){
                occurance.put(w,1);
            }else{
                occurance.replace(w, numOfOccurnce+1);
            }
        }
        return occurance;



    }
}
