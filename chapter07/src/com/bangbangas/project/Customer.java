package com.bangbangas.project;

import com.sun.xml.internal.ws.message.source.PayloadSourceMessage;

/**
 * ClassName: Customer
 * Package: com.bangbangas.project
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/11 11:14
 * @Version 1.0
 */
public class Customer {

    String name;
    char gender;
    int age;
    String phone;
    String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInfo(){
        System.out.println(this.name+"\t"+this.age+"\t"+this.gender+"\t"+this.phone+"\t"+this.email);
    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

}
