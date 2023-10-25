package com.bangbangas.object;

/**
 * ClassName: TransferTest3
 * Package: com.bangbangas.object
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/5 11:32
 * @Version 1.0
 */
public class TransferTest3 {
    public static void main(String args[]) {
        TransferTest3 test = new TransferTest3();
        test.first();
    }
    public void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i); // 15 0
        System.out.println(v.i);//15
    }
    public void second(Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println(v.i + " " + i);
    }
}

class Value {
    int i = 15;
}
