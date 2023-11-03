package com.bangbangas.oop.project;

import java.util.Scanner;

/**
 * ClassName: factory
 * Package: com.bangbangas.oop.project
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/3 15:41
 * @Version 1.0
 */
public class factory {

    public static Pizza choose(int choice){
        Scanner scanner = new Scanner(System.in);
        Pizza pz = null;
        switch (choice){
            case 1: {
                System.out.println("请录入尺寸");
                int size = scanner.nextInt();
                System.out.println("请录入价格");
                double price = scanner.nextDouble();
                pz = new fruit("水果蛋糕", size, price);
            }
                break;
            case 2: {
                System.out.println("请录入尺寸");
                int size = scanner.nextInt();
                System.out.println("请录入价格");
                double price = scanner.nextDouble();
                pz = new Baconic("培根蛋糕", size, price);
            }
                  break;
            }
        return pz;
    }
}
