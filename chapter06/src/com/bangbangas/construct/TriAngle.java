package com.bangbangas.construct;

/**
 * ClassName: TriAngle
 * Package: com.bangbangas.construct
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/6 10:43
 * @Version 1.0
 */
public class TriAngle {
    private double base;
    private double height;

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void printArea(){
        System.out.println(String.format("%.2f",this.base * this.height / 2));
    }
}
