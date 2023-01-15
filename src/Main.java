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
        System.out.println("Общая сумма затрат на зарплаты в месяц - " + Employee.calculateTotalSalary(employees));
        Employee employeeWithLowestSalary = Employee.findLowestSalaryEmployee(employees);
        System.out.println("Сотрудник с наименьшей зарплатой в " + employeeWithLowestSalary.getSalary() + " рублей: " + employeeWithLowestSalary.getNick());
        Employee employeeWithHighestSalary = Employee.findHighestSalaryEmployee(employees);
        System.out.println("Сотрудник с наивысшей зарплатой в " + employeeWithHighestSalary.getSalary() + ": " + employeeWithHighestSalary.getNick());
        System.out.println("Среднее значение зарплат - " + Employee.calculateAverageSalary(employees));
        Employee.printEmployeesNames(employees);
        Employee.indexSalary(employees, 10);
        Employee.printEmployeeList(employees);
        Employee.chooseDepartment(3);
        Employee lowestPaidEmployeeInDepartment = Employee.findLowestPaidEmployeeInDepartment(employees, 3);
        System.out.println("Сотрудник с наименьшей зарплатой в отделе № " + lowestPaidEmployeeInDepartment.getDepartment() + " : " + lowestPaidEmployeeInDepartment.getNick());
        Employee highestPaidEmployeeInDepartment = Employee.findHighestPaidEmployeeInDepartment(employees, 3);
        System.out.println("Сотрудник с наибольшей зарплатой в отделе № " + highestPaidEmployeeInDepartment.getDepartment() + " : " + highestPaidEmployeeInDepartment.getNick());
        System.out.println("Общая сумма в отделе № " + Employee.chooseDepartment(3) + " : " + Employee.getTotalSalaryExpenseByDepartment(employees, 3));
        System.out.println("Средняя сумма в отделе № " + Employee.chooseDepartment(3) + " : " + Employee.getAverageSalaryByDepartment(employees,3));
        Employee.indexSalaryByDepartment(employees, 3, 10);
        Employee.printEmployeesByDepartment(employees, 3);
        Employee.printEmployeesWithSalaryLessThen(employees, 40000);
        Employee.printEmployeesWithSalaryMoreThen(employees, 40000);
    }
}
