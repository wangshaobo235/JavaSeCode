package com.bangbangas.advanced;

/**
 * ClassName: Customer
 * Package: com.bangbangas.advanced
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/8 10:39
 * @Version 1.0
 */
public class Customer {
    String firstName;
    String lastName;
    private Account account;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Customer(Account account) {
        this.account = account;
    }
}
