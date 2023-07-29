package HashTables;

import java.util.Hashtable;

public class HashTable01 {

    /*
    1) HashTable is "Thread-Safe" and Synchronized.
    2) HashTable put entries in random order
    3) HashMap is faster than HashTable, HashTable has additional functionalities that are thread-safe and synchronized
    - additional functionality means slower.
    4) HashTable do not accept "null" in key and value entries.


    INTERVIEW QUESTION: What is the difference between HashMap and HashTable?
    - HashMap are not "Thread-Safe" and Not Synchronized.
    - HashTable are "Thread-Safe" and Synchronized.
     */

    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("USA", 2000000);
        ht.put("Germany", 4000000);
        ht.put("Australia", 60000000);
        ht.put("Russia", 800000000);
        //ht.put(null, 300) //=> Java will complain about null values.
        //ht.put("Africa", null); this will not work either.
        System.out.println(ht);
    }


}
