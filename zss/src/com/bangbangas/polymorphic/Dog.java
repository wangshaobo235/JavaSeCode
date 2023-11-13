package com.bangbangas.polymorphic;

import java.security.acl.AclNotFoundException;

/**
 * ClassName: Dog
 * Package: com.bangbangas.polymorphic
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/8 16:28
 * @Version 1.0
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
