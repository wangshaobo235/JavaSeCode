package com.bangbangas.oop;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(10);
        student.setScore(20);
        Student student1 = new Student();
        student1.setId(20);
        student1.setScore(30);
        Student student2 = new Student();
        student2.setId(30);
        student2.setScore(40);

        Student haha = new Student(1, "haha", 100, -10);
        System.out.println(haha.getAge());

        System.out.println(student.getScore());
        System.out.println(student1.getScore());
        System.out.println(student2.getScore());
        new StudentTest().test();


    }

    public void test(){
        System.out.println("");
    }
}
