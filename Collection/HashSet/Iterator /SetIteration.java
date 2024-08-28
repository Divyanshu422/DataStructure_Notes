import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Program6 {
    public static void main(String[] args) {
        Set<Integer> setObj = new HashSet<>();
        // * the set method return the boolean value */
        setObj.add(10);
        setObj.add(20);
        setObj.add(30);
        setObj.add(40);
        setObj.add(50);

        System.out.println();
        Iterator<Integer> iter = setObj.iterator();
        int i = 0;
        while (iter.hasNext()) {
            System.out.println(iter.next());
            if (i == 3) {
                setObj.add(30);
            }
            i++;
        }

    }
}

// * 50 20 40 10 java.util.ConcurrentModificationException */