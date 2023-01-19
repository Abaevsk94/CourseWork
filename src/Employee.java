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
        System.out.println("Список сотрудников с полной информацией");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void calculateTotalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Общая сумма затрат на зарплаты в месяц - " + totalSalary);
    }

    public static void findLowestSalaryEmployee(Employee[] employees) {
        Employee employeeWithLowestSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithLowestSalary.getSalary()) {
                employeeWithLowestSalary = employee;
            }
        }
        System.out.println("Сотрудник с наименьшей зарплатой в " + employeeWithLowestSalary.getSalary() + " рублей: " + employeeWithLowestSalary.getNick());
    }

    public static void findHighestSalaryEmployee(Employee[] employees) {
        Employee employeeWithHighestSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithHighestSalary.getSalary()) {
                employeeWithHighestSalary = employee;
            }
        }
        System.out.println("Сотрудник с наивысшей зарплатой в " + employeeWithHighestSalary.getSalary() + ": " + employeeWithHighestSalary.getNick());
    }

    public static void calculateAverageSalary(Employee[] employees) {
        double totalSalary = 0;
        double averageSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            averageSalary = totalSalary / employees.length;
        }
        System.out.println("Среднее значение зарплат - " + averageSalary);
    }

    public static void printEmployeesNames(Employee[] employees) {
        System.out.println("Список сотрудников (ФИО)");
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

    public static void findLowestPaidEmployeeInDepartment(Employee[] employees, int department) {
        Employee lowestPaidEmployeeInDepartment = null;
        double lowestSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() < lowestSalary) {
                lowestPaidEmployeeInDepartment = employee;
                lowestSalary = employee.getSalary();
                employee.setDepartment(department);
            }
        }
        assert lowestPaidEmployeeInDepartment != null;
        System.out.println("Сотрудник с наименьшей зарплатой в отделе № " + lowestPaidEmployeeInDepartment.getDepartment() + " : " + lowestPaidEmployeeInDepartment.getNick());
    }

    public static void findHighestPaidEmployeeInDepartment(Employee[] employees, int department) {
        Employee highestPaidEmployeeInDepartment = null;
        double highestSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department && employee.getSalary() > highestSalary) {
                highestPaidEmployeeInDepartment = employee;
                highestSalary = employee.getSalary();
                employee.setDepartment(department);
            }
        }
        assert highestPaidEmployeeInDepartment != null;
        System.out.println("Сотрудник с наибольшей зарплатой в отделе № " + highestPaidEmployeeInDepartment.getDepartment() + " : " + highestPaidEmployeeInDepartment.getNick());
    }

    public static void getTotalSalaryByDepartment(Employee[] employees, int department) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
                employee.setDepartment(department);
            }
        }
        System.out.println("Общая сумма в отделе № " + department + " : " + totalSalary);
    }

    public static void getAverageSalaryByDepartment(Employee[] employees, int department) {
        double totalSalary = 0;
        int employeeCount = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
                employeeCount++;
                employee.setDepartment(department);
            }
        }
        System.out.println("Средняя сумма в отделе № " + department + " : " + (totalSalary/employeeCount));
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
        System.out.println("Список сотрудников отдела № " + chooseDepartment(department));
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("ID: " + employee.getId() + " | Ф.И.О. сотрудника: " + employee.getNick() + " | Зарплата: " + employee.getSalary());
            }
        }
    }

    public static int randomSalary(int salary) {
        return salary;
    }

    public static void printEmployeesWithSalaryLessThen(Employee[] employees, int salary) {
        System.out.println("Сотрудники с зарплатой ниже " + randomSalary(salary) + " рублей");
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println("ID: " + employee.getId() + " | Ф.И.О. сотрудника: " + employee.getNick() + " | Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryMoreThen(Employee[] employees, int salary) {
        System.out.println("Сотрудники с зарплатой выше " + randomSalary(salary) + " рублей");
        for (Employee employee : employees) {
            if (employee.getSalary() > salary) {
                System.out.println("ID: " + employee.getId() + " | Ф.И.О. сотрудника: " + employee.getNick() + " | Зарплата: " + employee.getSalary());
            }
        }
    }
}
