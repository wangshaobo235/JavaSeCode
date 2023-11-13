package com.bangbangas.polymorphic;

/**
 * ClassName: Cat
 * Package: com.bangbangas.polymorphic
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/8 16:28
 * @Version 1.0
 */
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void run(){
        System.out.println("跑");
    }
}
