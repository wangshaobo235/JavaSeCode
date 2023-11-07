package com.bangbangas.warpper;


import java.awt.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        System.out.println(date);
        System.out.println(new Date(1234332123243232L));
        System.out.println(date.getTime());
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // string 转化为 date
        System.out.println(simpleDateFormat.parse("2023-12-23 23:59:59").getTime());
        // date 转化为 string
        System.out.println(simpleDateFormat.format(new Date()));

        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance.get(Calendar.DAY_OF_YEAR));
        System.out.println(instance.get(Calendar.DAY_OF_WEEK));
        System.out.println(instance.get(Calendar.MONTH));

        instance.setTime(new Date());
        instance.add(Calendar.DAY_OF_MONTH,-2);

        System.out.println(simpleDateFormat.format(instance.getTime()));

        String data = "test";

    }
}
