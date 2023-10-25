package com.bangbangas.construct;

/**
 * ClassName: AccountTest
 * Package: com.bangbangas.construct
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/6 10:57
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setId(1);
        account.setBalance(0);
        account.setAnnualInterestRate(0.01);
        account.deposit(10);
        System.out.println(account.getBalance());
        account.withdraw(100);
        System.out.println(account.getBalance());
        account.deposit(100);
        System.out.println(account.getBalance());
    }
}
