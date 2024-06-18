/*
 *          1 
 *          2 3 
 *          4 5 6
 *          7 8 9 10
 * 
 * Note:
 *  printingCharacter is increasing at every iteration and independent of row and column 
 */

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt(); // * Consuming the input from the user
        int printingChar = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print(printingChar + " ");
                printingChar++;
            }
            System.out.println();

        }
    }
}
