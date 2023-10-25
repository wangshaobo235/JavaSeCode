package com.bangbangas.extend.test1;

import com.bangbangas.extend.test.Order;
/**
 * ClassName: OrderTest
 * Package: com.bangbangas.extend.test1
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/13 14:08
 * @Version 1.0
 */
public class OrderTest extends Order{
    public void printInfo(){
    }
    public void method(){
        orderProtected=1;
        orderPublic=1;
        methodProtected();
        methodPublic();
    }
}
