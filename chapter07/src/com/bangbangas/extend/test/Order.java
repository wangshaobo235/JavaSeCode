package com.bangbangas.extend.test;

/**
 * ClassName: Order
 * Package: com.bangbangas.extend.test
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/13 14:04
 * @Version 1.0
 */
public class Order {
    private int orderPrivate;
    int order;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate(){

    }

    void method(){

    }

    protected void methodProtected(){

    }

    public void methodPublic(){

    }

    public void show(){
        order=1;
        orderProtected=1;
        orderPrivate=1;
        orderPublic=1;
    }


}
