package com.bangbangas.decision;

/**
 * ClassName: Person
 * Package: com.bangbangas.decision
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/5 15:33
 * @Version 1.0
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0 && age<=130){
            this.age = age;
        }else{
            System.out.println("年龄不合法");
        }

    }
}
