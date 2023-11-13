package com.bangbangas.polymorphic;

/**
 * ClassName: polymorphicTest
 * Package: com.bangbangas.polymorphic
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/8 16:30
 * @Version 1.0
 */
public class polymorphicTest {
    public static void main(String[] args) {
        /* 多态的定义

         */
        Animal animal = new Animal();
        animal.eat();
        Cat cat = new Cat();
        cat.eat();
        Dog dog = new Dog();
        dog.eat();
        Animal cat1 = new Cat(); //向上转型 自动 只能调用共用的方法
        cat1.eat();
        Cat cat2 = (Cat) cat1; // 向下转型  强制 可以调用自己的方法
        cat2.run();
        cat2.eat();


    }
}
