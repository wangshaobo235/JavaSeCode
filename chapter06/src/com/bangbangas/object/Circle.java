package com.bangbangas.object;

/**
 * ClassName: Circle
 * Package: com.bangbangas.object
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/5 9:25
 * @Version 1.0
 */
public class Circle {
    double roudius;
    public void getArea(){
        System.out.println(String.format("%.2f",Math.PI * Math.pow(roudius, 2)));
    }
    public int printMap(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m*n;
    }
}
