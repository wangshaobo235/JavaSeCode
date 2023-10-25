package com.bangbangas.project;

import java.util.Arrays;
import java.util.Timer;

/**
 * ClassName: CustomerList
 * Package: com.bangbangas.project
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/11 11:15
 * @Version 1.0
 */
public class CustomerList {
    int total;
    Customer[] customer;

    public CustomerList(int totalCustomer) {
        customer = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer) {
        if(total<this.customer.length){
            this.customer[total]=customer;
            total++;
            return true;
        }else{
            System.out.println("已满");
            return false;
        }
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if(index>=1 && index<=this.customer.length){
           this.customer[index-1]=cust;
           return true;
        }else{
            return false;
        }
    }

    public boolean deleteCustomer(int index) {
        if(index>=0 && index<=this.total){
            for (int i = index; i < this.total; i++) {
                customer[i]=customer[i+1];
            }
            this.customer[total]=null;
            total--;
            return true;
        }else{
            return false;
        }
    }

    public Customer[] getAllCustomers() {
        return customer;
    }

    public Customer getCustomer(int index) {
             return this.customer[index];
    }

    public int getTotal() {
        return total;
    }


}
