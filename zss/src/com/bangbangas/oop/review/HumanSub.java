package com.bangbangas.oop.review;

/**
 * ClassName: HumanSub
 * Package: com.bangbangas.oop.review
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/3 9:18
 * @Version 1.0
 */
public class HumanSub {
    public static void main(String[] args) {
        Human.school="邢台一中";
        Human human = new Human(10,10,"zhangsan");
        human.setAddress("天安门");
        System.out.println(human.score+human.age+human.name);
        Human human1 = new Human(10,10,"lisi");
        Human human2 = new Human(10,10,"wangwu");

        human.printInfo();
        human1.printInfo();
        human2.printInfo();



    }
}
