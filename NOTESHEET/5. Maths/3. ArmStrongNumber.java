class Program3 {

    static boolean armstrong(int number) {
        int originalNumber = number; // Keep the original number for comparison
        if (number == 0)
            return true;
        int sum = 0;
        while (number > 0) {
            int variable = number % 10;
            sum = sum + (variable * variable * variable);
            number = number / 10;
        }
        if (sum == originalNumber)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println(armstrong(number));
    }
}
