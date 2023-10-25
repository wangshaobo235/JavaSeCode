package com.bangbangas.extend;

/**
 * ClassName: Person
 * Package: com.bangbangas.extend
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/12 14:49
 * @Version 1.0
 */
public class Person {
    String name;
    char sex;
     int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    public Person() {
        System.out.println("调用父类无参构造器");
    }

    public void test(){
        System.out.println("父类的测试方法");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
