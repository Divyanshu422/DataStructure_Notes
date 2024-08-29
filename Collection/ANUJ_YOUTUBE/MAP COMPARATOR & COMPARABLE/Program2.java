
/*
 *  using keySet, values and enterie
 */

import java.util.Collection;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;

class Program2 {
    public static void main(String[] args) {
        Map<String, Integer> mapObj = new HashMap<>();
        mapObj.put("Orange", 100);
        mapObj.put("Apple", 400);
        mapObj.put("Banana", 300);
        mapObj.put("Guava", 200);

        // Extracting all keys -> as Keys are of String type
        Set<String> keyObj = mapObj.keySet();
        System.out.println(keyObj); // * [Guava, Apple, Orange, Banana]

        // Extracting all keys -> as Keys are of String type
        // * Set<Integer> valueObj = mapObj.values(); => wrong becoz The values() method
        // * returns a Collection<Integer>, not a Set<Integer>.
        Collection<Integer> valueObj = mapObj.values();
        System.out.println(valueObj);

        // * Extracting the Enteries
        Set<Map.Entry<String, Integer>> entryObj = mapObj.entrySet();
        System.out.println(entryObj); // * [Guava=200, Apple=400, Orange=100, Banana=300]

        for (Map.Entry<String, Integer> entry : entryObj) {
            System.out.println(entry);
        }
        /*
         * Guava=200
         * Apple=400
         * Orange=100
         * Banana=300
         */
    }
}