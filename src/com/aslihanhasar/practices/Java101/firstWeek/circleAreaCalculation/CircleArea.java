package com.aslihanhasar.practices.Java101.firstWeek.circleAreaCalculation;

import java.util.Scanner;

import static java.lang.Math.*;

public class CircleArea {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        double radius,centralAngle,area;

        System.out.print("Enter the radius of circle:");
        radius=input.nextDouble();
        System.out.print("Enter the central angle of circle:");
        centralAngle=input.nextDouble();
        area=(PI*pow(radius,2)*centralAngle)/360;
        System.out.print("The area of a sector of circle: "+area);
    }
}
