package Collections;

import java.util.LinkedList;

public class LinkedList1 {
    /*
    Chat GPT answer difference between ArrayList and Linked list:

    The difference between `ArrayList` and `LinkedList` in Java is how they internally store and
    access elements.

`ArrayList` is implemented as a dynamic array. This means that elements are stored in a contiguous block of memory,
and accessing an element by index is very fast, because the JVM can calculate the memory location directly. However,
adding or removing elements from an `ArrayList` can be slow, because it may require shifting many elements to make
room or fill a gap.

`LinkedList`, on the other hand, is implemented as a doubly-linked list. This means that each element stores a
reference to both the next and previous element in the list. Adding or removing elements from a `LinkedList` is fast,
because it only requires changing a few references. However, accessing an element by index is slower, because the JVM
must start at the beginning of the list and follow the references to find the element.

Overall, the choice between `ArrayList` and `LinkedList` depends on the specific requirements of your program. If you
need fast random access to elements, use an `ArrayList`. If you need fast insertion or removal of elements, use a
`LinkedList`.

     */
    // ArrayList<> removing or deleting is not a best practice in ArrayList especially with a large data set.
    /* this is too large of a task for Java.

    - Adding elements into an ArrayList<> makes Java Re-index, this is also too many tasks for Java and this is why it
    is not preferred for ArrayList for adding operations.

    - Linked List structure is better for this -
    1) Link list works with Nodes not elements.
    - the structure of a node is
    i. Data Part
    ii. Pointer Part
    The pointer points to the next element call "Node" in the link.
    The first Link is called the "Head" and the Last link is called "Tail"
    The "Head" points to the first Node.
    The "Tail" is the last node of the LinkedList.
    2) When you remove Data or element from a LinkedList just the pointer is changed. Other elements are not changed
    this is preferred in removing operations.

    3) When you remove Data or element from a LinkedList just the pointer is changed. Other elements are not changed
    this is not too much work for Java to change the pointers and this is why LinkedList are preferred in adding operations

    - The benefit is that this cuts the workload by a lot for both removing operations and adding operations
    because only 1 or 2 pointers are changed rather than the whole list such as what would happen in an ArrayList<>.

    4) ArrayList<> uses indexes, Indexes are like addresses. When you have addresses it is very easy to find the elements
    because of that ArrayLists are very successful in "Search operations"
    5) LinkedLists<> does not use indexes, It means that nodes do not have addresses. When you don't have addresses
    it will be very difficult to find the nodes.  Because of that LinkedLists<> are not successful at 'Search operations'.

    - Summary of LinkedList<> vs ArrayList<> -
    if you Create functionality to add or remove data (museum visitors) as they come and go for example, you would use
    LinkedLists<> why? using nodes and pointers is much less workload for Java.

    If you create functionality to add data types such as zipcodes of the United States and search for example Miami
    zip code, ArrayList<> would be faster. ArrayList uses indexes that act as addresses, faster for searching data and
    less workload for java.
     */
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Nancy");
        names.addFirst("Jimbo");
        names.addLast("Francine");
        names.add(2,"William");

        System.out.println(names);

        // Java knows that if you are using LinkedList<> you are going to be mostly using to add or
        // remove methods. There are a lot if you look at names.remove() this is the fastest way to add and remove elements.
        // when you learn about methods look for 3 things
        // 1. What the method does add, remove etc...
        // 2. What does the method return String, Integer, Boolean
        // 3. How the code behaves for certain scenario.

        // pop() method (What does it do?)
        // Removes and returns first element of the list
        // pop is equivalent of removeFirst().
        // noSuchElementException - if list is empty
        names.pop();
        System.out.println(names);// removes Jimbo

        // poll() method (What does it do?)
        // same as pop with 1 difference
        // rather than returning error with NoSuchElementException, the return is "NULL" if the list is empty.

        // Retrieves but does not remove, the first element of the list// if list is empty it will give you error.
        String r1 = names.element();
        System.out.println(r1); //nancy

        // Retrieves but does not remove, the first elements of the list// if the list is empty
        String r2 = names.peek();
        System.out.println(r2);

        // getFirst() returns the first element in the list
        // throws noSuchElementException for empty list.

        // get(1) method gets the 2nd element in the list

        String r3 = names.set(1,"john");
        System.out.println(r3);

    }

}
