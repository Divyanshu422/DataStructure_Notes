import java.util.Scanner;

class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt(); // * Consuming the input from the user

        for (int i = 0; i < row; i++) {
            int star = 1;
            for (int j = 0; j < row; j++) {
                if (star <= row - i) {
                    System.out.print("*");
                    star++;
                }
            }
            System.out.println();
        }
    }
}
