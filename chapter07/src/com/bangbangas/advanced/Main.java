package com.bangbangas.advanced;

/**
 * ClassName: Main
 * Package: com.bangbangas.advanced
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/7 17:36
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Boy boy = new Boy("test",20);
        girl girl = new girl("test1",20);
        boy.married(girl);
        girl.married(boy);
    }
}
