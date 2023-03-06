package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

        // Unordered
        Set fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Lemon");
        System.out.println(fruits);

        //contains() returns a boolean value
        System.out.println(fruits.contains("Lemon"));

        // remove() allows to delete from collection
        fruits.remove("Lemon");
        // size checks number of elements in the collection
        System.out.println(fruits.size());


        // setting the method this way makes it immutable/it cannot be changed
        Set moreFruit = Set.of("pear", "raisin", "cherry");
        System.out.println(moreFruit);

    }
}
