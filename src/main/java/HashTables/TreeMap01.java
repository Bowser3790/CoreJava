package HashTables;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

    /*
    1) TreeMap puts entries into natural order.
    2) This is the slowest out of all the Maps.
    3) TreeMaps are not "Thread-Safe" and not Synchronized
    4) TreeMaps accept null values but does not accept null in Keys- if you make the key null then you will not be able
    to put into natural order.

     */
    public static void main(String[] args) {

        // these examples will show using nanoTime() how much quicker hashMap is than treeMap.

        Long t1 = System.nanoTime();

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("USA", 2000000);
        tm.put("Germany", 4000000);
        tm.put("Australia", 60000000);
        tm.put("Russia", 800000000);
        System.out.println(tm);

        Long t2 = System.nanoTime();


        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("USA", 2000000);
        hm1.put("Germany", 4000000);
        hm1.put("Australia", 60000000);
        hm1.put("Russia", 800000000);
        System.out.println(hm1);

        TreeMap<String, Integer> myTreeMap = new TreeMap<>(hm1);
        System.out.println(myTreeMap);

        Long t3 = System.nanoTime();

        System.out.println(t2-t1); // just tree map
        System.out.println(t3-t2); // treeMap with HashMap is much faster.

        // common INTERVIEW question => should you use HashMap with TreeMap and why?
        // The system processes faster when you use HashMap with TreeMap.
        // what do you use if you need entries in Natural Order?
        // you will use TreeMap.
        // then... as you know treeMaps are very slow. What can you do to make code faster?
        // 1) to put entries into a map I use HashMap, very fast.
        // 2) then I convert to treeMap which will put entries into natural order (almost 10x faster).


    }

}
