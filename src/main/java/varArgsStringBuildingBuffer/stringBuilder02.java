package varArgsStringBuildingBuffer;

public class stringBuilder02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(); // The capacity of this is 16
        sb1.append("!");
        sb1.append("xxxxxxxxxxxxx"); // what happens when you exceed the limit/ capacity? Java will give you 16 more boxes.
        // and 2 additional so 18 in total.

        int length = sb1.length();
        System.out.println(length);

        int capacity = sb1.capacity();
        System.out.println(capacity);//when you exceed the first 16 capacity:
                                    // formula to calculate capacity is (16*2 +2) if 2 then it would be 34
                                    // next would be: 34*2 +2  = 70 capacity

        StringBuilder capacity01 = new StringBuilder(2);// sets capacity length.
        capacity01.append("FL");
        int l = capacity01.length();
        System.out.println(l); //
        // this is saying hey Java I only need to use 2 boxes for my container to save memory.
        // I just need to abbreviate states FL. Dont give me more than 2.

        capacity01.append("!"); // what happens you exceed a shorted capacity.
                                // this example would be 2*2 +2 = 6 capacity

        // StringBuilder is not "Thread-Safe" meaning is not "synchronized"
        // running multiple tasks at the same time means you are "thread-safe" without causing race conditions.
        // Synchronization is the order of operations in multi-thread.
        // => means being able to select appropriate order for mulit-thread.

        // so in conclusion if you need to use multi-thread then do not use string builder.
        // what do you use?
        // if you need to use multi-thread then you can use StringBuffer
        // StringBuffer => this is "thread-safe" and is "Synchronized"
        // Class in Java and was created before StringBuilder in Java5
        // Java 17 is in use right now. Java 19 is coming out soon.

        /*
        To create strings we have 3 options:
        1. String Class: If you need immutable class then use string class to create a string.
        2. StringBuilder Class: If you need mutable string and do not need multi-threading and synchronizing
        then use StringBuilder class to create string
        3. StringBuffer Class: If you need mutable string and need multi-threading and synchronization use
        StringBuffer class to create string.
        Note: that StringBuilder class is faster than StringBuffer class.
         */
    }
}
