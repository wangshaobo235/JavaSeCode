package com.bangbangas.warpper;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateSqlTest {
    public static void main(String[] args) {
        Date date = new Date(122712355656l);
        System.out.println(date);
        // util.date 年月日 时分秒  sql.date 年月日
        // java.sql.date 继承自 java.util.date

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String para1="2023/11/05";
        Date date1 = Date.valueOf(para1);
        java.util.Date date2 = date1;
        System.out.println(date2);
        try {
            System.out.println(df.parse("2019-02-12 23:59:59"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println(df.format(new java.util.Date()));


        Calendar cd = new GregorianCalendar();
        System.out.println(Calendar.getInstance());

    }
}
