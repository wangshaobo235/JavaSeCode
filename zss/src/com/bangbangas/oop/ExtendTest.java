package com.bangbangas.oop;

/**
 * ClassName: ExtendTest
 * Package: com.bangbangas.oop
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/2 14:54
 * @Version 1.0
 */

/**
 * 子类继承父类
 * 提高代码复用性：父类定义的属性和方法 子类可以直接用
 *
 *需要注意的点：
 *父类private修饰的内容，子类实际上也继承，只是因为封装的特性阻碍了直接调用，但是提供了间接调用的方式，可以间接调用。
 *
 */
public class ExtendTest {
    public static void main(String[] args) {
        ExtendSub extendSub = new ExtendSub();
        extendSub.setSno(110);
        extendSub.setHeight(10.0);
        extendSub.eat();
        extendSub.sleep();
        extendSub.study();
        extendSub.hashCode();
        System.out.println(extendSub.getSno());
        System.out.println(extendSub.getHeight());
    }
}
