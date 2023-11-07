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
        Genericstest01<Object> objectGenericstest01 = new Genericstest01<>();
        objectGenericstest01.a(1);
        objectGenericstest01.a(10.0);
        objectGenericstest01.a("test");

        Genericstest01<String> stringGenericstest01 = new Genericstest01<>();
        stringGenericstest01.sex="test";
        stringGenericstest01.b(new String []{"1234"});

    }
}

class Genericstest01<E> {
    int age;
    String name;
    E sex;

    public void a(E n){
    }
    public static  <E> void b(E[] m){
    }

}
