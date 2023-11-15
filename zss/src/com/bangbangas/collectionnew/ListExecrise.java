package com.bangbangas.collectionnew;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ListExecrise
 * Package: com.bangbangas.collectionnew
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/15 14:53
 * @Version 1.0
 */
public class ListExecrise {
    public static void main(String[] args) {
        /*
        按价格排序，从低到高
        使用arraylist,vector,linkedlist
         */
        List arrayList = new ArrayList();
        arrayList.add(new Book("三国演义", "罗贯中", 50));
        arrayList.add(new Book("红楼梦", "曹雪芹", 60));
        arrayList.add(new Book("水浒传", "施耐庵", 30));
        arrayList.add(new Book("西游记", "王少波", 50));
        arrayList.add(new Book("西游记", "王立鑫", 10));
        arrayList.add(new Book("西游记", "郭廷木", 30));
        arrayList.add(new Book("西游记", "李华贤", 20));
        Book temp = null;

    for(int j=0;j<arrayList.size()-1;j++) {
        for (int i = 0; i < arrayList.size() - 1 - j ; i++) {
            if (((Book) arrayList.get(i)).getPrice() > ((Book) arrayList.get(i + 1)).getPrice()) {
                temp = (Book) arrayList.get(i + 1);
                arrayList.set(i + 1, arrayList.get(i));
                arrayList.set(i, temp);
            }
            ;
        }
    }
    System.out.println(arrayList);

        /*
        arraylist 可以加入多个null
        arraylist 是由数组来实现数据存储
        arraylist基本等同于vector,除了arraylist是线程不安全（执行效率高）
        在多线程情况下，不建议使用arraylist
         */
        List List = new ArrayList();
        List.add(null);
        List.add(null);
        List.add(null);

        /*
        无参构造器
        1.new arraylist()
        空的object的数组
        2.add(E)
        生成长度为10的数组
        3.当长度超过10个元素的时候
        数组扩容至10+10/2=15个长度

        如果使用的是指定大小的构造器，则初始elementdata容量为指定大小，如果需要扩容，则直接扩容elementdata的1.5倍
         */


    }
}
