
// LinearSearch in array -> in this code we will search the elemnet in the array whether it is present or not.

class Program {

    public static boolean linearSearch(int[] arr, int key) {
        // ! Remember the length method applied to the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Declaring the array
        int arr[] = { 10, 15, 20, 7, 44, 90 };
        boolean result = linearSearch(arr, 7);
        boolean result2 = linearSearch(arr, 20);
        System.out.println(result + " " + result2);     //*  true true
    }
}
