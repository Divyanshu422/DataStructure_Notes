
/*
 * Printing the toggle effect: for n = 5
 * 1 0 1 0 1
 * 0 1 0 1 0
 * 1 0 1 0 1
 * 1 0 1 0 1
 * 0 1 0 1 0
 */

class Program8 {
    public static void main(String[] args) {
        int n = 5;
        int number = 1; // * Used as toggle indicator or we can use flag = true
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (number % 2 != 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
                number++;
            }
            System.out.println(); // Next Line
        }
    }
}
