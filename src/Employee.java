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

    public static void printEmployeesNames(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getNick());
        }
    }

    public static void indexSalary(Employee[] employees, double percent) {
        for (Employee employee : employees) {
            double newSalary = employee.getSalary() * (1 + percent / 100);
            employee.setSalary(newSalary);
        }
    }

    public static int chooseDepartment(int department) {
        return department;
    }

    public static Employee findLowestPaidEmployeeInDepartment(Employee[] employees, int department) {
        Employee lowestPaidEmployeeInDepartment = null;
        double lowestSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() < lowestSalary) {
                lowestPaidEmployeeInDepartment = employee;
                lowestSalary = employee.getSalary();
                employee.setDepartment(department);
            }
        }
        return lowestPaidEmployeeInDepartment;
    }

    public static Employee findHighestPaidEmployeeInDepartment(Employee[] employees, int department) {
        Employee highestPaidEmployeeInDepartment = null;
        double highestSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() > highestSalary) {
                highestPaidEmployeeInDepartment = employee;
                highestSalary = employee.getSalary();
                employee.setDepartment(department);
            }
        }
        return highestPaidEmployeeInDepartment;
    }

    public static double getTotalSalaryExpenseByDepartment(Employee[] employees, int department) {
        double totalExpense = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                totalExpense += employee.getSalary();
                employee.setDepartment(department);
            }
        }
        return totalExpense;
    }

    public static double getAverageSalaryByDepartment(Employee[] employees, int department) {
        double totalSalary = 0;
        int employeeCount = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
                employeeCount++;
                employee.setDepartment(department);
            }
        }
        return totalSalary / employeeCount;
    }

    public static void indexSalaryByDepartment(Employee[] employees, int department, double percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary(newSalary);
                employee.setDepartment(department);
            }
        }
    }

    public static void printEmployeesByDepartment(Employee[] employees, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("ID: " + employee.getId() + " | Ф.И.О. сотрудника: " + employee.getNick() + " | Зарплата: " + employee.getSalary());
            }
        }
    }


    public static void printEmployeesWithSalaryLessThen(Employee[] employees, int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println("ID: " + employee.getId() + " | Ф.И.О. сотрудника: " + employee.getNick() + " | Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryMoreThen(Employee[] employees, int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() > salary) {
                System.out.println("ID: " + employee.getId() + " | Ф.И.О. сотрудника: " + employee.getNick() + " | Зарплата: " + employee.getSalary());
            }
        }
    }
}
