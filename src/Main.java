public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Пугачева", "Алла", "Борисовна", 1, 30000);
        employees[1] = new Employee("Михалков", "Никита", "Сергеевич", 2, 32000);
        employees[2] = new Employee("Бондарчук", "Федор", "Сергеевич", 3, 31500);
        employees[3] = new Employee("Певцов", "Дмитрий", "Анатольевич", 4, 41900);
        employees[4] = new Employee("Агапов", "Иван", "Валерьевич", 5, 36600);
        employees[5] = new Employee("Высоцкий", "Владимир", "Семенович", 2, 34750);
        employees[6] = new Employee("Сукачев", "Игорь", "Иванович", 1, 37300);
        employees[7] = new Employee("Кипелов", "Валерий", "Александрович", 4, 33300);
        employees[8] = new Employee("Шнуров", "Сергей", "Владимирович", 5, 31970);
        employees[9] = new Employee("Горшенев", "Михаил", "Юрьевич", 3,42470);
        Employee.printEmployeeList(employees);
        System.out.println("Общая сумма затрат на зарплаты в месяц - " + Employee.calculateTotalSalary(employees));
        Employee employeeWithLowestSalary = Employee.findLowestSalaryEmployee(employees);
        System.out.println("Сотрудник с наименьшей зарплатой в " + employeeWithLowestSalary.getSalary() + ": " + employeeWithLowestSalary.getLastName() + " " + employeeWithLowestSalary.getFirstName() + " " + employeeWithLowestSalary.getMiddleName());
        Employee employeeWithHighestSalary = Employee.findHighestSalaryEmployee(employees);
        System.out.println("Сотрудник с наивысшей зарплатой в " + employeeWithHighestSalary.getSalary() + ": " + employeeWithHighestSalary.getLastName() + " " + employeeWithHighestSalary.getFirstName() + " " + employeeWithHighestSalary.getMiddleName());
        System.out.println("Среднее значение зарплат - " + Employee.calculateAverageSalary(employees));
        Employee.printEmployees(employees);
    }
}
