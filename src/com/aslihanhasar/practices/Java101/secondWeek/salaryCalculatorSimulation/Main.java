package com.aslihanhasar.practices.Java101.secondWeek.salaryCalculatorSimulation;

public class Main {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Kevin Stuart", 50, 2021, 9000);
        Employee employeeTwo = new Employee("Klara Jobs", 35, 1997, 35000);

        Calculation calculation1 = new Calculation(employeeOne);
        Calculation calculation2 = new Calculation(employeeTwo);
        calculation1.printInfo();
        calculation2.printInfo();
    }
}
