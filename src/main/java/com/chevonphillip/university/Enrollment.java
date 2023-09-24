package com.chevonphillip.university;

public record Enrollment(Student student, Course course) {

    @Override
    public String toString() {
        return "Enrollment{" +
                "student=" + student +
                ", course=" + course +
                '}';
    }
}
