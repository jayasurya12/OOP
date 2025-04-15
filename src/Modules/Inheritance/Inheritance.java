package Modules.Inheritance;

import java.util.ArrayList;
import java.util.Date;

public class Inheritance {
    public static void main(String[] args) {
        Manager mgr = new Manager("Surya", 30, 100000.0, "Software Engineer", new Date(), 10000.0);
        ArrayList<Employee> empList = new ArrayList<>();

        // Adding 20 Employees
        for (int i = 1; i <= 20; i++) {
            String name = NameGenerator.getRandomName(); // Fixed typo here
            empList.add(new Employee(name, 20 + i, 50000.0 + (i * 1000), "Department" + i, new Date()));
        }

        empList.add(mgr); // Fixed the issue with adding Manager

        // Display each employee's details
        for (Employee e : empList) {
            e.displayEmployeeDetails();
            System.out.println("-------------------------");
        }

        // Example: Manager
        Manager mgr = new Manager("Surya", 30, 100000.0, "Software Engineer", new Date(), 10000.0);
        mgr.displayEmployeeDetails();
        System.out.println("Salary of Manager: " + mgr.getSalary());
    }
}
