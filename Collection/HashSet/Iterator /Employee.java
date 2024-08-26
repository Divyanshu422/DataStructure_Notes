
class Employee {
    int EmpId;

    public Employee() {

    }

    public Employee(int empId) {
        EmpId = empId;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    @Override
    public boolean equals(Object obj) {
        // Typecasting
        Employee e = (Employee) obj;
        if (EmpId == e.EmpId)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return EmpId;
    }
}

