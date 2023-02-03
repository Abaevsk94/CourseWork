public class Main {

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
        int employeeCount = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            employeeCount++;
        }
        System.out.println("Среднее значение зарплат - " + (totalSalary / employeeCount));
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
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() < lowestSalary) {
                lowestPaidEmployeeInDepartment = employee;
                lowestSalary = employee.getSalary();
            }
        }
        System.out.println("Сотрудник с наименьшей зарплатой в отделе № " + lowestPaidEmployeeInDepartment.getDepartment() + " : " + lowestPaidEmployeeInDepartment.getNick());
    }

    public static void findHighestPaidEmployeeInDepartment(Employee[] employees, int department) {
        Employee highestPaidEmployeeInDepartment = null;
        double highestSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() > highestSalary) {
                highestPaidEmployeeInDepartment = employee;
                highestSalary = employee.getSalary();
            }
        }
        System.out.println("Сотрудник с наибольшей зарплатой в отделе № " + highestPaidEmployeeInDepartment.getDepartment() + " : " + highestPaidEmployeeInDepartment.getNick());
    }

    public static void getTotalSalaryByDepartment(Employee[] employees, int department) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
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
            }
        }
        System.out.println("Средняя сумма в отделе № " + department + " : " + (totalSalary / employeeCount));
    }

    public static void indexSalaryByDepartment(Employee[] employees, int department, double percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary(newSalary);
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

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Пугачева", "Алла", "Борисовна", 1, 30000);
        employees[1] = new Employee("Михалков", "Никита", "Сергеевич", 2, 32000);
        employees[2] = new Employee("Бондарчук", "Федор", "Сергеевич", 3, 31500);
        employees[3] = new Employee("Певцов", "Дмитрий", "Анатольевич", 4, 35900);
        employees[4] = new Employee("Цой", "Виктор", "Робертович", 5, 36600);
        employees[5] = new Employee("Высоцкий", "Владимир", "Семенович", 2, 34750);
        employees[6] = new Employee("Сукачев", "Игорь", "Иванович", 1, 37300);
        employees[7] = new Employee("Кипелов", "Валерий", "Александрович", 4, 33300);
        employees[8] = new Employee("Шнуров", "Сергей", "Владимирович", 5, 31970);
        employees[9] = new Employee("Горшенев", "Михаил", "Юрьевич", 3, 42470);
        printEmployeeList(employees);
        calculateTotalSalary(employees);
        findLowestSalaryEmployee(employees);
        findHighestSalaryEmployee(employees);
        calculateAverageSalary(employees);
        printEmployeesNames(employees);
        indexSalary(employees, 10);
        printEmployeeList(employees);
        findLowestPaidEmployeeInDepartment(employees, chooseDepartment(3));
        findHighestPaidEmployeeInDepartment(employees, chooseDepartment(3));
        getTotalSalaryByDepartment(employees, chooseDepartment(3));
        getAverageSalaryByDepartment(employees, chooseDepartment(3));
        indexSalaryByDepartment(employees, 3, 10);
        printEmployeesByDepartment(employees, 3);
        printEmployeesWithSalaryLessThen(employees, randomSalary(40000));
        printEmployeesWithSalaryMoreThen(employees, randomSalary(40000));
    }
}
