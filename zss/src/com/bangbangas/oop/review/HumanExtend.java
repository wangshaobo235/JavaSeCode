package com.bangbangas.oop.review;

/**
 * ClassName: HumanExtend
 * Package: com.bangbangas.oop.review
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/3 11:28
 * @Version 1.0
 */
public class HumanExtend extends Human {
/*
    int age;
    protected double score;
    public String name;
    private String address;
    */

    int weight;

    public void test(){
        System.out.println(age+score+name);
    }

    @Override
    public void printInfo() {
        System.out.println("子类重写的方法");
    }

    public HumanExtend(int age, double score, String name, int weight) {
        super(age, score, name); //super(),调用父类的默认构造器，如果显式，就不会有
        this.weight = weight;
    }
}
