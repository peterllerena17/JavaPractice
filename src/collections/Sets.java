package collections;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Sets {
    public static void main(String[] args) {

        // Unordered
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Lemon");
        System.out.println(fruits);
        fruits.stream().map(String::toUpperCase).forEach(System.out::println);


        //contains() returns a boolean value
        System.out.println(fruits.contains("Lemon"));

        // remove() allows to delete from collection
        fruits.remove("Lemon");
        // size checks number of elements in the collection
        System.out.println(fruits.size());


        // setting the method this way makes it immutable/it cannot be changed
        Set moreFruit = Set.of("pear", "raisin", "cherry");
        System.out.println(moreFruit);


        // Streams ex
        int [] nums = {0,2,4,6,8,10};
        Arrays.stream(nums).parallel().forEach(n -> System.out.print(n+1+ " "));




    }
}
