package com.bangbangas.advanced;

/**
 * ClassName: Person
 * Package: com.bangbangas.advanced
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/7 17:08
 * @Version 1.0
 */
public class Person {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("wsb");
        System.out.println(student.name);
    }
}

class Student{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Student(String name) {
        this();
        this.name = name;
    }

    public Student() {
    }
}
