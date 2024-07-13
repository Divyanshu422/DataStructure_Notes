/*
 * Q: Sorting the arrayList?
 * -> We are using the inbuilt sort method which is present in Collections class
 * -> the sort method in the Collections class is a static method. This means
 * you call it on the class itself rather than on an instance of the class.
 */

import java.util.ArrayList;
import java.util.Collections;

class Program6 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(90);
        arrList.add(2);
        arrList.add(22);
        arrList.add(14);
        arrList.add(76);
        arrList.add(45);

        System.out.println("the result before sorting " + arrList); // * the result before sorting [10, 90, 2, 22, 14,
                                                                    // 76, 45]
        Collections.sort(arrList);
        System.out.println("the result after sorting " + arrList); // * the result after sorting [2, 10, 14, 22, 45, 76,
                                                                   // 90]

        Collections.sort(arrList, Collections.reverseOrder());

        System.out.println("the reverse order sorting " + arrList); // * the reverse order sorting [90, 76, 45, 22, 14,
                                                                    // 10, 2]

    }
}