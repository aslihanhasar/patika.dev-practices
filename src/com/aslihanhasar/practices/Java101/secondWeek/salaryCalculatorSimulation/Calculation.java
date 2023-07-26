package com.aslihanhasar.practices.Java101.secondWeek.salaryCalculatorSimulation;

public class Calculation {
    Employee employee;
    double rateTax = 0.03;
    int bonus = 30;
    int thisYear = 2022;

    public Calculation(Employee employee) {
        this.employee = employee;
    }

    double totalBonusTax() {
        return ((employee.oldSalary + bonus()) - tax());
    }

    double totalCurrentSalary() {
        return totalBonusTax() + raiseSalary();
    }

    double tax() {
        if (employee.oldSalary > 6000) {
            return employee.oldSalary * rateTax;
        }
        return 0;
    }

    int bonus() {
        if (employee.workHours > 40) {
            return (employee.workHours - 40) * bonus;
        }
        return 0;
    }

    double raiseSalary() {
        int difYear;
        double incRate, result;
        difYear = (thisYear - employee.hireYear);
        if (difYear < 10) {
            incRate = 0.05;
            result = employee.oldSalary * incRate;
            return result;
        } else if (difYear < 20) {
            incRate = 0.1;
            result = employee.oldSalary * incRate;
            return result;
        }else{
            incRate = 0.15;
            result = employee.oldSalary * incRate;
            return result;
        }
    }

    void printInfo() {
        employee.printInfoEmp();
        System.out.println("Tax: " + tax() + " $");
        System.out.println("Your bonus earnings: " + bonus() + " $");
        System.out.println("The increase in your salary: " + raiseSalary() + " $");
        System.out.println("Your current salary with bonus and taxes: " + totalBonusTax() + " $");
        System.out.println("Your current monthly salary: " + totalCurrentSalary() + " $");
    }
}
