package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Array list, linkedlist, stacks, vector
        List fruits = new ArrayList();


        // Ordered Structure, can access elements by their location
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("orange");
        // can replace by using the set(index, replaceElement)
        // can use the remove() method to remove by either index of object

        System.out.println(fruits);

        System.out.println(fruits.get(1));

        //check index of
        System.out.println(fruits.indexOf("apple"));

    }
}
