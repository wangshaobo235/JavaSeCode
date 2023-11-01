package com.bangbangas.oop;

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

        System.out.println(student.getScore());
        System.out.println(student1.getScore());
        System.out.println(student2.getScore());
        test();


    }

    public static void test(){
        System.out.println("");
    }
}
