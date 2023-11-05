package com.bangbangas.warpper;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        // 现在学习java.util.date
        Date date = new Date();
        System.out.println(date); // Sun Nov 05 20:56:26 CST 2023
        System.out.println(date.toString()); // Sun Nov 05 20:56:26 CST 2023
        System.out.println(date.toGMTString()); // 5 Nov 2023 12:56:26 GMT
        System.out.println(date.toLocaleString()); //
        System.out.println(date.getYear()); //2023-11-5 21:03:36
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis()); // 静态，可以类名.方法名   不需要进行new native 本地方法 不是java写

    }
}
