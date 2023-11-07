package com.bangbangas.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: ListTest
 * Package: com.bangbangas.collection
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/7 14:14
 * @Version 1.0
 */
public class ListTest {
    public static void main(String[] args) {
        /*
        java.uitl
        增加 add
        修改 set
        删除 remove
        查看 get
         */

        List arrayList = new ArrayList();
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        System.out.println(arrayList);
        arrayList.add(0,100);
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList);
        arrayList.remove(0); // 在集合中存入的integer,调用remove，调用的数参数为int的remove方法
        System.out.println(arrayList);
        arrayList.set(0,21);
        System.out.println(arrayList);
        arrayList.size();

        System.out.println("for循环");
        // 循环
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("增强for循环");

        for (Object o : arrayList) {
            System.out.println(o);
        }

        System.out.println("迭代器循环");

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
