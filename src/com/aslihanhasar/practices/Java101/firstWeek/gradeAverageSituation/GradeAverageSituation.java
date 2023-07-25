package com.aslihanhasar.practices.Java101.firstWeek.gradeAverageSituation;

import java.util.Scanner;

public class GradeAverageSituation {
    static int totalGrade, courseCount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int math, physics, turkish, chemistry, music;
        double average;

        System.out.print("Enter your mark of the Mathematics: ");
        math = scanner.nextInt();
        System.out.print("Enter your mark of the Physics: ");
        physics = scanner.nextInt();
        System.out.print("Enter your mark of the Turkish: ");
        turkish = scanner.nextInt();
        System.out.print("Enter your mark of the Chemistry: ");
        chemistry = scanner.nextInt();
        System.out.print("Enter your mark of the Music: ");
        music = scanner.nextInt();

        checkCourseGrade(math);
        checkCourseGrade(physics);
        checkCourseGrade(turkish);
        checkCourseGrade(chemistry);
        checkCourseGrade(music);
        average = (double) totalGrade / courseCount;
        System.out.println("The average of the marks: " + average);

        if (average >= 55) {
            System.out.print("Congratulations! You passed the class.");
        } else {
            System.out.print("Sorry, you failed the class.");
        }

    }

    public static void checkCourseGrade(int courseGrade) {
        if (courseGrade >= 0 && courseGrade <= 100) {
            totalGrade += courseGrade;
            courseCount++;
        }
    }

}
