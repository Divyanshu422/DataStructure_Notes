
/*
 * 
 */
import java.util.HashMap;
import java.util.Map;

class Program1 {

    public static void main(String[] args) {

        // * Calculating the hashCode of 2 string */
        String s = "AB";
        System.out.println(s.hashCode()); // * 2081

        String s1 = new String("AB");
        System.out.println(s1.hashCode()); // * 2081 /

        /*
         * HashCode of both the string is same but does not means that string are also
         * same
         */
        System.out.println(s == s1); // * false

    }
}
