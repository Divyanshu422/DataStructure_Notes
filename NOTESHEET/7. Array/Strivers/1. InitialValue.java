/*
 * what is the value Stored in the array when declared?
        * String is object type. so the value stored is null
        * For boolean the default value stored is false not true.
        * Numeric Types (int, double, float, etc.): The default value is 0.
 */

package Strivers;

class Program {
    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.println(arr[0]); // 0
        String[] str = new String[2];
        System.out.println(str[0]); // null
    }
}
