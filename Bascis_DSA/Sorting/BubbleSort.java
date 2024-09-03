import java.util.Arrays;

class Program1 {

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = true;
                }
            }
            if (!isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 50, 20, 30, 10, 40 };
        bubbleSort(arr);
        // * System.out.println("Sorted Array data is " + Arrays.toString(arr));
        // Sorted Array data is [10, 20, 30, 40, 50]

        /*
         * Stream way to represent the array
         */

        Arrays.stream(arr).forEach(element -> {
            System.out.print(element + "->");
        });
    }
}

/*
 * Swapping using 2 variable:
 * a = 10 b = 20;
 * a = a + b; //! 30
 * b = a - b; //! 30 - 20 => 10
 * a = a - b; //! 30 - 10 => 20
 */