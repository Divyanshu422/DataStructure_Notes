// ! Implementing the addition of Digit using String method.
/*
            Method used in solving the proble -> charAt() and length()
*/

class Program2 {
    public static void DigitSumString(String str) {
        /*
         * Since the input to the method is String -> So there is 2 method used in
         * String:
         * 1. charAt() => used to access the String character
         * 2. length() => for size of string
         */
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); /*
                                      * output -> '1' '2' '3' '4' '5' which in int format is 49, 50, 51, 52, 53.
                                      * we dont want to add 49,50,51,52,53. rather we want to add 1,2,3,4,5.
                                      * so to achieve this we need to subtract the ch with 48 or '0'
                                      */
            sum = sum + (ch - '0');
        }
        System.out.println(sum); // 15

    }

    public static void main(String[] args) {
        DigitSumString("12345");
    }
}