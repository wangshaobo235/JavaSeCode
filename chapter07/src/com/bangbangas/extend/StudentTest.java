package com.bangbangas.extend;

/**
 * ClassName: Student
 * Package: com.bangbangas.extend
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/12 14:52
 * @Version 1.0
 */

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("王少波",'男',30,1,100,100,100);
        System.out.println(student.aver());
        System.out.println(student.max());
        System.out.println(student.min());
        System.out.println(student.getClass().getSuperclass());
        student.test();
    }
}



class Student extends Person{
       long number;
       int math;
       int english;
       int computer;

    public Student(String name, char sex, int age, long number, int math, int english, int computer) {
        this.name= name;
        this.sex=sex;
        this.age=age;
        this.number = number;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }

    public double aver(){
        return (math+english+computer)/3.0;
    }

    public int max(){
        return (english>math?english:math)>computer?(english>math?english:math):computer;
    }

    public int min(){
        return (english<math?english:math)<computer?(english<math?english:math):computer;
    }

}
