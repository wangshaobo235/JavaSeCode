package com.bangbangas.object;

/**
 * ClassName: PersonTest
 * Package: com.bangbangas.object
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/4 14:46
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "王少波";
        p1.addAge(2);
        System.out.println(p1.age);
        p1.study();
        p1.showAge();
    }
}
