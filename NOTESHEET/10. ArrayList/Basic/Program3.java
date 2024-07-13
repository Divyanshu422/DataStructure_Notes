/*
 *  In this sheet we are trying to add the element in the arrayList using the 
 *  add method => add(index, element).
  
    * In the code we have added the element at the 8th index. (such that there is no element in btw index = 3 to 7).
            ! This will give the error.
            ! Why?
    * The issue you're encountering is due to a misunderstanding of how the add method with an index works in 
    * ArrayList.The ArrayList in Java is dynamic in terms of its capacity, meaning it can grow as needed when 
    * elements are added. However, the add(int index, E element) method does not allow you to add an element at an 
    * arbitrary index if there are not enough elements in the list up to that point. The index you specify must be 
    * within the current range of the list, which is from 0 to size() (inclusive).
 */

import java.util.ArrayList;

class Program3 {
    public static void main(String[] args) {
        // * Defining the ArrayList with initial capacity 2
        ArrayList<Integer> arrList = new ArrayList<>(2);

        // * Adding the element
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        // * addding the element at the 8th position:
        arrList.add(8, 80); // ! This line will throw an IndexOutOfBoundsException
        System.out.println(arrList); // ! Error

        /*
         * Correct Approach
         * Mention in readMe.md file or
         * Image folder => 1.CorrectApproachForAddingElement.png
         */

    }
}
