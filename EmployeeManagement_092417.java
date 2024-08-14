class Employee {
    String name;
    int ID;
    double salary;

    public Employee(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    double calculateTotalSalary() {
        return salary;
    }
}

class Manager extends Employee {
    double bonus;

    public Manager(String name, int ID, double salary, double bonus) {
        super(name, ID, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateTotalSalary() {
        return super.calculateTotalSalary() + bonus;
    }
}

class Developer extends Employee {
    int projectsHandled;

    public Developer(String name, int ID, double salary, int projectsHandled) {
        super(name, ID, salary);
        this.projectsHandled = projectsHandled;
    }

    @Override
    double calculateTotalSalary() {
        return super.calculateTotalSalary() + (projectsHandled * 1000);
    }
}

class Tester extends Employee {
    int bugsFound;

    public Tester(String name, int ID, double salary, int bugsFound) {
        super(name, ID, salary);
        this.bugsFound = bugsFound;
    }

    @Override
    double calculateTotalSalary() {
        return super.calculateTotalSalary() + (bugsFound * 500);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Manager("John", 1, 100000, 20000);
        employees[1] = new Developer("Alice", 2, 80000, 5);
        employees[2] = new Tester("Bob", 3, 60000, 10);
        employees[3] = new Employee("Charlie", 4, 70000);

        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculateTotalSalary();
        }

        System.out.println("Total salary: " + totalSalary);
    }
}
