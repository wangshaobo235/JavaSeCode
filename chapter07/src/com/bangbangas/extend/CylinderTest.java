package com.bangbangas.extend;

/**
 * ClassName: CylinderTest
 * Package: com.bangbangas.extend
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/12 16:15
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.getLength());
        System.out.println(cylinder.getRadius());
    }
}
class Cylinder extends  Circle{
    private double length;

    public Cylinder() {
        length=1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}