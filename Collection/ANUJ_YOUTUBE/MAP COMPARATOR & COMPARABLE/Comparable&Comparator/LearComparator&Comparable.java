import java.util.*;

class Program {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Lion", 230, 5);
        Animal animal2 = new Animal("Tiger", 220, 15);
        Animal animal3 = new Animal("Elephant", 5000, 25);
        Animal animal4 = new Animal("Mouse", 14, 3);

        // * Adding the method into the List
        List<Animal> listObj = new ArrayList<>();
        listObj.add(animal1);
        listObj.add(animal2);
        listObj.add(animal3);
        listObj.add(animal4);

        

        System.out.println(listObj);

    }
}