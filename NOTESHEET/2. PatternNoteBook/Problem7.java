/*
 * Printing the start pattern
 *   Note: we have to start n to 1 row wise and 1 to n column wise
 *          Print start for row =1, column = 1 and when row == column         
 * 
 *               1 2 3 4 5
 *           5   * * * * *
 *           4   *     * 
 *           3   *   *    
 *           2   * *
 *           1   *    
 */

import java.util.Scanner;

class Program7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the row");
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == n || j == 1 || i == j)
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}