package com.bangbangas.collectionnew;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        /*
        集合主要是两组（单列集合，双列集合）
        collection 接口两个比较重要的接口 list set ,他们的实现子类都是单列集合
        map接口的实现子类是双列集合 存放的K-V
         */
        /*
        增 add
        删 removeall/clear
        改 set
        查 get/size()
         */
        List arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(true);
        arrayList.add("String");
        arrayList.remove(true);
        System.out.println(arrayList.remove(0));

        arrayList.contains("String");
        arrayList.size();
        // arrayList.clear();
        arrayList.get(0);
        arrayList.set(0,"StringTest");


        /*
        遍历
        1.迭代器     只要继承collection接口就有iterator
                    iterator在arraylist里边实现
                    collection.iterator()
                    hasNext(),next()

        2.增强for循环
                      使用增强for 在collection集合中使用
                      增强for,底层仍然是迭代器(打断点可以看到)
                      增强for可以理解成就是简化版的迭代器遍历
         */
        List list = new ArrayList();
        list.add(new Book("三国演义","wangshaobo",10));
        list.add(new Book("水浒传","wanglixin",20));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        for (Object o : list) {
            System.out.println(o);
        }
    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
