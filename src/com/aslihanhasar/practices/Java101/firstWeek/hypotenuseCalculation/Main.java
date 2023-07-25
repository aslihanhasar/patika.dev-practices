package com.aslihanhasar.practices.Java101.firstWeek.hypotenuseCalculation;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double firstLength, secondLength, hypotenuse;
        System.out.print("Üçgenin 1. Dik Kenar Uzunluğu:");
        firstLength = input.nextDouble();
        System.out.print("Üçgenin 2. Dik Kenar Uzunluğu:");
        secondLength = input.nextDouble();

        hypotenuse = sqrt(pow(firstLength, 2) + pow(secondLength, 2));
        System.out.print("Üçgenin Hipotenüs Uzunluğu:" + hypotenuse);
    }
}
