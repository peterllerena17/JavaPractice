package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("orange");
        System.out.println(fruits);

        // in order + allows duplicated + follows FIFO for processing
        // fifo ex
        var removed = fruits.remove();
        // it will be the apple since it is first
        System.out.println(removed);

        // use peek() to return the head of the queue
        var head = fruits.peek();
        System.out.println(head);

    }
}
