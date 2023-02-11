package com.pratice.text8;

import java.util.ArrayList;

public class RunStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("XiaoMin", 18);
        Student stu2 = new Student("XiaoHong", 20);
        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(stu1);
        studentArrayList.add(stu2);

        for (Student index : studentArrayList) {
            System.out.println(index.getStuAge() + " " + index.getStuName());
        }
    }
}
