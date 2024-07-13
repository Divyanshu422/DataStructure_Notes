/*
 *  Problem: Swap the 2 number in arrayList (very Easy)
          * Given: 2 index which need to swapped. 
 */

import java.util.ArrayList;

class Program5 {
    /*
     * In Java, when you pass an ArrayList (or any other object) to a method, you
     * are passing the referenc to the object, not a copy of the object itself. This
     * means that any changes made to the object within the method will affect the
     * original object outside the method. This concept is known as
     * "pass-by-reference" for objects.
     */

    public void swapValue(ArrayList<Integer> input, int index1, int index2) {
        int temp = input.get(index2);
        // * */ Assigning the value using the set Method
        input.set(index2, input.get(index1));
        input.set(index1, temp);

    }

    public static void main(String[] args) {
        // Create an instance of Program4
        Program5 program = new Program5();

        ArrayList<Integer> arrList = new ArrayList<>();
        // Adding the element
        arrList.add(10);
        arrList.add(220);
        arrList.add(92);
        arrList.add(32);
        arrList.add(55);
        arrList.add(8);
        System.out.println(arrList); // [10, 220, 92, 32, 55, 8]
        program.swapValue(arrList, 1, 4);
        System.out.println(arrList); // [10, 55, 92, 32, 220, 8]
    }
}