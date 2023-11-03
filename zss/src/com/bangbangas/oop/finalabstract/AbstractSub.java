package com.bangbangas.oop.finalabstract;

/**
 * ClassName: AbstractSub
 * Package: com.bangbangas.oop.finalabstract
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/3 13:50
 * @Version 1.0
 */
public class AbstractSub extends Abstract {
    @Override
    public void say() {
        System.out.println("test"); // 抽象类的子类，必须重写所有的抽象方法
        // 抽象类不能被实例化
    }
}
