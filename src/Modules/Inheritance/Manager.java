package Modules.Inheritance;

import java.util.Date;

public class Manager extends Employee {
    private double bonus;
    public Manager(String name, int age, double salary, String department, Date JoiningData, double bonus) {
        super(name, age, salary, department, JoiningData);
        this.bonus = bonus;
    }
    public double getSalary(){
        return super.getSalary() + bonus;
    }

    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: " + bonus);
    }
}
