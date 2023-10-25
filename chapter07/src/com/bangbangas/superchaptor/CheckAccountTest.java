package com.bangbangas.superchaptor;

/**
 * ClassName: CheckAccountTest
 * Package: com.bangbangas.superchaptor
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/14 11:09
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);
        checkAccount.withdraw(5000);
        System.out.println(checkAccount.getBalance());
        System.out.println(checkAccount.getOverdraft());
        checkAccount.withdraw(18000);
        System.out.println(checkAccount.getBalance());
        System.out.println(checkAccount.getOverdraft());
        checkAccount.withdraw(3000);
        System.out.println(checkAccount.getBalance());
        System.out.println(checkAccount.getOverdraft());
        eat();
    }

    public static void eat(){
    }
}
