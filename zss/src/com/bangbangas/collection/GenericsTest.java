package com.bangbangas.collection;

/**
 * ClassName: GenericsTest
 * Package: com.bangbangas.collection
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/7 15:32
 * @Version 1.0
 */

// E肯定是引用数据类型

public class GenericsTest{
    public static void main(String[] args) {
        Genericstest01 <String> objectGenericstest01 = new Genericstest01();
        objectGenericstest01.a(1); // 无法执行
        objectGenericstest01.a(10.0); // 无法执行
        objectGenericstest01.a("test");
        objectGenericstest01.a('A');

        // 实例化的时候不指定泛型，相当于object
        // 实例化的时候指定泛型,对类型进行限制
        Genericstest01 stringGenericstest01 = new Genericstest01();
        stringGenericstest01.sex="test";
        stringGenericstest01.c("a");
        stringGenericstest01.c(10);
        stringGenericstest01.b(new String[]{"a","b"});
        stringGenericstest01.b(new Integer[]{1,2});


        Genericstest01sub genericstest01sub = new Genericstest01sub();
        genericstest01sub.b(new String[]{"a","b"});


    }
}


 /* <E>: E只是个参数，相当于占位，确定是引用数据类型


 */
class Genericstest01<E> {
    int age;
    String name;
    E sex;


    /*
    泛型方法：
 1.什么是泛型方法：
 不是带泛型的方法就是泛型方法
 泛型方法有要求：这个方法的泛型的参数类型要和当前的类的泛型无关
 泛型方法对应的那个泛型参数类型和当前所在的这个类是否是泛型类，泛型是啥无关
 2.泛型方法定义的时候，前面要加上<T>
 原因：如果不加的话，会把T当做一种数据类型，然而代码中没有T类型那么就会报错
 3.T的类型是在调用方法的时候确定的
 4.泛型方法可否是静态方法？可以是静态方法

     */
    public <T> void a(T n) {

    }
    public   void b(E [] m){
        for (E e : m) {
            System.out.println(e);
        }
    }

    public static  <T> void c(T m){
        System.out.println(m);
    }
}


// 父类指定泛型，子类不需要指定泛型
class Genericstest01sub extends Genericstest01<String>{

}


// 父类不指定泛型，子类必须指定泛型
class Genericstest01subsub<E> extends Genericstest01<E>{

}
