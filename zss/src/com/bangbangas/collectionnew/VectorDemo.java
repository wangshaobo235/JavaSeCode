package com.bangbangas.collectionnew;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
/*
1.vector是线程同步的，即线程安全。vector类的操作方法带有synchronized
2.在开发中，需要线程同步安全时，考虑使用vector
3.vector底层也是一个对象数组，protected object[] elementdata

如果是无参，默认10，满后按照两倍扩容
如果指定大小，则每次直接按2倍扩容

 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();

        /*
        linkedlist:
        1.底层实现了双向链表和双端队列
        2.可以添加任意元素，多个null
        3.线程不安全

        linkedlist 底层维护了一个双向链表
        linkedlist 中维护了两个属性first和last分别指向首节点和尾节点
        每个节点（node对象），里边有维护了prev,next,item三个属性，其中通过prev和next
        元素的添加和删除效率高，不是通过数组完成
         */

        LinkedList linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        for (Object o : linkedList) {
            System.out.println(o);
        }

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

    }
}


class Node{

}
