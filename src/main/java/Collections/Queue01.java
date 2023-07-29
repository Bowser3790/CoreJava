package Collections;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Queue01 {
    // 1) Queues use First in first out (FIFO) rule.
    /*
        2) Deque stands for double ended que.
        - uses LIFO (LIFO - Last in First out) and FIFO

        // LinkedLists will be in insertion order

     */
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("Brad");
        myQueue.add("Frank");
        myQueue.add("Benji");
        myQueue.add("Tanya");
        System.out.println(myQueue);// elements are in "insertion order" because I used LinkedList as a constructor.
        //myQueue.peek();// peek method is for first element...
        // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        //Returns:
        //the head of this queue, or null if this queue is empty

        // myQueue.offer(); offer() method does the same thing as add() method> but you can also put restrictions to the
        // collections to add elements.
        // for example: don't accept more than 500 elements
        // offer() will check the restriction first and if restriction is not broken it will accept the element and if the
        // restriction is broken then it will not add the element.

        Queue<String> myQueue2 = new PriorityQueue<>();
        myQueue2.add("Brad");
        myQueue2.add("Frank");
        myQueue2.add("Benji");
        myQueue2.add("Tanya");
        System.out.println(myQueue2);// elements are placed in Java logic we don't know what that is. It will be
        // random order for PriorityQueue
        // in Lambda we will be able to create our own logic in the way we want.

        Deque<String> dq = new LinkedList<>();
        dq.add("Brad");
        dq.add("William");
        dq.add("Maria");
        dq.add("Frank");
        System.out.println(dq);
        // if you look at all the methods() they are addFirst addLast, there are first and last for all methods.
        // The methods are focusing on first and last elements because Dequeue is double ended
        // in queue last element is not important just first element is important




    }
}