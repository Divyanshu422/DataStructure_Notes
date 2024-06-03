
// import java.util.ArrayList;

// // Adding the element to the arrayList using add method
// class Main {

// public static void main(String[] args) {

// ArrayList<Integer> list = new ArrayList<Integer>();

// // * Adding to the list: add() method is used. time complexity is O(1)
// list.add(10);
// list.add(20);
// list.add(30);
// list.add(40);
// list.add(50);
// list.add(2, 28);
// System.out.println(list); // [10, 20, 28, 30, 40, 50]

// ! ----------------------------------------------------------------
// ! part 2 of add method which is not allowed. In this code example
/*
 * you cannot directly add an element at an index that is beyond the current
 * size of the ArrayList using the add method. The add method only allows you to
 * add elements within the current size of the list or at the end of the list.
 */

// list.add(8, 40); //* this is give error as the list is of length 2.
// java.lang.IndexOutOfBoundsException: Index: 8, Size: 3
// In this code we are adding the element at the 8th index so the output will be
// error becoz the current
// Size of list is 5

// }
// }
