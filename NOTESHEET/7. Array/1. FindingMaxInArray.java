// finding the maximum in the given array

class Program {

    // Making the method as static => so that it can be directly called
    public static int findMax(int[] arr, int size) {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 23, 44, 55, 66, 91, -10 }; // Using this bracket {} not []
        int size = arr.length;
        int maxElement = findMax(arr, size);
        System.out.println("the greatest element is : " + maxElement);
    }
}