
/*
 *      Problem:
 *                  A
 *                  A B A
 *                  A B C B A
 *                  A B C D C B A
 *                  A B C D E D C B A
 */

/*
 *     n => numbers of rows 
 *     number of rows: n 
 *     number of column: 2r-1 => r + (r-1);
 !     Ashok IT Lecture 10 -> Notability Page (1 and 2)      
 */
import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = scan.nextInt();
        for (int i = 0; i < row; i++) {
            int ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ch);
                ch++;
            }
            // System.out.print();
            // ! using the predecrement
            --ch;
            // Adding the second part
            for (int k = 0; k <= (i - 1); k++) {
                // Predecerement then printing
                System.out.print((char) (--ch));
            }

            System.out.println();
        }
    }
}