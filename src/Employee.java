public class Employee {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private int department;
    private double salary;
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

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getNick() {
        return getLastName() + " " + getFirstName() + " " + getMiddleName();
    }

    public String toString() {
        return "ID: " + getId() + " | Ф.И.О. сотрудника: " + getNick() + " | Отдел: " + getDepartment() + " | Зарплата: " + getSalary();
    }

}
