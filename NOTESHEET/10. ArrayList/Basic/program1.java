
/*
    * Adding the element to the list beyound the size initialized. in Arraylist
    * we can add the element but in the array we cant do the same
    * In this sheet we are performing the basic method of arrayList:
                * Defining the syntax of arrayList
                * add method(E object)
                * get method(index)
                * remove method
                * set method => add particular index
                * contains method 
                * size method -> similary to the length property in array
*/

//  Importing the package of arrayList
import java.util.ArrayList;

class Program1 {
    public static void main(String[] args) {

        // * Syntax of arrayList
        ArrayList<String> fruits = new ArrayList<>();

        // ! Add method
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Guava");
        fruits.add("Peach");

        System.out.println(fruits); // * [Apple, Orange, Banana, Pineapple, Guava, Peach] */

        // ! get method
        String obj = fruits.get(2); // * Since we have stored the String in the arraYlist so we need to use String
                                    // not Object variable */
        System.out.println(obj); // * Banana

        // ! set method
        fruits.set(5, "pomegranate"); // * [Apple, Orange, Banana, Pineapple, Guava, pomegranate] */
        System.out.println(fruits);

        // ! Remove method: we can pass index or the value
        fruits.remove("Orange");
        System.out.println(fruits); // [Apple, Banana, Pineapple, Guava, pomegranate]

        // ! Contains methods
        if (fruits.contains("Orange")) {
            System.out.println("ArrayList contains 'Orange'");
        } else {
            System.out.println("ArrayList does not contain 'Orange'");
        }

        // ! Size method

        int sizeOfAL = fruits.size();
        System.out.println("The size of the ArrayList is " + sizeOfAL); // * The size of the ArrayList is 5 */

        for (String fruit : fruits) {
            System.out.print(" " + fruit); // Apple Banana Pineapple Guava pomegranate
        }
        System.out.println();

        int i = 0;
        while (i < fruits.size()) {
            System.out.print(" " + fruits.get(i)); // * */ Apple Banana Pineapple Guava pomegranate
            i++;
        }

    }
}
