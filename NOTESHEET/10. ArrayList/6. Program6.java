
// // Sorting the arrayList -> both ascending and descending order
// import java.util.ArrayList;

// //Importing the Collections class for the sorting method
// import java.util.Collections;

// class Main {

// public static void main(String[] args) {
// ArrayList<Integer> list = new ArrayList<>();
// list.add(2);
// list.add(17);
// list.add(36);
// list.add(15);
// list.add(9);
// System.out.println(list); // ! [2, 17, 36, 15, 9]
// /*
// * In java Collections class is a utility class in the Java Collections
// * Framework that consists exclusively of static methods used to operate on or
// * return collections. I
// */
// Collections.sort(list);
// System.out.println(list); // ! [2, 9, 15, 17, 36]

// // Sorting the arrayList in descending order
// Collections.sort(list, Collections.reverseOrder());
// /*
// * The second argument => Collections.reverseOrder() is a comparator function.
// * hey are used to precisely control the sorting of objects in collections.
// * Comparators can be passed to sorting methods like Collections.sort or
// * Arrays.sort to define the order of elements based on specific criteria.
// */

// System.out.println(list); // ! [36, 17, 15, 9, 2]
// }
// }
