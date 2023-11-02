package com.bangbangas.oop.access;

/**
 * ClassName: AccessTest
 * Package: com.bangbangas.oop.access
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/2 15:46
 * @Version 1.0
 */

/*            同类   同包     子类      所有类
public         √
default        √     √
protected      √     √       √
public         √     √       √          √


 */
public class AccessTest {
    public static void main(String[] args) {
        Access access = new Access();
        System.out.println(access.score+ access.height+ access.age);
    }
}
