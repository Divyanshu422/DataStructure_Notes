/*
 * Implementing the HashSet:
 */

import java.util.HashSet;
import java.util.Set;

class Program1 {
    public static void main(String[] args) {
        Set<Integer> setObject = new HashSet<>();
        boolean b = setObject.add(1);
        boolean c = setObject.add(1);
        System.out.println(b);  // * true
        System.out.println(c);  // * false
    }
}


