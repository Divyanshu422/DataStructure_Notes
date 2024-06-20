
/*
 * Basic Recursion Problem:
 *              1. Printing the name 5 times
 *              2. Printing linearly 1 to n.
 *              3. Printing in reverse fashion => n to 1.
 *              4. Implementing the backtracking to print 1 to n => In this case we first gave stack 
 *                 call and then print the number
 *              5. Implementin gthe backtracking to print n to 1
 *              
 */

class Program {
    public static void printName(String name, int count) {
        if (count == 0)
            return;
        else {
            System.out.println(name);
            printName(name, --count); // Predecrement Done. In case of Post decrement, there will be condition of
                                      // stack overflow
        }
    }

    public static void ascendingPrinting(int number, int n) {
        if (n > number)
            return;
        else {
            System.out.println(n);
            ascendingPrinting(number, n + 1);
        }
    }

    public static void descendingPrinting(int number) {
        if (number == 0)
            return;
        else {
            System.out.println(number);
            descendingPrinting(number - 1);
        }
    }

    public static void backAscPrinting(int number) {
        if (number == 1)
            System.out.println(1);
        else {
            backAscPrinting(number - 1);
            System.out.println(number);
        }
    }

    public static void backDscPrinting(int number, int n) {
        if (n > number)
            return;
        else {
            backDscPrinting(number, n + 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        // * Code1: Printing the name 5 times
        // printName("Rahul", 5);

        // * Code 2: Printing from 1 to n
        // int number = 10;
        // ascendingPrinting(number, 1);

        // * Code 3: Printing descending order:
        // int number = 10;
        // descendingPrinting(number);

        // * Code 4: BackTracking Ascending order:
        // int number = 10;
        // backAscPrinting(number);

        // * Code 4: BackTracking Ascending order:
        // int number = 10;
        // backDscPrinting(number, 1);
    }
}
