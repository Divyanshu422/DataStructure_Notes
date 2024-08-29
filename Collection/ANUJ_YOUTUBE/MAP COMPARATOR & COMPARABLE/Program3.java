/*
 *  Iterating over map function
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Program3 {
    public static void main(String[] args) {

        Map<String, Integer> mapObj = new HashMap<>();
        mapObj.put("Orange", 100);
        mapObj.put("Apple", 400);
        mapObj.put("Banana", 300);
        mapObj.put("Guava", 200);

        // * Extracting the key-value usuing the entry */

        Set<Map.Entry<String, Integer>> entryObj = mapObj.entrySet();
        Set<String> strObj = mapObj.keySet();

        for (Map.Entry<String, Integer> entry : entryObj) {
            // * getkey and getValue method is applicable for single entry
            System.out.println(entry.getKey() + " " + entry.getValue());            // * Guava 200 Apple 400 Orange 100 Banana 300
        }

        for (String data : strObj) {
            System.out.println(data);       // * Guava Apple Orange Banana
        }

    }
}