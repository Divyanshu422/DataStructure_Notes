
// Creating the recursive function to print n to 1 in decreasing order

class PrintDec {

    static void printDec(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n); // Printing the n
        printDec(n - 1); // Recursive calling
    }

    public static void main(String[] args) {
        // * Calling the function=
        printDec(5);
    }
}
