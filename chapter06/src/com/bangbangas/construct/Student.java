package com.bangbangas.construct;

/**
 * ClassName: Student
 * Package: com.bangbangas.construct
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/6 10:50
 * @Version 1.0
 */
public class Student {
    String name;
    int age;
    String school;
    String major;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student(String name, int age, String school, String major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }
}
