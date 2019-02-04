package com.company;

/**
 * Created by cv1900 on 2/4/2019.
 */
public class Student {
    int studentID;
    String name;
    double contentGrade;
    double workHabitGrade;
    double participation;
    int age;

    public Student(String name, int studentID, int age){
        this.name = name;
        this.studentID = studentID;
        this.age = age;
        contentGrade = 0;
        participation = 0;
        age = 18;
    }

    public Student(){
        name = "TestStudent";
        studentID = -1;
        contentGrade = 0;
        participation = 0;
        age = 18;
    }

    public void setContentGrade(int grade){
        contentGrade = grade;
    }

    public void setWorkHabitGrade(int grade) {
        workHabitGrade = grade;
    }

    public void setParticipation(int grade) {
        participation = grade;
    }

    public double getGrade(){
        return (.35 * workHabitGrade + .4 * contentGrade + .25 * participation);
    }

    public void printGrade(){
        System.out.println(.35 * workHabitGrade + .4 * contentGrade + .25 * participation);
    }
}