
/*
 * Put method in the hashMap and HashMap declaration
 */
    import java.util.HashMap;
    import java.util.Map;

    class Program {
        public static void main(String[] args) {
            // Declaring the hashMap:
            // HashMap<String, Integer> obj = new HashMap<>();


            Map<String, Integer> obj = new HashMap<>();
            obj.put("one", 1);



            obj.put("two", 2);

            // Accessing and printing the value associated with the key "one"
            System.out.println(obj.get("one")); // Outputs: 1
        }
    }