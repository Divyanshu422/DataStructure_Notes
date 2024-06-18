/*
 * Printing the hallow rectangle:
 *                  * * * *
 *                  *     *
 *                  *     *
 *                  * * * *
 */

import java.util.Scanner;

class Problem4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt(); // * Consuming the input from the user

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == 0 || i == row - 1 || j == 0 || j == row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
