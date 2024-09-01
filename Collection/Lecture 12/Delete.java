import java.util.*;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}

class Program3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Divyanshu", 30);
        Employee emp2 = new Employee("Prasanna", 25);
        Employee emp3 = new Employee("Suresh", 35);
        Employee emp4 = new Employee("Ramesh", 20);

        List<Employee> listObj = new ArrayList<>();
        listObj.add(emp1);
        listObj.add(emp2);
        listObj.add(emp3);
        listObj.add(emp4);

        Collections.sort(listObj, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
        System.out.println(listObj);

        /*
         * [Employee{name='Divyanshu', age=30}, Employee{name='Prasanna', age=25},
         * Employee{name='Ramesh', age=20}, Employee{name='Suresh', age=35}]
         */
    }
}