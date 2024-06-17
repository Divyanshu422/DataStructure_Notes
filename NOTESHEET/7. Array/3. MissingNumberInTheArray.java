/*
 * Finding the missing number in the array. the array contain number from
 * 1 to 10. Only one number is missing
*/

//  Brute force approach

class Program1 {

    public static int findMissing(int[] arr) {
        for (int num = 1; num <= 10; num++) {
            boolean flag = false; // for tracking the number is present or not
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    flag = true; // number is present
                    break;
                }
            }
            if (flag == false) {
                return num;
            }
        }
        return 0; // Never executed => only executed when array contains all the elements
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 10, 2, 4, 5, 8, 6, 9, 7 };
        System.out.println("The missing number in the array is " + findMissing(arr));
    }
}