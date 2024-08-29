import java.util.*;

public class Progam2 {
    public static void main(String[] args) {
        List<Integer> listObj = new ArrayList<>();
        listObj.add(34);
        listObj.add(20);
        listObj.add(30);
        listObj.add(40);
        listObj.add(50);

        // System.out.println(Collections.sort(listObj));
        // * This is wrong becoz Collection.sort() -> sorts the list in place and
        // returns void */

        // Sort the list -> ascending order
        Collections.sort(listObj);

        // Print the sorted list
        System.out.println(listObj);
    }
}
