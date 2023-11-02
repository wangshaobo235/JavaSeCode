package com.bangbangas.oop;

/**
 * ClassName: Animal
 * Package: com.bangbangas.oop
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/2 10:31
 * @Version 1.0
 */
public class Animal {
    /*
    代码块
    普通块：方法中,限制局部变量的作用范围
    构造块：方法外
    构造块先于构造器执行


    执行顺序
    （1）代码块执行顺序：
    最先执行静态块，只在类加载的时候执行一次，所以一般以后实战写项目：创建工厂，数据库的初始化信息都放入静态块。
    一般用于执行一些全局性的初始化操作。
    再执行构造块
    再执行构造器，
    再执行方法中的普通块。
     */

    String color;
    private int age;
    static String address;

    //构造块
    {
        System.out.println("test1");
    }

    static {
        System.out.println("静态代码块test1");
        //在静态块中只能方法：静态属性，静态方法
        run();
    }

    public Animal(String color) {
        this.color = color;
    }

    public Animal() {
        System.out.println("这是空构造器");
    }

    public void eat(){
        // 普通块
        {
            int num=10;
            System.out.println("test");
        }
        // System.out.println(num);

    }

    public static void run(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
