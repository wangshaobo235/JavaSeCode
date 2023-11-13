package com.bangbangas.warpper;

/**
 * ClassName: StringTest
 * Package: com.bangbangas.warpper
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/6 14:07
 * @Version 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        // 直接使用，无需导包

        String data ="abc";
        System.out.println(data);
        String s1 = new String("abc");
        String s = new String(new char[]{'a','b','c'});
        String s2 = new String();
        System.out.println(s2);

        data.length(); //
        data.isEmpty(); //
        data.charAt(0); // 类似于数组下标
        System.out.println(data.equals("abc"));
        System.out.println(data.compareTo("abc"));
        System.out.println(data.compareTo("abcdef"));
        System.out.println(data.compareTo("b"));
        System.out.println(data.toString());
        System.out.println(String.valueOf(false));
        System.out.println("abc"==("ab"+"c"));

        String abc = new String("abc");
        System.out.println(abc == s1);

        String a = "abc";
        String b = a+ "de";
        System.out.println(b);

        String data2="ABcdEd";
        StringBuilder stringBuilder1 = new StringBuilder(data2);
        System.out.println(stringBuilder1.reverse().toString().toLowerCase());
        // 创建stringbuilder对象
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();


        System.out.println("-----------------");
        String t1 = "a"+"b"+"c";
        String t2 = "ab"+"c";
        String t3 = "a"+"bc";
        String t4 = "abc";

        System.out.println(t1==t2);
        System.out.println(t2==t3);


    }
}
