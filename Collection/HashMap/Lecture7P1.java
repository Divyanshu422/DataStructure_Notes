/*
 * The order of storing in the hashMap is not preserved
 */

import java.util.HashMap;
import java.util.Map;

public class Lecture7P1 {

    public static void main(String[] args) {
        Map<String, Integer> mapObj = new HashMap<>();
        mapObj.put("Apple", 1000);
        mapObj.put("Orange", 2000);
        mapObj.put("Banana", 1400);
        mapObj.put("Guava", 1400);
        System.out.println(mapObj); // toString() method is called

        // * {Guava=1400, Apple=1000, Orange=2000, Banana=1400}
    }

}
