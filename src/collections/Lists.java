package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Array list, linkedlist, stacks, vector
        List<String> fruits = new ArrayList<>();


        // Ordered Structure, can access elements by their location
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("orange");
        // can replace by using the set(index, replaceElement)
        // can use the remove() method to remove by either index of object

        // Enhanced loops
        for(String s : fruits){
            System.out.println(s);
        }
        //forEach() method + Lambda expressions
        fruits.forEach(f -> System.out.println(f));
        fruits.forEach(System.out::println);
        fruits.forEach(f -> {
            f = "fruits: " + f;
            System.out.println(f);
        });

        System.out.println(fruits);

        System.out.println(fruits.get(1));

        //check index of
        System.out.println(fruits.indexOf("apple"));

    }
}
