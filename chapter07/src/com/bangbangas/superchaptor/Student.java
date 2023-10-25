package com.bangbangas.superchaptor;

/**
 * ClassName: Student
 * Package: com.bangbangas.superchaptor
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/14 9:49
 * @Version 1.0
 */
 class Student extends Person{

    public Student() {
        super();
    }

    public Student(String name, int age) {
        // super(name, age);
        this.name=name;
        this.age=age;
    }

    @Override
    public void hobby() {
        System.out.println("打游戏");
        super.hobby();
    }
}
