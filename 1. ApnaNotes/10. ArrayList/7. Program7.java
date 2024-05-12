
// 2-D ArrayList=>

// import java.util.ArrayList;

// class Main {
// public static void main(String[] args) {
// ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();

// // Creating a new 1D ArrayList
// ArrayList<Integer> list1 = new ArrayList<>();
// list1.add(1);
// list1.add(2);
// list1.add(3);

// // Creating a new 1D ArrayList
// ArrayList<Integer> list2 = new ArrayList<>();
// list2.add(6);
// list2.add(7);
// list2.add(8);
// list2.add(9);

// twoDArrayList.add(list1);
// twoDArrayList.add(list2);
// System.out.println(twoDArrayList); // * [[1, 2, 3], [6, 7, 8, 9]]

// for (int i = 0; i < twoDArrayList.size(); i++) {
// ArrayList<Integer> currList = twoDArrayList.get(i); // -> signfies the
// current index list

// for (int j = 0; j < currList.size(); j++) {
// System.out.print(currList.get(j) + " "); // * 1 2 3 6 7 8 9
// }
// }

// }
// }

// ! =======================================================================

/*
 * Storing the following in arrayList
 * list1 => [1 ,2, 3, 4, 5 ]
 * list2 => [2, 4, 6, 8, 10]
 * list3 => [3, 6, 9, 12, 15] in the 2D array list
 */

// class Main {
// public static void main(String[] args) {
// ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

// // Creating the individual arrayList
// ArrayList<Integer> list1 = new ArrayList<>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>();

// for (int i = 1; i < 6; i++) {
// list1.add(i * 1);
// list2.add(i * 2);
// list3.add(i * 3);
// }

// // adding the element to the mainList
// mainList.add(list1);
// mainList.add(list2);
// mainList.add(list3);

// System.out.println(mainList); // * [[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6,
// 9, 12, 15]]

// }
// }