package com.bangbangas.exception;

public class Person {
    private String name;
    private  int age;
    private  String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender)  {
        if("男".equals(gender) || "女".equals(gender)){
           this.gender=gender;
        }else{
            try {
                throw new MyException("自定义异常：传入的性别不对，请输入男或女");
            } catch (MyException e) {
                e.printStackTrace();
              }

        }
    }

    public Person(String name, int age, String gender)  {
        this.name = name;
        this.age = age;
        this.setGender(gender);
    }
}
