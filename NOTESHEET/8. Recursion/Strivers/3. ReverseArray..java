
/*
 * Reversing the elements of the array using the recursion.
 * Strategy:
 *       1. Taking 2 pointer left and right. for each stack call the element at left and right index are
 *          Swapped and then the function is again called to increased and decreased value of left and right
 *          respectively
 *       2. Base condition: when the left cross or equals the right 
 */
import java.util.Arrays;

class Program3 {
    public static void reverseArray(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 10, 22, 4, 15, 71 };
        // passing array, left and right pointer
        reverseArray(arr, 0, arr.length - 1);
        String str = Arrays.toString(arr);
        System.out.println("Reversed array is: " + str);
    }
}