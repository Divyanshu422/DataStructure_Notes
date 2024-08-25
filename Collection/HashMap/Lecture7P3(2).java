
    import java.util.HashMap;
    import java.util.Map;

    class Program4 {
        public static void main(String[] args) {
            Map<Employee, String> mapObj = new HashMap<>();
            Employee emp1 = new Employee(123);
            Employee emp2 = new Employee(123);
            mapObj.put(emp1, "Divyanshu");
            mapObj.put(emp2, "Jeet ");
            System.out.println(mapObj); // {Employee@7b=Jeet }
            System.out.println(mapObj.size()); // * 1
        }
    }
