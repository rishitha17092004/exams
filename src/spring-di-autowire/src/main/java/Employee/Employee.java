package com.klef.jfsd.exam;

import java.util.List;

public class Employee {
    private int employeeId;
    private String name;
    private double salary;
    private String department;
    private List<String> skills;

    // Constructor for dependency injection
    public Employee(int employeeId, String name, double salary, String department, List<String> skills) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Skills: " + skills);
    }
}
