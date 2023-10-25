package com.bangbangas;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.IOException;

/**
 * ClassName: ExceptionDemo1
 * Package: com.bangbangas
 * Description:
 *
 * @Author 王少波
 * @Create 2023/10/8 16:56
 * @Version 1.0
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println(12 / 0);
        }
        catch (Exception e) {
            e.printStackTrace();
            // System.out.println(12 / 0);
        }
         finally {
            System.out.println("释放资源");
        }

        System.out.println("111");
        Father father = new Father();
        int[] test = new int[3];
        try {
            father.max();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

class Father{
    public void method1() throws IOException {

    }

    public void max(int ... a ) throws IOException {
        if(a==null || a.length==0){
                throw new IOException("传入值为空。无法取得最大值");
        }else{
             int max= a[0];
            for (int i = 0; i < a.length; i++) {
                max=max>=a[i]?max:a[i];
            }
            System.out.println(max);
        }
        System.out.println("throw下的程序");

    }
}

class Son extends Father{
    @Override
    public void method1() throws IOException {

    }
}
