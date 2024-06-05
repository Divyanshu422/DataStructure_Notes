/*
 * what is harshad number?
 * A Harshad number (or Niven number) is an integer that is divisible by the sum of its digits. 
 * The term "Harshad" comes from the Sanskrit words "har" (joy) and "shad" (give), meaning "joy-giver." 
 * eg: 18 => sum of digit is 9 and 18/9 => 2. hence 18 is harshad number
 */

//  ! Note: in the function/methods before changing the number it is vital to save it to the variable. 

class Program4 {
    public static boolean HarshadNumber(int number) {
        // * Storing the original number into the variable */
        int originalNumber = number;
        if (number == 0)
            return false;
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        if (originalNumber % sum == 0)
            return true; // * Completely divisible */
        return false;
    }

    public static void main(String[] args) {
        int number = 38;
        boolean result = HarshadNumber(number);
        System.out.println(" the number is or not harshad number " + result);
    }
}