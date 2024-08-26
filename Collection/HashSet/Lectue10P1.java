/*
 * Iterator implementation for the hashSet
 */

            import java.util.ArrayList;
            import java.util.List;
            import java.util.Iterator;

            class Program {
                public static void main(String[] args) {
                    List<String> list = new ArrayList<>();
                    list.add("Hello");
                    list.add("World");

                    Iterator<String> iter = list.iterator();

                    while (iter.hasNext()) {
                        System.out.println(iter.next());        // * Hello World
                    }
                }
            }