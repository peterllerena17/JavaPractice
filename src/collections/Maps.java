package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // Does not inherit from the collection interface


        Map fruitCalories = new HashMap();
        fruitCalories.put("Apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("orange", 85);

        fruitCalories.forEach((k, b) -> System.out.println(k + " :" + b));


        System.out.println("Apple: " + fruitCalories.get("Apple"));

        // can check if an element contains a key or value by using containsKey() and/or containsValue()



    }
}
