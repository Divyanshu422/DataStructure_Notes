import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        List<Integer> listObj = new ArrayList<>();
        listObj.add(80);
        listObj.add(10);
        listObj.add(30);
        listObj.add(20);
        listObj.add(25);
        System.out.println(listObj); // * [80, 10, 30, 20, 25]
        Collections.sort(listObj);
        System.out.println(listObj); // * [10, 20, 25, 30, 80]
        /*
         * Passing the 2nd parameter in the sort method (where it is overloaded) which takes
         * Comparators. 
         * the reverseOrder() method returns a comparator 
         */
        Collections.sort(listObj, Collections.reverseOrder());
        System.out.println(listObj); // * [80, 30, 25, 20, 10]
    }
}
