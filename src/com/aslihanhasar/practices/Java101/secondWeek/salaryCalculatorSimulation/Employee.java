package com.aslihanhasar.practices.Java101.secondWeek.salaryCalculatorSimulation;

public class Employee {
    String name;
    int workHours;
    int hireYear;
    double oldSalary;

    Employee(String name, int workHours, int hireYear, double oldSalary) {
        this.name = name;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.oldSalary = oldSalary;
    }

    void printInfoEmp() {
        System.out.println("************************************");
        System.out.println("          " + name);
        System.out.println("************************************");
        System.out.println("Current Salary: " + oldSalary + " $");
        System.out.println("Working hours for a week:  " + workHours);
        System.out.println("The employement start date: " + hireYear);
        System.out.println("************************************");
    }
}
