        import java.util.ArrayList;
        // import java.util.Iterator;
        import java.util.List;
        import java.util.ListIterator;

        class Program4 {
            public static void main(String[] args) {
                List<String> list = new ArrayList<>();
                list.add("C++");
                list.add("Java");
                list.add("Python");
                list.add("Javascript");

                ListIterator<String> iter = list.listIterator();
                int i = 0;
                while (iter.hasNext()) {
                    i++;
                    System.out.println(iter.next());
                    if (i == 2) {
                        if (iter.hasPrevious()) {
                            String data = iter.previous(); // Move the iterator to the previous element
                            System.out.println("The previous data is " + data);
                        }
                    }
                }

            }
        }
