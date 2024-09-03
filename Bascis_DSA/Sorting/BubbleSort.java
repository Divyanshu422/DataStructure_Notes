import java.util.Arrays;

class Program1 {

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            // once the largest element is reached at the end -> so in 2nd iteration no need
            // to check it
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 50, 20, 30, 10, 40 };
        bubbleSort(arr);
        System.out.println("Sorted Array data is " + Arrays.toString(arr));
        // Sorted Array data is [10, 20, 30, 40, 50]
    }
}