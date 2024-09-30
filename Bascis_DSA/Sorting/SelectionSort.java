import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] receivedArr) {
        for (int i = 0; i < receivedArr.length - 1; i++) {
            for (int j = i + 1; j <= receivedArr.length - 1; j++) {
                if (receivedArr[i] > receivedArr[j]) {
                    int temp = receivedArr[i];
                    receivedArr[i] = receivedArr[j];
                    receivedArr[j] = temp;
                }
            }
        }
        return receivedArr;
    }

    public static void main(String[] args) {
        int[] arr = { 52, 22, 34, 16, 2, 1 };
        // Print the sorted array using Arrays.toString() for better output format
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
