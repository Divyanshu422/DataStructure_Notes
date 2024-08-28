
// import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

class Program7 {
    public static void main(String[] args) {
        Set<Integer> setObj = new CopyOnWriteArraySet<>();
        // * the set method return the boolean value as shown when we add 40 */
        setObj.add(10);
        setObj.add(20);
        setObj.add(30);
        boolean data = setObj.add(40);
        setObj.add(50);
        System.out.println(data);

        Iterator<Integer> iter = setObj.iterator();
        int i = 0;
        while (iter.hasNext()) {
            System.out.println(iter.next());
            if (i == 3) {
                setObj.add(60);
            }
            i++;
        }
    }
}

// * 50 20 40 10 java.util.ConcurrentModificationException */
