package com.bangbangas.oop.finalabstract;

/**
 * ClassName: Abstract
 * Package: com.bangbangas.oop.finalabstract
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/3 13:49
 * @Version 1.0
 */

/*
类是类，接口是接口    接口中没有构造器      类实现接口
抽象类 抽象方法
一个类中如果有方法是抽象方法，那么这个类必须是抽象类
一个抽象类中可以有0~n个抽象方法
6.抽象类可以被其他类继承：
7.一个类继承一个抽象类，那么这个类可以变成抽象类
8.一般子类不会加abstract修饰，一般会让子类重写父类中的抽象方法
9.子类继承抽象类，就必须重写全部的抽象方法
10.子类如果没有重写父类全部的抽象方法，那么子类也可以变成一个抽象类。

1）抽象类不能创建对象，那么抽象类中是否有构造器？
抽象类中一定有构造器。构造器的作用  给子类初始化对象的时候要先super调用父类的构造器。

（2）抽象类是否可以被final修饰？
不能被final修饰，因为抽象类设计的初衷就是给子类继承用的。要是被final修饰了这个抽象类了，就不存在继承了，就没有子类。



 */




public abstract class Abstract {
    public void eat(){
     // 子类对eat方法满意
    }

 /*   public abstract void say();

  */
    public abstract void say();



}
