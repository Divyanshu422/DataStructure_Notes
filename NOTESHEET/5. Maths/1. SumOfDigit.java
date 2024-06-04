// Lecture 4: Ashok It
// In this code we will find the sum of the number given to us. eg: 123 -> o/p is 6

class Program {
    public static int DigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(DigitSum(435)); // 12
    }
}