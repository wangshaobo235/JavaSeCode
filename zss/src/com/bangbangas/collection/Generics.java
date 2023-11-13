package com.bangbangas.collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ClassName: Generics
 * Package: com.bangbangas.collection
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/7 15:12
 * @Version 1.0
 */
public class Generics {
    public static void main(String[] args) {
        /*
        如果不使用泛型，存入的数据类型比较乱，什么引入类型都可以存入集合中
        加入泛型的优点：在加入数据的时候就进行校验，不是该泛型就会报错，添加不进去
                     遍历的时候不需要指定为object,指定为泛型即可
        在遍历的过程中，不需要强指定为object类型，指定为泛型即可
        出现在1.5之后
        <参数类型>：参数类型具体在使用的时候才会确定具体类型
        泛型的作用:使用了泛型就可以确认泛型类型，在编译期就能实现编译，后续遍历才会简单
        都是引用数据类型，不能是基本数据类型
        1.7之后：ArrayList<Integer> list =  new ArrayList();
         */

        ArrayList<Integer> list =  new ArrayList<Integer>();
        list.add(12);
        list.add(29);
        list.add(30);

        for(Integer o : list){
            System.out.println(o);
        }

    }
}
