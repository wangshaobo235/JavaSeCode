package com.bangbangas.advanced;

/**
 * ClassName: BankTest
 * Package: com.bangbangas.advanced
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/8 16:53
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("王","少波");
        bank.addCustomer("王","少波1");
        bank.addCustomer("王","少波2");
        bank.getCustomer(0).getAccount().deposit(2000);
        System.out.println(bank.getNumberOfCustomer());
        System.out.println(bank.getCustomer(0).getFirstName() + bank.getCustomer(0).getLastName() + bank.getCustomer(0).getAccount().getBanlance());
    }
}
