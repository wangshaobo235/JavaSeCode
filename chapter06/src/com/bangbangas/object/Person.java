package com.bangbangas.object;

/**
 * ClassName: Person
 * Package: com.bangbangas.object
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/4 14:33
 * @Version 1.0
 */

/*
   成员变量：
   局部变量：
 */
 class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
    }

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String eat(){
        String food ;
        food= "宫保鸡丁";
        return food;
    }
    public void hobby(){
        System.out.println("游泳");
        return;
    }

    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println(age);
    }
    public void addAge(int i) {
           age+=i;
    }
}
