package com.bangbangas.superchaptor;

/**
 * ClassName: Person
 * Package: com.bangbangas.superchaptor
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/14 9:49
 * @Version 1.0
 */
public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void hobby(){
        System.out.println("学习");
    }
}
