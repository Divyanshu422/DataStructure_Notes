import java.util.HashSet;
import java.util.Set;

class Program2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101);
        Employee e2 = new Employee(102);
        Employee e3 = new Employee(101);

        Employee[] empArray = new Employee[3];
        empArray[0] = e1;
        empArray[1] = e2;
        empArray[2] = e3;

        Set<Employee> empSet = new HashSet<>();

        for (int i = 0; i < empArray.length; i++) {
            if (empSet.add(empArray[i])) {

            } else {
                System.out.println("Duplicate object found: " + empArray[i].getEmpId());
            }
        }

        System.out.println(empSet.size());  //* 2 */

    }
}


 