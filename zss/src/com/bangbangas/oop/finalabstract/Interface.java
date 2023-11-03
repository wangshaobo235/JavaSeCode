package com.bangbangas.oop.finalabstract;

import java.time.DayOfWeek;

/**
 * ClassName: Interface
 * Package: com.bangbangas.oop.finalabstract
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/3 13:59
 *@Version 1.0
 * 类是类，接口是接口，并列关系
 * 接口没有构造器
 * 1.8之前
 * 常量 public static final
 * 方法 public abstract
 * 类和接口的关系：实现
 * 类和类的关系：继承
 *
 *
 * 1.8之后
 *  加入非abstract的方法
 * （1）被public default修饰的非抽象方法 ：
 * 注意1：default修饰符必须要加上，否则出错
 * 注意2：实现类中要是想重写接口中的非抽象方法，那么default修饰符必须不能加，否则出错。
 */
public interface Interface {
    public static final int age = 10;
    public abstract void say();
    public abstract int eat(String test); // 修饰符可以省略不写 自动变灰
}


interface Interface2 {
    public static final int age = 10;
    public abstract void say();
    public abstract int eat(String test); // 修饰符可以省略不写 自动变灰
}

class test extends AbstractSub implements Interface,Interface2{
    @Override
    public void say() {

    }

    @Override
    public int eat(String test) {
        return 0;
    }

}
