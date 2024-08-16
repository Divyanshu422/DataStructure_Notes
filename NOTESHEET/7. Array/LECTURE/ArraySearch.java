/*
 * Write the code to search the element in the array:
 * 
 */

class Program {
    public static boolean findElement(int[] input, int key) {
        for (int data : input) {
            if (data == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        int key = 40;
        System.out.println(findElement(arr, key));
    }
}