package JavaArray;

public class forEachLoop {
    public static void main(String[] args) {
        int total = 0;

        String kidNames[] = new String[5];
        kidNames[1] = "Alan";
        kidNames[0] = "Juan";
        kidNames[2] = "Kimberly";
        kidNames[3] = "Jason";
        kidNames[4] = "Matthew";

        for (String w : kidNames){
            total = total + w.length();
    }
        System.out.println(total);
    // this is the most enhanced loop and preferred.
    // for each loop can be used with "Arrays and Collections", if there is no "Array" and or collection
        // you cannot use for-each loop, you have to use for-loop or while loop or do while loop
        // note 2) also, sometimes for-each loop cannot be used with" arrays and collections either.
        // "for-each loop" gets the first piece of data and brings it into the loop and if you have a loop starting
        // from the end and working backwards you cannot use a "for-each loop".
        // when using indexes is a must, using for-each loop is impossible. (use for loop or while loop)


    }
}
