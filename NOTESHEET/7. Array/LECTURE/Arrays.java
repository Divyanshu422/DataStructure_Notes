/*
 * Default value stored in the array
 * Implementing the for_each loop to print the element of the array
 */
class Array1 {

    public static void main(String[] args) {
        int[] array1 = new int[5]; // * 0
        float[] array2 = new float[5]; // * 0.0
        boolean[] array3 = new boolean[5]; // * false

        System.out.println();
        System.out.println();
        System.out.println();

        // * Printing the default value */
        System.out.println("Default value of int array: " + array1[0]);
        System.out.println("Default value of int array: " + array2[0]);
        System.out.println("Default value of int array: " + array3[0]);

        System.out.println();
        System.out.println();
        System.out.println();

        int[] arr = { 10, 20, 30, 40, 50, 60 };
        // For each loop for traversing the array
        for (int data : arr) {
            System.out.print(data + ", ");
        }
    }

}
