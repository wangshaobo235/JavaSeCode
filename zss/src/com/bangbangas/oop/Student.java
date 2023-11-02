package com.bangbangas.oop;

/**
 * ClassName: Student
 * Package: com.bangbangas.oop
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/1 15:21
 * @Version 1.0
 */
public class Student {
    int id;
    String name;
    static int score;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0||age>100){
            System.out.println("输入的年龄不符合,赋予默认值18");
            this.age=18;
        }else {
            this.age = age;
        }
    }

    public Student(int id, String name, int score, int age) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.setAge(age);
    }

    public Student() {
    }
}
