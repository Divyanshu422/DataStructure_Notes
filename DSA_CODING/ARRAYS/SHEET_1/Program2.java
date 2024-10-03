
/*
 * Pass by value
 */

import java.util.Arrays;

class Program2 {
    public static void changeValue(int[] arr) {
        arr[0] = 50;
        arr[1] = 100;
        arr[2] = 150;
    }

    public static void changeReference(int[] arr) {
        int[] arr2 = { 90 };
        arr = arr2; // Referecing
        System.out.println("Printing the change reference value " + Arrays.toString(arr));
        // * Printing the change reference value [90]

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        System.out.println(Arrays.toString(arr)); // [10, 20, 30]
        changeValue(arr);
        System.out.println(Arrays.toString(arr)); // [50, 100, 150]
        changeReference(arr);
        System.out.println(Arrays.toString(arr)); // [50, 100, 150]
    }
}