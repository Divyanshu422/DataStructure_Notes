
/*
 *   _ _ _ 1
 *   _ _ 1 2
 *   _ 1 2 3
 *   1 2 3 4
 * 
 *  Finding:
 *          1. row = coloumn
 *          2. white space = row - 1; (for each row)
 */

import java.util.Scanner;

class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt(); // * Consuming the input from the user
        for (int i = 0; i < row; i++) {
            int number = 1;
            for (int j = 0; j < row; j++) {
                if (j < (row - i - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print((number));
                    number++;
                }
            }
            System.out.println();
        }
    }
}