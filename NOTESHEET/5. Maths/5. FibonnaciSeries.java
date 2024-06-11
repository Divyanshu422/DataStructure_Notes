import java.util.Scanner;

class Main {

    // Calculate the Fibonacci sequence for a given number
    public static int Fibonnaci(int number) {
        // Base cases for the Fibonacci sequence
        if (number == 1) {
            return 0;
        } else if (number == 2) {
            return 1;
        } else {
            // Initialize variables for the Fibonacci sequence
            int previous = 0;
            int current = 1;
            int next = 0;
            // Calculate the Fibonacci sequence for numbers greater than 2
            for (int i = 3; i <= number; i++) {
                // Calculate the next number in the sequence
                next = current + previous;
                // Update the variables for the next iteration
                previous = current;
                current = next;
            }
            // Return the last number in the sequence
            return next;
        }
    }

    // Main method to test the Fibonacci function
    public static void main(String[] args) {
        // Create a scanner to read input from the user
        Scanner scan = new Scanner(System.in);
        // Read the number from the user
        int Number = scan.nextInt();
        // Print the Fibonacci sequence for the given number
        System.out.println(Fibonnaci(Number));

    }
}