package com.bangbangas.oop;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * ClassName: Person
 * Package: com.bangbangas.oop
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/1 10:47
 * @Version 1.0
 */
public class Person {
    /*
    名词：成员变量 有默认值 类中方法外  局部变量：必须初始化 方法内或者{}内：代码块
    动词: 方法
     */
    int age;
    String name;
    double height;
    double weight;

    //显式声明无参构造器
    public Person(){
        System.out.println("调用无参构造器");
    }

    public void eat(){
        int num ;
        {
            int num1;
        }
        System.out.println("我喜欢吃饭");
    }

    public void sleep(String adderss){
        System.out.println("我在"+adderss+"睡觉");
    }

    public void introduce(){
        System.out.println("我叫"+name+"睡觉"+name+height+weight);
    }

}
