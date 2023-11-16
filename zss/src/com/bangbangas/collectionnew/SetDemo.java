package com.bangbangas.collectionnew;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * ClassName: SetDemo
 * Package: com.bangbangas.collectionnew
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/16 8:45
 * @Version 1.0
 */
public class SetDemo {
    public static void main(String[] args) {
        /*
        没有顺序，没有索引,无序（添加的顺序和取出的顺序不一致，但是取出的顺序是固定的）
        不允许有重复数据,(null值也一样，只会存储一个null)
        hashset => hashmap  treeset  数组+链表

        遍历方法(没有跟索引相关的方法)
        1.增强for循环
        2.迭代器
        3.set接口不能用get（index）方法遍历
        增 add addall
        删 remove,removeall
        改
        查
         */
        Set hashSet = new HashSet();
        String a= "str";
        hashSet.add("jack"); // true
        hashSet.add(null); //false
        hashSet.add(null); //flase
        hashSet.add(new Book("三国演义","罗贯中",12)); // true
        hashSet.add(new Book("红楼梦","曹雪芹",20)); // true
        hashSet.add("str"); // true
        hashSet.add(a); // false
        hashSet.add(new String("str")); //false
        hashSet.add(new String("str")); //false

        for (Object o : hashSet) {
            System.out.println(o);
        }

    /*
    hashset 底层是一个hashmap
    不保证存入的数据和取出的数据顺序一致
    *** add：boolean 返回值 接收 add返回值 判断TRUE false

    如何区分底层重复机制 hashset
    hashset 底层机制  哈希表：数组+链表
    如果放入hashset,一定重写hashcode和equals方法
    */
        // Integer
        HashSet<Integer> hashSet1 = new HashSet();
        hashSet1.add(19);
        hashSet1.add(20);
        hashSet1.add(100);
        System.out.println(hashSet1.add(19));
        System.out.println(hashSet1.add(20));

        for (Integer integer : hashSet1) {
            System.out.println(integer);
        }

        //String
        HashSet<String> hashSet2 = new HashSet();
        hashSet2.add("hello");
        hashSet2.add("apple");
        hashSet2.add("hello1");
        System.out.println(hashSet2.add("apple"));
        hashSet2.add("test");

        for (String integer : hashSet2) {
            System.out.println(integer);
        }

        //自定义类型对象
        HashSet<Book> hashSet3 = new HashSet();
        hashSet3.add(new Book("test","test",10));
        hashSet3.add(new Book("1","1",1));
        hashSet3.add(new Book("1","1",1));

        for (Book integer : hashSet3) {
            System.out.println(integer);
        }

        /*
        linkedhashset
        就是hashset的基础上多了一个总链表，将放入的元素串在一起，方便遍历

         */
        LinkedHashSet<Integer> objects = new LinkedHashSet<>();
        objects.add(1);
        objects.add(2);
        objects.add(3);
        objects.add(4);
        for (Integer object : objects) {
            System.out.println(object);
        }

        /*
        Comparable 比较器

         */

        System.out.println("a".compareTo("b"));
        ((Double)(12.3)).compareTo(((Double)(12.3)));



        /*
        treeset
        唯一，无序， 输出的时候按照升序进行输出 升序的方式就是按照比较器
         */

        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        for (Integer integer : treeSet) {
            System.out.println(integer);
        }

    }
}
