/*
 * Finding the summation of N_numbers: 2 approaches are used:
 *                  1. functional approach
 *                  2. parameterised approach
 */

//! parameterised approach
// class Program2 {
//     public static void summation(int number, int sum) {
//         if (number < 1) {
//             System.out.println("Summation of N numbers is: " + sum);
//             return;
//         }
//         summation(number - 1, sum + number);
//     }

//     public static void main(String[] args) {
//         int number = 10;
//         summation(number, 0);
//     }
// }

//! Functional approach:
class Program2 {
    public static int summation(int number) {
        if (number == 0)
            return 0;
        else {
            return number + summation(number - 1);
        }
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println("The sum of first " + number + " is " + summation(number));
        // }
    }
}