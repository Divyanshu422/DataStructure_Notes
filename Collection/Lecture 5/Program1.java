/*
 *  Implementing the remove method in the Java"
 *          1. let suppose the arrayList is like => 10 -> 20 -> 30 -> 40 -> 50 -> 60        [[ size: 6 ]]
 *          2. After removing the element (30), AL becomes =>  10 -> 20 -> 40 -> 50 -> 60   [[ size: 5 ]]
 */

import java.util.Arrays;

class Program1 {
    Object[] obj = null;
    int index = 0;

    public Program1(int size) {
        obj = new Object[size];
    }

    public Program1() {
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
        printString.append(" [ ");
        for (int i = 0; i < index; i++) {
            printString.append(this.obj[i]);
            if (i < this.obj.length - 1 && this.obj[i + 1] != null) {
                printString.append(", ");
            }
        }
        printString.append(" ] ");
        return printString.toString();
    }

    public Object get(int indexing) {
        if (indexing < 0 || indexing >= this.obj.length) {
            throw new IndexOutOfBoundsException("Index: " + indexing + ", Size: " + this.obj.length);
        }
        return this.obj[indexing];
    }

    public int size() {
        return this.obj.length;
    }

    /*
     * Remove method: Since we are storing the Object so the return type is object
     */

    public Object removeOld(int indexToBeDeleted) {
        if (indexToBeDeleted < 0 || indexToBeDeleted >= index)
            return null;
        // Returning the removedElement
        Object removedElement = this.obj[indexToBeDeleted];
        // * Traversing the AL From indexToBeDeleted to length => & performing the left
        // Shift operation
        for (int i = indexToBeDeleted; i < index - 1; i++) {
            this.obj[i] = this.obj[i + 1];
        }

        // * Removing the index */
        index--;
        return removedElement;
    }

    public Object removeNew(int indexToBeDeleted) {
        if (indexToBeDeleted < 0 || indexToBeDeleted >= index)
            return null;
        // Returning the removedElement
        Object removedElement = this.obj[indexToBeDeleted];
        int CopiedSize = this.obj.length - indexToBeDeleted - 1;
        System.arraycopy(this.obj, indexToBeDeleted + 1, this.obj, indexToBeDeleted, CopiedSize);
        index--;
        return removedElement;
    }

    public static void main(String[] args) {
        Program1 cl = new Program1(3);
        cl.add("Hello");
        cl.add("World");
        cl.add("Java");
        cl.add("Program");
        cl.add("Program1");
        cl.add("Program2");
        // System.out.println("The output is " + cl.toString());
        // System.out.println(cl.get(2));
        // // System.out.println(cl.get(50));
        // System.out.println(cl.size()); // 6
        System.out.println(cl.toString()); // * [ Hello, World, Java, Program, Program1, Program2 ] */
        System.out.println(cl.removeNew(2)); // * Java */
        System.out.println(cl.toString());
    }
}
