/*
    ! Ashok IT, Lecture 2 => at 48 min
    * Creating the object of arraylist class and calling the instance method -> add.
    * We have defined the arrayList of capacity 2. but adding the 3rd element to it
    * will not result into the error.
    *  Due to this dynamic nature -> collection came into being.
*/

/*
    *  1. Internally the arrayList is as an array (more specific Object array). 
    *  2. to print the arrayList => we need to pass the object directly to the print statement (Line 23)
    *  3. whereas to print array -> either we need to use for loop, toString method other we will get the 
          hexa code
*/
import java.util.Arrays;
import java.util.ArrayList;

class Program {
    public static void main(String[] args) {
        ArrayList<Integer> arrObj = new ArrayList<Integer>(2);
        arrObj.add(10);
        arrObj.add(20);
        arrObj.add(30);
        System.out.println(arrObj); // [10, 20, 30]

        // Printing the array
        int[] arr = { 10, 20, 30 };
        System.out.println(arr); // Print the memory address of the array: [I@7344699f
        System.out.println(Arrays.toString(arr));

    }
}