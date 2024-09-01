import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        Collections.sort(listObj, new EmployeeSorting());
        System.out.println(listObj);

        /*
         * [Employee{name='Ramesh', age=20}, Employee{name='Prasanna', age=25},
         * Employee{name='Divyanshu', age=30}, Employee{name='Suresh', age=35}]
         */
    }
}

/*
 * Collections.sort(listObj); // * The method sor t(List<T>) in the type
 * Collections is not applicable for the arguments (List<Employee>)
 */