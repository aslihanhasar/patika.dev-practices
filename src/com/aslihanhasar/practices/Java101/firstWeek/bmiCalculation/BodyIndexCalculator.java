package com.aslihanhasar.practices.Java101.firstWeek.bmiCalculation;

import java.util.Scanner;

public class BodyIndexCalculator {
    public static void main(String[] args) {
        double weight, height, bmiIndex;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight(kg): ");
        weight = scanner.nextDouble();

        System.out.print("Enter your height(m): ");
        height = scanner.nextDouble();

        bmiIndex = weight / (height * height);
        System.out.print("Your Body-Mass Index:" + bmiIndex);
    }
}
