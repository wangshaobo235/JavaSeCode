package com.bangbangas.construct;

/**
 * ClassName: Account
 * Package: com.bangbangas.construct
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/6 10:57
 * @Version 1.0
 */
public class Account {
    /*
    该类包括的属性：账号id，余额balance，年利率annualInterestRate；
    包含的方法：访问器方法（getter和setter方法），取款方法withdraw()，存款方法deposit()。
     */
    private int id;
    private double balance;
    private double annualInterestRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount){
           if(amount<balance){
               balance-=amount;
           }else{
               System.out.println("余额不足");
           }
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }else{
            System.out.println("输入的存款不符合规则");
        }
    }

}
