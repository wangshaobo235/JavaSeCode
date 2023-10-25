package com.bangbangas.advanced;

/**
 * ClassName: Bank
 * Package: com.bangbangas.advanced
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/8 10:39
 * @Version 1.0
 */
public class Bank {
    private Customer [] customers =new Customer[2];
    int numberOfCustomer;

    public Bank() {
    }
    public void addCustomer(String first,String last){
        if(numberOfCustomer<customers.length) {
            Customer customer = new Customer(new Account());
            customer.setFirstName(first);
            customer.setLastName(last);
            customers[numberOfCustomer] = customer;
            numberOfCustomer++;
        }else{
            System.out.println("账号人数已到上线，请扩充");
        }
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public void setNumberOfCustomer(int numberOfCustomer) {
        this.numberOfCustomer = numberOfCustomer;
    }

    public Customer getCustomer(int index){
        if(index>=0 && index<customers.length) {
        return customers[index];
    }else{
            return null;
        }
    }
}
