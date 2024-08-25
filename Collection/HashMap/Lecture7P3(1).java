
class Employee {
    int EmployeeId;

    public Employee() {

    }

    public Employee(int id) {
        EmployeeId = id;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int id) {
        EmployeeId = id;
    }

    @Override
    public int hashCode() {
        return EmployeeId;
    }

    @Override
    public boolean equals(Object obj) {
        // Typecasting
        Employee e = (Employee) obj;
        if (EmployeeId == e.EmployeeId)
            return true;
        else
            return false;
    }
}

