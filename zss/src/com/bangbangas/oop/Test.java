package com.bangbangas.oop;

/**
 * ClassName: Test
 * Package: com.bangbangas.oop
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/1 10:59
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Person zhangsan = new Person();
        zhangsan.name="";
        zhangsan.age=10;
        zhangsan.weight=10;
        zhangsan.eat();
        System.out.println(zhangsan.age);
        Person lisi = new Person();
        lisi.name="";
        lisi.eat();
        System.out.println(lisi.name);
    }
}
