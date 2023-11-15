package com.bangbangas.collectionnew;

import java.util.*;

/**
 * ClassName: ListDemo
 * Package: com.bangbangas.collectionnew
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/15 14:17
 * @Version 1.0
 */
public class ListDemo {
    public static void main(String[] args) {
        /*
        增 add addall
        删 remove clear removeall
        改 set
        查 indexOf lastIndexOf  有值就返回索引值，没有值就返回-1
           get  contains
         */
        List list = new ArrayList();
        list.add("string0");
        list.add("string1");
        list.add("string2");
        list.add("string3");
        list.add("string4");
        list.add("string5");
        list.add("string6");
        list.add("string7");
        list.add("string8");
        list.add("string9");

        list.add(1,"韩顺平教育");
        System.out.println(list.get(4));
        list.remove(5);
        list.set(6,"修改的元素");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(list.indexOf("韩顺平教育"));
        System.out.println(list.indexOf("韩顺平教育-1"));


        /*
        循环：
        1.迭代器
        2.增强for循环
        3.根据索引下标get
         */
        System.out.println("迭代器循环");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("下标进行循环");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("增强for循环");
        for (Object o : list) {
            System.out.println(o);
        }


    }
}
