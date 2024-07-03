
/*
 * Adding the element to the list beyound the size initialized. in Arraylist
 * we can add the element but in the array we cant do the same
 */
import java.util.ArrayList;

class Program1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>(2);
        list.add(1);
        list.add(2);
        list.add(3); // * Adding the 3rd element but hard coded for 2
        System.out.println("ArrayList contain following " + list); // ! No error
    }
}