package com.bangbangas.construct;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * ClassName: TriAngleTest
 * Package: com.bangbangas.construct
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/6 10:43
 * @Version 1.0
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle(0,0);
        triAngle.setHeight(20);
        triAngle.setBase(40);
        triAngle.printArea();
    }
}
