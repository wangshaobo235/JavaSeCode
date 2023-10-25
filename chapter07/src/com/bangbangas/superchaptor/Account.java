package com.bangbangas.superchaptor;

import java.rmi.activation.ActivationMonitor;
import java.util.Objects;

/**
 * ClassName: Account
 * Package: com.bangbangas.superchaptor
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/14 10:14
 * @Version 1.0
 */



public class Account {
    private int id;
    protected double balance;
    private double annuallnterestRate;

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

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public void getMonthlyInterest(){
        System.out.println(annuallnterestRate / 12);
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.print("余额不足\n");
            System.out.println("您的账户余额为"+balance);
        }else{
            balance-=amount;
        }
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println(balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Double.compare(account.balance, balance) == 0 && Double.compare(account.annuallnterestRate, annuallnterestRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance, annuallnterestRate);
    }
}
