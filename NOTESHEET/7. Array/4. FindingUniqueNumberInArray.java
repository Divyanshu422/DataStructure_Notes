/*  
    * Finding the unique element in the java. we can use the hash map, set etc
    * But now we are using only brute solution.
    * given array => [1,2,4,5,6,3,4,2,5]. so unique element -> 1, 6 and 3

    ! Approach
    * we will take each element as key and iterate over the array. if it occurs more than
    * one time then the element is not unique/
 */

class Program4 {
    public static void findUniqueElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i]; // Storing the each element as key for checking whether it occurs more than 2
                              // times
            int count = 0; // for tracking the count of element occurence
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == key) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("the unique element in the array are: " + key);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 4, 5, 6, 3, 4, 2, 5 }; // 1, 6, 3
        findUniqueElement(arr);
    }
}