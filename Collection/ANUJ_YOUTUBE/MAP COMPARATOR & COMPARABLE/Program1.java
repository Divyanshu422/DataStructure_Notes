/*
 * Basic of map Interface -> Implementation
 */

import java.util.HashMap;
import java.util.Map;

class PrograM {
    public static void main(String[] args) {
        Map<String, Integer> mapObj = new HashMap<>();
        Map<String, Integer> mapObj2 = new HashMap<>();

        // * Put method */
        mapObj.put("Orange", 100);
        mapObj.put("Apple", 400);
        mapObj.put("Orange", 300); // * Will append the above value as key cant be duplicate
        System.out.println(mapObj); // * {Apple=400, Orange=300}

        // remove method -> consume the key
        mapObj.remove("Orange");
        System.out.println("the new data is " + mapObj); // * the new data is {Apple=400}

        // * contains method -> return true or false if it contains or not
        System.out.println(mapObj.containsKey("Orange")); // * false

        // * PutIfAbsent method => only add the key if it is not present
        mapObj.putIfAbsent("Apple", 600);
        System.out.println(mapObj); // * {Apple=400}

        // * PutAll method -> insert all the entries
        mapObj2.putAll(mapObj);
        System.out.println(mapObj2); // * {Apple=400}

        // * get method -> takes the keys
        System.out.println(mapObj.get("Apple")); // * 400
    }
}