package com.bangbangas.superchaptor;

/**
 * ClassName: AccountTest
 * Package: com.bangbangas.superchaptor
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/14 10:32
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,0.045);
        account.withdraw(30000);
        account.withdraw(2500);
        account.deposit(3000);
        account.getBalance();
        account.getMonthlyInterest();
    }
}
