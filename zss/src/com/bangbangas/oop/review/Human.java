package com.bangbangas.oop.review;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * ClassName: Human
 * Package: com.bangbangas.oop.review
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/3 9:15
 * @Version 1.0
 */
public class Human {
    int age;
    protected double score;
    public String name;

    private String address;
    static String school;




    {
        System.out.println("非静态代码块");
    }

    static{
        System.out.println("静态代码块");
    }


    public Human() {
        System.out.println("human的无参构造器");
    }

    public Human(int age,double score){
        this.age=age;
        this.score=score;
    }

    public Human(int age, double score, String name){
           this(age,score);
           this.name=name;
    }


    public void eat(){
        System.out.println("吃饭");
         {
            int a;
            // System.out.println(a);  局部变量必须进行赋值
            a = 10;
            System.out.println("普通代码块");
        }
    }

    public void say(){
        System.out.println("唱歌");
    }

    protected void printInfo(){
        // System.out.println(age+" "+score+" "+a); 局部变量只作用于当前作用域{}
        System.out.println(age+" "+score+""+school);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void staticMethod(){
        System.out.println(Human.school);
        System.out.println(school);

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
