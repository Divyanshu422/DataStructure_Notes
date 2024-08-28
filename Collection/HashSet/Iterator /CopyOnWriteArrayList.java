
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

class Program5 {
    public static void main(String[] args) {
        List<String> listObj = new CopyOnWriteArrayList<>();
        listObj.add("C++");
        listObj.add("Java");
        listObj.add("Python");
        listObj.add("Javascript");

        ListIterator<String> iter = listObj.listIterator();


        int i = 0;
        while (iter.hasNext()) {
            i++;
            System.out.println(iter.next());
            
            if (i == 2) {
                listObj.add("TypeScript");
                iter.previous(); // * C++ Java Java Python Javascript
            }
        }
    }
}


