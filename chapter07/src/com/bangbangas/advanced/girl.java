package com.bangbangas.advanced;

/**
 * ClassName: girl
 * Package: com.bangbangas.advanced
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/7 17:32
 * @Version 1.0
 */
public class girl {
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

    public void married(Boy boy){
        System.out.println(boy.name+",嫁给我吧"+this.name);
        boy.married(this);
    }

    public girl(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

