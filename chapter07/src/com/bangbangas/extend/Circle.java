package com.bangbangas.extend;

/**
 * ClassName: Circle
 * Package: com.bangbangas.extend
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/12 16:14
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle(){
        radius=1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }
}
