public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }
    public void addEmployee(String lastName, String firstName, String middleName, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить контакт, закончилось место");
        }
        Employee newEmployee = new Employee(lastName, firstName, middleName, department, salary);
        employees[size++] = newEmployee;
    }
    //public void printEmployeeList() {
        //for (Employee employee : employees) {
            //Employee e
            //System.out.println(employee);
        //}
    //}
}
