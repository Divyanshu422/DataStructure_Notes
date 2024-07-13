/*
 * MultiDimensional ArrayList:
 * [[2,4,6,8,10], [3,6,9,12,15], [5,10,15,20,25]]
 */

import java.util.ArrayList;

class Program8 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList2D = new ArrayList<>();

        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            List1.add(i * 2);
            List2.add(i * 3);
            List3.add(i * 5);
        }
        arrayList2D.add(List1);
        arrayList2D.add(List2);
        arrayList2D.add(List3);
        System.out.println(arrayList2D); // [[2, 4, 6, 8, 10], [3, 6, 9, 12, 15], [5, 10, 15, 20, 25]]

    }
}