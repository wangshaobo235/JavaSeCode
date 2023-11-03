package com.bangbangas.oop.project;

import java.util.Scanner;

/**
 * 编写程序实现匹配制作
 * 需求说明编写文档
 * 接收用户输入的信息，选择需要制作的披萨。
 * 可供选择制作的披萨有：培根披萨和水果披萨
 * 实现思路及关键代码
 * 1，分析水果披萨和培根披萨
 * 2.定义披萨类
 * a.属性：名称，价格，大小
 * b.方法：展示
 * 3.定义培根和水果披萨继承皮萨类
 * 4.定义披萨工厂类，根据输入信息产生具体的披萨对象
 * ClassName: Main
 * Package: com.bangbangas.oop.project
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/3 15:29
 * @Version 1.0
 */

public class Main {
    public static void main(String[] args) {
        String name ="abc";
        name="abcdef";
        System.out.println(name);
        /*
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("1.水果蛋糕 2.培根蛋糕 3.退出选择");
            int choose = scanner.nextInt();
            switch (choose) {
                case 3:
                      flag=false;
                      break;
                default:
                Pizza pz = factory.choose(choose);
                pz.printInfo();
            }
        }

         */
    }
}
