import java.util.Scanner;

class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {

    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Employee input
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee Base Salary: ");
        double empSalary = sc.nextDouble();
        sc.nextLine(); // consume newline

        // Manager input
        System.out.print("Enter Manager Name: ");
        String mgrName = sc.nextLine();

        System.out.print("Enter Manager Base Salary: ");
        double mgrSalary = sc.nextDouble();

        System.out.print("Enter Manager Bonus: ");
        double bonus = sc.nextDouble();

        // Objects
        Employee emp = new Employee(empName, empSalary);
        Manager mgr = new Manager(mgrName, mgrSalary, bonus);

        // Output
        System.out.println(emp.calculateSalary());
        System.out.println(mgr.calculateSalary());

        sc.close();
    }
}
