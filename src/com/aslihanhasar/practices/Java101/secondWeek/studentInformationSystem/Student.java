package com.aslihanhasar.practices.Java101.secondWeek.studentInformationSystem;

public class Student {
    Course courseOne;
    Course courseTwo;
    Course courseThree;
    String name;
    String surname;
    int stNumb;
    double average;
    boolean isPass;

    Student(String name, String surname, int stNumb, Course courseOne, Course courseTwo, Course courseThree) {
        this.name = name;
        this.surname = surname;
        this.stNumb = stNumb;
        this.courseOne = courseOne;
        this.courseTwo = courseTwo;
        this.courseThree = courseThree;
    }

    void addBulkExamNote(int noteOne, int noteTwo, int noteThree) {
        if (noteOne >= 0 && noteOne <= 100) {
            courseOne.examNote = noteOne;
        }
        if (noteTwo >= 0 && noteTwo <= 100) {
            courseTwo.examNote = noteTwo;
        }
        if (noteThree >= 0 && noteThree <= 100) {
            courseThree.examNote = noteThree;
        }
    }

    void addBulkVerbalNote(int noteOne, int noteTwo, int noteThree) {
        if (noteOne >= 0 && noteOne <= 100) {
            courseOne.verbNote = noteOne;
        }
        if (noteTwo >= 0 && noteTwo <= 100) {
            courseTwo.verbNote = noteTwo;
        }
        if (noteThree >= 0 && noteThree <= 100) {
            courseThree.verbNote = noteThree;
        }
    }

    void courseAverages() {
        courseOne.average = (courseOne.examNote * (1 - courseOne.effect)) + (courseOne.verbNote * courseOne.effect);
        courseTwo.average = (courseTwo.examNote * (1 - courseTwo.effect)) + (courseTwo.verbNote * courseTwo.effect);
        courseThree.average = (courseThree.examNote * (1 - courseThree.effect)) + (courseThree.verbNote * courseThree.effect);
        System.out.println(courseOne.name + " Average: " + courseOne.average);
        System.out.println(courseTwo.name + " Average: " + courseTwo.average);
        System.out.println(courseThree.name + " Average: " + courseThree.average);
        System.out.println("-------------------------------------------------");
    }

    void totalAverage() {
        average = (courseOne.average + courseTwo.average + courseThree.average) / 3;
        if (average >= 55) {
            isPass = true;
        }
    }

    void printNote() {
        if (isPass) {
            System.out.println("Your average: " + average + "\nYou have successfully passed the class.");
        } else {
            System.out.println("Your average: " + average + "\nYou have failed the class.");
        }
    }

    void studentInfo() {
        System.out.println("*************************************************");
        System.out.println("            The Student Information");
        System.out.println("*************************************************");
        System.out.println(name + " " + surname + " ( " + stNumb + " )");
        System.out.println("-------------------------------------------------");
    }

}
