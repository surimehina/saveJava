package com.student;

public class Student {
    private String Name;
    private int ID;
    private int Age;
    private String Locate;

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", ID=" + ID +
                ", Age=" + Age +
                ", Locate='" + Locate + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getLocate() {
        return Locate;
    }

    public void setLocate(String locate) {
        Locate = locate;
    }

    public Student(String name, int ID, int age, String locate) {
        Name = name;
        this.ID = ID;
        Age = age;
        Locate = locate;
    }

    public Student() {
    }
}
