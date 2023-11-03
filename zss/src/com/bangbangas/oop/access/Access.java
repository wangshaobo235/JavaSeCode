package com.bangbangas.oop.access;

/**
 * ClassName: Access
 * Package: com.bangbangas.oop.access
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/2 15:45
 * @Version 1.0
 */
public class Access {
    private int id;
    int age;
    protected double score;
    public double height;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void printInfo(){
        System.out.println(age+id+score+height);
    }

    public static void printInfo(String name){
        System.out.println(" ");
    }

    public Access() {
           printInfo();
    }
}
