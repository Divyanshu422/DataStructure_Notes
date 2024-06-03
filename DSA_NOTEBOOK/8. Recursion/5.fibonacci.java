
// Fibonacci series is sum of last 2 number

class Fibonacci {

    static int fib(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        } else {
            int sum = fib(num - 1) + fib(num - 2);
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.print("Fibonacci Series up to 11: ");
        fib(11);
    }
}
