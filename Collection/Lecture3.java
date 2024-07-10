/*
 * Creating the Internal Implementation of arrayList
     * 1. Internally arrayList store the data in the array of object  -> Declaring the array of object in [[ Line 18 ]]
     * 2. Assigning the array of object to object (using constructor)
     * 3. adding the element to the arrayList and if arrayList is full -> creating the new array of object of greater size and copy the data to the 
     *    new array and assigning the old object array to the new object array. [[ Line 44 ]]
 * 
 */
import java.util.ArrayList;
import java.util.List;

class CustomArrayList {
    /*
     * 1. The internal implementation of arraylist is Object array. so declaring
     * object variable
     * 2. Initializing the object array in the constructor
     */
    Object[] obj = null;
    int index = 0;

    public CustomArrayList(int size) {
        obj = new Object[size];
    }

    public CustomArrayList() {
        obj = new Object[10];
    }

    // Creating the instance method of add in the arrayList. the parameter is object
    // becoz
    // with the help of object we can add string, int, object etc.
    public void add(Object obj) {
        // Checking if object array is fulled or not
        if (index >= this.obj.length) {
            // calculating the newSize
            int newSize = (this.obj.length + (this.obj.length / 2));
            // creating new object array with the new size
            Object[] newObject = new Object[newSize];
            // copying the old object array to new object array
            for (int i = 0; i < this.obj.length; i++) {
                newObject[i] = this.obj[i];
            }
            // assigning the new object array to the old object array
            this.obj = newObject;
        }
        this.obj[index] = obj;
        System.out.println(index);
        System.out.println(this.obj);
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
        System.out.println("code run successfully");
    }
}
