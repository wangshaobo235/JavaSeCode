package com.bangbangas.oop;

/**
 * ClassName: ExtendObject
 * Package: com.bangbangas.oop
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/2 14:05
 * @Version 1.0
 */
public class ExtendObject {
       private int age;
       private int name;
       private double height;

       static {
           System.out.println("extendobject静态代码块");
       }

    /*
       public ExtendObject() {
        System.out.println("extendobject的默认构造器");
    }
    */

    public ExtendObject(int age, int name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }


    public ExtendObject() {
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void eat(){

    }
    public void sleep(){

    }
}
