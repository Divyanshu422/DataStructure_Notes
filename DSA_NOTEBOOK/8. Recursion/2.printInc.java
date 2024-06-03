
//  Creating the java program => printing 1 to n in increasing order
// import java.util.Scanner;

class printInc {
    static void PrintInc(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        } else {
            PrintInc(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        // Declaring or Scanning the variable
        // Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        int a = 10;
        PrintInc(a);

    }
}
