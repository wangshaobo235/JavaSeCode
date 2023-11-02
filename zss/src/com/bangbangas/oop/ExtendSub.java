package com.bangbangas.oop;

/**
 * ClassName: ExtendSub
 * Package: com.bangbangas.oop
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/2 14:11
 * @Version 1.0
 */
public class ExtendSub extends ExtendObject{
    private int sno;

    static {
        System.out.println("extendsub静态代码块");
    }

    public ExtendSub() {
        super();
        System.out.println("extendsub的默认无参构造器");
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void study(){
        System.out.println("学习");
    }

}
