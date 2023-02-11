package com.pratice.text3;

public class Student {
    private int studentNumber;
    private String studentName;
    private int studentAge;

    public Student(int studentNumber, String studentName, int studentAge) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public Student() {

    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}
