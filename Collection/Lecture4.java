
/*
 *  In the previous class we have created a custom ArrayList and applied the add method
 *    ->  Now writing the custom method for printing the arraylist
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Program4 {
    Object[] obj = null;
    int index = 0;

    public Program4(int size) {
        obj = new Object[size];
    }

    public Program4() {
        obj = new Object[10];
    }

    public void add(Object obj) {
        if (index >= this.obj.length) {
            // calculating the newSize
            int newSize = (this.obj.length + (this.obj.length / 2));
            Object[] newObject = Arrays.copyOf(this.obj, newSize);
            this.obj = newObject;
        }
        this.obj[index] = obj;
        index++;
    }

    @Override
    public String toString() {
        StringBuilder printString = new StringBuilder();
        printString.append("[");
        for (int i = 0; i < index; i++) {
            printString.append(this.obj[i]);
            if (i < this.obj.length - 1 && this.obj[i + 1] != null) {
                printString.append(", ");
            }
        }
        printString.append("]");

        // When you call toString() on a StringBuilder instance, Java resolves this call
        // to the toString method defined in the StringBuilder class, which converts the
        // sequence of characters in the StringBuilder to a String.

        return printString.toString(); // Calls StringBuilder's toString method
    }

    public static void main(String[] args) {
        Program4 cl = new Program4(3);
        cl.add("Hello");
        cl.add("World");
        cl.add("Java");
        cl.add("Program");
        cl.add("Program1");
        cl.add("Program2");
        // System.out.println("Printing the object " + cl);
        System.out.println("The output is " + cl.toString());
    }
}
