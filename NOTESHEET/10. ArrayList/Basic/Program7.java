/*
 * Defining the 2-d ArrayList: which is nothing but list of list
 */

import java.util.ArrayList;

class Program7 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList2D = new ArrayList<>();

        // Defining 1-D list which is added to arrayList of 2-d
        ArrayList<Integer> innerList1 = new ArrayList<>();
        innerList1.add(2);
        innerList1.add(4);
        innerList1.add(6);

        ArrayList<Integer> innerList2 = new ArrayList<>();
        innerList2.add(3);
        innerList2.add(6);
        innerList2.add(9);

        // Adding
        arrayList2D.add(innerList1);
        arrayList2D.add(innerList2);

        // Print the 2D ArrayList
        // System.out.println(arrayList2D); // * [[2, 4, 6], [3, 6, 9]]

        // for (ArrayList<Integer> List : arrayList2D) {
        // for (int data : List) {
        // System.out.print(data);
        // }
        // }

        for (int i = 0; i < arrayList2D.size(); i++) {
            // ! at each index we are getting the ArrayList not data. so storing it in the
            // currList variable
            ArrayList<Integer> currList = arrayList2D.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)); // 246 369
            }
            System.out.println();
        }

    }
}