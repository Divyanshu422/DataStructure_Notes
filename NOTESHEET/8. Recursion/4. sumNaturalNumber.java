// Creating a program for sum of N-natural number
class Program {

    static int SumNatural(int num) {
        if (num == 1) {
            return 1;
        } else {
            int sum = num + SumNatural(num - 1);
            return sum;
        }

        /*
         * Other method => first calling the function and then adding
         * 
         * static int SumNatural(int num) {
         * if (num == 1) {
         * return 1;
         * }
         * else{
         * int subSum = SumNatural(num-1) // this equation implies that we will get the
         * sum of num-1
         * int SumNatural = num + subSum
         * return SumNatural
         * }
         * 
         */
    }

    public static void main(String[] args) {
        System.out.println(SumNatural(10));
    }
}