package com.bangbangas.advanced;

/**
 * ClassName: Boy
 * Package: com.bangbangas.advanced
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/7 17:32
 * @Version 1.0
 */
public class Boy {
    String name;
    int age;

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

    public void married(girl Girl){
        System.out.println(Girl.name+",嫁给"+this.name);
    }

    public void shoot(){
        System.out.println("喜欢射击");
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
