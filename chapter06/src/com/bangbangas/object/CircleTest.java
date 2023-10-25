package com.bangbangas.object;

import java.util.Scanner;

/**
 * ClassName: CircleTest
 * Package: com.bangbangas.object
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/5 9:25
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.roudius=2;
        circle.getArea();
        int area = circle.printMap(10,8);
        System.out.println("矩形面积是"+area);
        User user = new User();
        user.setUsername("ws");
        user.setPassword("123456");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();
        String inpputPassword = scanner.next();
        user.login(inputName,inpputPassword);
    }
}
