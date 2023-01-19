public class Main {
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
        Employee.printEmployeeList(employees);
        Employee.calculateTotalSalary(employees);
        Employee.findLowestSalaryEmployee(employees);
        Employee.findHighestSalaryEmployee(employees);
        Employee.calculateAverageSalary(employees);
        Employee.printEmployeesNames(employees);
        Employee.indexSalary(employees, 10);
        Employee.printEmployeeList(employees);
        Employee.findLowestPaidEmployeeInDepartment(employees, Employee.chooseDepartment(3));
        Employee.findHighestPaidEmployeeInDepartment(employees, Employee.chooseDepartment(3));
        Employee.getTotalSalaryByDepartment(employees, Employee.chooseDepartment(3));
        Employee.getAverageSalaryByDepartment(employees, Employee.chooseDepartment(3));
        Employee.indexSalaryByDepartment(employees, 3, 10);
        Employee.printEmployeesByDepartment(employees, 3);
        Employee.printEmployeesWithSalaryLessThen(employees, Employee.randomSalary(40000));
        Employee.printEmployeesWithSalaryMoreThen(employees, Employee.randomSalary(40000));
    }
}
