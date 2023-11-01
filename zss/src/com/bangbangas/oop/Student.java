package com.bangbangas.oop;

public class Student {
    int id;
    static int score;
    /*

     */

    public Student(int id) {
        this.id = id;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {

        Student.score = score;
    }
}
