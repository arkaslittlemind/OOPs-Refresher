package com.arka.introduction;

public class Main {
    public static void main(String[] args) {
        // store 5 roll numbers
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rollNo = new int[5];
        String[] studentName = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
    }

    class Student {
        int[] rollNo = new int[5];
        String[] studentName = new String[5];
        float[] marks = new float[5];
    }
}