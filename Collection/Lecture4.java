
/*
 *  In the previous class we have created a custom ArrayList and applied the add method
 *    ->  Now writing the custom method for printing the arraylist
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CustomArrayList {
    Object[] obj = null;
    int index = 0;

    public CustomArrayList(int size) {
        obj = new Object[size];
    }
    public CustomArrayList() {
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

    public static void main(String[] args) {
        CustomArrayList cl = new CustomArrayList(3);
        cl.add("Hello");
        cl.add("World");
        cl.add("Java");
        cl.add("Program");
        cl.add("Program1");     
        cl.add("Program2");
        System.out.println("Printing the object " + cl); 
}
