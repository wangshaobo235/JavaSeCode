package com.bangbangas.collectionnew;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: CollectionExecrise
 * Package: com.bangbangas.collectionnew
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/15 10:58
 * @Version 1.0
 */
public class CollectionExecrise {
    public static void main(String[] args) {
        List<Dog> list = new ArrayList();
        list.add(new Dog("wangwang",10));
        list.add(new Dog("xiaoqiang",20));

        // 循环遍历，根据集合下标获取值
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //增强for循环
        for (Dog dog : list) {
            System.out.println(dog);

        }

        //迭代器循环
        Iterator<Dog> iterator = list.iterator();
        while (iterator.hasNext()) {
            Dog next =  iterator.next();
            System.out.println(next);

        }

    }
}

class Dog{
    private String name;
    private int age;

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

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
