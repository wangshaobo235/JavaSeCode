package com.bangbangas.decision;

/**
 * ClassName: Employee
 * Package: com.bangbangas.decision
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/5 15:51
 * @Version 1.0
 */
public class Employee {
    public String name;
    String gender;
    protected int age;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0 && age<=130){
            this.age = age;
        }else{
            System.out.println("输入的年龄不符合规则");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
