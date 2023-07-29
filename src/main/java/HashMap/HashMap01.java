package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
        // "Entry" is the keyword if you want to be technical for Map
        // In a map, Key is unique and value can be repeated.
        // all entries are unique in a map because if the key cannot be repeated then all entries are different.
        /*
        all entries in a map are called "Entry Set" ... why?
        because all entries are unique and unique data is put into sets.

        Maps have key-value structure
        - keys are unique, values can be repeated.

        Map elements are called entry.

        All map entries are called entry sets

        Maps are in 3 types
        i. HashMap:
        - puts entries in random order, this makes the HashMap very fast
        - HashMap only accept one "null" in key part (needs to be unique)
        - accepts multiple "null" value in value part.
        ii. HashTable
        iii. TreeMap

        iv. if you use the same value repeatedly in a map, the final value will be accepted in the map.

        put() method with the same key and different value updates the value (overwrites). This is not recommended.
        java has replace() method for updates.
         */

        HashMap<String, Integer> countryPopulation = new HashMap<>();

        countryPopulation.put("United States", 20000000);
        countryPopulation.put("Germany", 70000000);
        countryPopulation.put("Germany", 3500000);
        countryPopulation.put(null, 250000);
        countryPopulation.put("China", null);
        countryPopulation.put("UK", null);

        System.out.println(countryPopulation);

        // how to get just the keys

        Set<String> mySetKeys = countryPopulation.keySet();// keySet() returns all keys in a set
        System.out.println(mySetKeys);

        // how to get all the values
        // **values are not saved into a set because there can be equal values, therefore we need to create a collection
        Collection<Integer> mySetValues = countryPopulation.values();

        // example 1: type code used to find the number of characters in the keys

        int sum = 0;
        for (String w : mySetKeys) {
            if (w != null) {
                sum = sum += w.length();
            }
        }
        System.out.println(sum);
        // example 2 type code to find total sum of population in all countries
        int sumPop = 0;
        for (Integer k : mySetValues){
            if(k!=null) {
                sumPop = sumPop += k;
            }
        }
        System.out.println(sumPop);

        // how to get the value of a specific key
        // type the code to find the population of the USA
        Integer populationOfUSA = countryPopulation.get("United States");
        System.out.println(populationOfUSA);

        Integer populationUpdateUSA = countryPopulation.replace("United States", 210000000);
        System.out.println(mySetValues);

        int numOfEntries = countryPopulation.size();
        System.out.println(numOfEntries);

        countryPopulation.putIfAbsent("Belguim", 500000000); // puts entry into map if the key is absent.
        System.out.println(countryPopulation);

        boolean r1 = countryPopulation.containsKey("United Stated"); // True
        boolean r2 = countryPopulation.containsKey("USA");// False
        boolean r3 = countryPopulation.containsValue("500000000");
        System.out.println(r3);

        Set<Map.Entry<String,Integer>> allEntries = countryPopulation.entrySet(); // returs all entries in a set whose elements are in a "Set<Map.Entry<k,v>>" data type
        System.out.println(allEntries);// Set will be in [], collections will be {}

        for (Map.Entry<String,Integer> w: allEntries){// not that this full code is the data type for an entry set => Map.Entry<String,Integer>>
            System.out.println(w.getKey() + " - " + w.getValue());
        }
    }
}
