import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Program3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // Access and print the first element
        System.out.println(list.get(0)); // Outputs: Hello

        Iterator<String> iter = list.iterator();

        // Modify elements using the iterator
        while (iter.hasNext()) {
            String element = iter.next();
            if (element.equals("Hello")) {
                iter.remove(); // Remove "Hello" from the list
            }
        }

        // Add a new element after modification
        list.add("Everyone");

        // Access and print the first element again
        System.out.println(list.get(0)); // Outputs: World

        // Display the modified list
        iter = list.iterator(); // Re-initialize iterator to iterate over the modified list
        while (iter.hasNext()) {
            System.out.println(iter.next()); // Outputs: World, Everyone
        }
    }
}


/*
 *            System.out.println(list.get(0));              // Correct
 *            System.out.println(list.[0]);              // Wrong
 */