package com.bangbangas.advanced;

/**
 * ClassName: Account
 * Package: com.bangbangas.advanced
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/8 10:38
 * @Version 1.0
 */
public class Account {
    private double banlance;

    public double getBanlance() {
        return banlance;
    }

    public void deposit(double amt){
        if(amt>=0){
            banlance+=amt;
        }else{
            System.out.println("存款金额不能为负数");
        }

    }
    public void withdraw(double amt){
           if(amt>=0 && banlance-amt>=0){
               banlance-=amt;
           }else{
               System.out.println("提款不能为0或提款金额大于存款金额");
           }
    }

}
