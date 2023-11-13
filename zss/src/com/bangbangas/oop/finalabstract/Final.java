package com.bangbangas.oop.finalabstract;

/**
 * ClassName: Final
 * Package: com.bangbangas.oop.finalabstract
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/3 13:44
 * @Version 1.0
 */
public class Final {
    final int AGE=10; // final 修饰基本数据类型，无法改变 ,必须进行赋值操作
    /*
    final 修饰的变量不能修改，必须进行赋值
          修饰的方法不能被重写
          修饰的类不能被继承
     */

    public final void eat(){
        System.out.println("final test");
    }

    public  void say(){
        System.out.println("final test1");
    }
}
