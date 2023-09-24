package com.chevonphillip.university.main;

import com.chevonphillip.university.Course;
import com.chevonphillip.university.Enrollment;
import com.chevonphillip.university.Student;

public class Main {
    public static void main(String[] args) {
        Student sammy = new Student(1, "Sammy");
        System.out.println(sammy);
        Course math = new Course(1, "Math");
        System.out.println(math);
        Enrollment enrollment = new Enrollment(sammy, math);
        System.out.println(enrollment);

    }
}
