
class Program {
    public static void main(String[] args) {
        Employee emp1Obj = new Employee(123);
        Employee emp2Obj = emp1Obj; // * Since we are not using the new keyword so both emp1Obj and emp2Obj points to same memory */
        emp1Obj.setEmpId(456);
        System.out.println(emp1Obj.getEmpId()); // * 456
        System.out.println(emp2Obj.getEmpId()); // * 456
    }
}



