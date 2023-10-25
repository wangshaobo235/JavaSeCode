package com.bangbangas.extend.overide;

/**
 * ClassName: Animal
 * Package: com.bangbangas.extend.overide
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/13 15:53
 * @Version 1.0
 */
public class Animal {
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

    public void eat(){
        System.out.println("吃饭");

    }
}
