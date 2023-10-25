package com.bangbangas.extend;

/**
 * ClassName: ManKind
 * Package: com.bangbangas.extend
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/12 16:02
 * @Version 1.0
 */
public class ManKind {
/*
            - 成员变量int sex和int salary；
            - 方法void manOrWoman()：根据sex的值显示“man”(sex==1)或者“woman”(sex==0)；
            - 方法void employeed()：根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0)。

 */

    private int sex;
    private int salary;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        switch(sex){
            case 0:
                System.out.println("woman");
            case 1:
                System.out.println("man");
            default:
                System.out.println("非人类");
        }
    }

    public ManKind employeed(){
        if(salary>0){
            System.out.println("job");
        }else{
            System.out.println("nojob");
        }
        return null;
    }
}
