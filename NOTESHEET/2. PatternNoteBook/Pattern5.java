/*
 * Problem statement
 *                  5432*
 *                  543*1
 *                  54*21
 *                  5*321
 *                  *4321
 */

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt(); // * Consuming the input from the user

        for (int i = 0; i < row; i++) {
            int number = 5;
            for (int j = 0; j < row; j++) {
                if (j == (row - 1 - i)) {
                    System.out.print("*");
                    number -= 1;
                } else {
                    System.out.print(number);
                    number -= 1;
                }
            }
            System.out.println();
        }
    }

}
