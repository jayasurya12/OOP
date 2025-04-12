package Modules.Inheritance;

import java.util.Date;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String department;
    private Date JoiningData;

    public Employee(){
        this("Default", 0, 0.0, "Default", new Date());
    }

    public Employee(String name, int age, double salary, String department, Date JoiningData) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.JoiningData = JoiningData;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
        System.out.println("Joining Date: "+JoiningData);
    }
}
