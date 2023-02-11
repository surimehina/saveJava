package com.pratice.text3;

import java.util.*;

public class RunApplication {
    public static void main(String[] args) {
        Student st1 = new Student(1, "李华", 18);
        Student st2 = new Student(2, "小明", 20);
        Student st3 = new Student(3, "李明", 19);
        Student st4 = new Student(4, "丽丽", 20);
        Student[] arrStudent = new Student[4];

        arrStudent[0] = st1;
        arrStudent[1] = st2;
        arrStudent[2] = st3;
        arrStudent[3] = st4;
        // 删除输入的学号所对应的学
        int resultId = findStudent(arrStudent, st4.getStudentNumber());
        if (resultId >= 0){

            System.out.println("Delete successful!");
        } else {
            System.out.println("Delete fail!");
        }
        // 判断输入新学号的唯一性
        boolean result = isNumber(arrStudent, st4.getStudentNumber());
        if (result) {
            System.out.println("该学生为新学生");
        }else {
            st4 = null;
            System.out.println("不是新学生，已删除");
        }


        // 遍历所有学生的信息
        for (int i = 0; i < arrStudent.length; i++) {
            Student index = arrStudent[i];
            System.out.println(index);
        }
    }

    public static boolean isNumber(Student[] arr, int stuId) {
        for (int i = 0; i < arr.length; i++) {
           Student stu = arr[i];
           int sid = stu.getStudentNumber();
           if (stu != null) {
               if (sid == stuId) {
                   return true;
               }
           }
        }
        return false;
    }
    public static int findStudent(Student[] arr, int inputId) {
        for (int i = 0; i < arr.length; i++) {
           Student temp = arr[i];
           if (temp != null) {
             if (temp.getStudentNumber() == inputId) {
                 return i;
             }
           }
        }
        return -1;
    }
}