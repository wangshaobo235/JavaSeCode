package com.bangbangas.object;

/**
 * ClassName: AssignNewObject
 * Package: com.bangbangas.object
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/5 11:29
 * @Version 1.0
 */
public class AssignNewObject {
    public void swap(MyData my){
        my = new MyData(); //考虑堆空间此新创建的对象，和main中的data对象是否有关
        int temp = my.x;
        my.x = my.y;
        my.y = temp;

    }

    public static void main(String[] args) {
        AssignNewObject tools = new AssignNewObject();

        MyData data = new MyData();
        data.x = 1;
        data.y = 2;
        System.out.println("交换之前：x = " + data.x +",y = " + data.y);// 1 2
        tools.swap(data);//调用完之后，x与y的值交换？
        System.out.println("交换之后：x = " + data.x +",y = " + data.y);// 1 2
    }
}

class MyData{
    int x ;
    int y;
}