
// factorial function
class fact {
    static int Factorial(int n) {
        // if (n == ) { -> Earlier condition. but factorial of 0 is 1. hence
        // We will chase the code till n == 0
        if (n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(Factorial(num)); // * 120
    }
}
