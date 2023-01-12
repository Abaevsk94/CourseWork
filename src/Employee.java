public class Employee {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private int department;
    private int salary;
    private static int counter;
    private final int id;

    public Employee(String lastName, String firstName, String middleName, int department, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + getId() + " | Ф.И.О. сотрудника: " + getLastName() + " " + getFirstName() + " " + getMiddleName() + " | Отдел: " + getDepartment() + " | Зарплата: " + getSalary();
    }

    public static void printEmployeeList(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double calculateTotalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static Employee findLowestSalaryEmployee(Employee[] employees) {
        Employee employeeWithLowestSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithLowestSalary.getSalary()) {
                employeeWithLowestSalary = employee;
            }
        }
        return employeeWithLowestSalary;
    }

    public static Employee findHighestSalaryEmployee(Employee[] employees) {
        Employee employeeWithHighestSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithHighestSalary.getSalary()) {
                employeeWithHighestSalary = employee;
            }
        }
        return employeeWithHighestSalary;
    }
    public static double calculateAverageSalary(Employee[] employees) {
        return calculateTotalSalary(employees) / employees.length;
    }
    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }
}
