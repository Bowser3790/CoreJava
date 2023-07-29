package varArgsStringBuildingBuffer;

public class stringBuilder {
    // "StringBuilder" is a class in Java, used to create strings
    // We have string class to create strings? why?
    // String class is "immutable" and sometimes we need mutable strings and this is why they created "StringBuilder"
    // immutable means not updated in heap memory.  So the string that is saved in heap memory stays the same
    // and another block of memory is added with the update such as adding a "!" to the end of a string.
    // java will leave the original string the same and update another block in Heap memory Java => Java!
    // the benefit of immutability is protecting the original value
    // constantly creating new containers in the memory, if you are updating string all the time then you will
    // have many containers that take up a lot of space.
    // mutable => benefit is that you save memory
    // original value is updated.
    // depending on what you need: if you need original value later, use immutable values
    // if you do not need original value later, use mutable values.

    public static void main(String[] args) {

        String s = "java";

        String t = s.concat("!");
        System.out.println(s);// java
        //original value is not updated in string class
        System.out.println(t);// java!

        StringBuilder sb = new StringBuilder("Java");

        sb.append("!").append("...");// you can add multiple values with append() called method chaining
        System.out.println(sb);// the original value is updated.

        sb.insert(4,"is lovely");//skips first 4 characters and then insert string.
        sb.insert(2,"Money",1,4);// one is getting added to the string at offset 2
        System.out.println(sb);

        sb.replace(2,3,"1");
        System.out.println(sb);

        sb.delete(2,5);
        System.out.println(sb);

        sb.reverse();//
        System.out.println(sb);// interview question make sure you mention StringBuilder class, after you
                                // answer with a for loop.

        // toString() for converting StringBuilder to string but toString does not change the original structure of
        // StringBuilder string.
        String newS = sb.toString();

        StringBuilder str1 = new StringBuilder("Java");
        StringBuilder str2 = new StringBuilder("Lava");

        int comp1 = str1.compareTo(str2);
        System.out.println(comp1);// -2
        // compareTo() method compares strings in Lexicographically way.  Meaning it will compare with numbers (int)
        // java and lava: j comes before l therefore the comparison will be '-'
        // if lava was 1st and java was 2nd then the number would be a positive 2
        // - means that J comes before L
        // positive means that J comes after L
        // under the hood: the value method returns the difference between the ASCII value

        String str10 = "Water";
        str10 = str10.concat("fall");
        System.out.println(str10);// this is how you can change the original value of a string in string class
        // what happens to the first container that was created?
        // in the Heap memory if there is no pointer from the stack memory then the heap memory deletes the container
        // garbage collector: this will collect the memory that has no pointer. this way the memory does not have wasted
        // space.



    }
}
