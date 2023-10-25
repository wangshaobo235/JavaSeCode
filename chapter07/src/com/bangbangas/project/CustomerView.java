package com.bangbangas.project;

import javax.swing.text.StyledEditorKit;

/**
 * ClassName: CustomerView
 * Package: com.bangbangas.project
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/11 11:15
 * @Version 1.0
 */
public class CustomerView {
    // private CustomerList customers = new CustomerList(10);
    CustomerList customerlist = new CustomerList(10);

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        System.out.println("-----------------拼电商客户管理系统-----------------");
        System.out.print("\t1 添 加 客 户\n");
        System.out.print("\t2 修 改 客 户\n");
        System.out.print("\t3 删 除 客 户\n");
        System.out.print("\t4 客 户 列 表\n");
        System.out.print("\t5 退      出");
        customerView.enterMainMenu();
    }

    public void enterMainMenu() {
        boolean flag = true;
        do {
            char c = CMUtility.readMenuSelection();
            switch (c) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    flag = false;
                    break;
            }
        } while (flag);
    }

    private void addNewCustomer() {
        System.out.print("---------------------添加客户---------------------\n");
        System.out.print("姓名：");
        String name = CMUtility.readString(4);
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("电话：");
        String phone = CMUtility.readString(14);
        System.out.print("邮箱：");
        String email = CMUtility.readString(14);
        customerlist.addCustomer(new Customer(name, gender, age, phone, email));
        System.out.print("---------------------添加完成---------------------");
    }

    private void modifyCustomer() {
        System.out.print("---------------------修改客户---------------------\n");
        System.out.print("-----------请选择待修改客户编号(-1退出)--------------");
        Customer cust = customerlist.getCustomer(CMUtility.readInt());
        System.out.print("姓名("+cust.getName()+")");
        String name = CMUtility.readString(4);
        cust.setName(name);
        System.out.print("年龄("+cust.getAge()+")");
        int age = CMUtility.readInt();
        cust.setAge(age);
        System.out.print("性别("+cust.getGender()+")");
        char gender = CMUtility.readChar();
        cust.setGender(gender);
        System.out.print("电话("+cust.getPhone()+")");
        String phone = CMUtility.readString(14);
        cust.setPhone(phone);
        System.out.print("邮箱("+cust.getEmail()+")");
        String email = CMUtility.readString(14);
        cust.setEmail(email);
        System.out.print("---------------------修改完成---------------------");

    }
    private void deleteCustomer() {
        System.out.print("---------------------删除客户---------------------\n");
        System.out.print("-----------请选择待删除客户编号(-1退出)--------------");
        Customer cust = customerlist.getCustomer(CMUtility.readInt());
        System.out.print("-----------确认是否删除()--------------");
        System.out.print("---------------------删除完成---------------------");

    }

    private void listAllCustomers() {
        for (int i = 0; i < customerlist.getAllCustomers().length; i++) {
            customerlist.getAllCustomers()[i].printInfo();
        }
    }
}
