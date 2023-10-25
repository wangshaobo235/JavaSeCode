package com.bangbangas.superchaptor;

/**
 * ClassName: StudentTest
 * Package: com.bangbangas.superchaptor
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/14 9:50
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        String test = new String("test");
        String s = new String("test");
        int num = 65;
        float num1 = 65F;
        System.out.println(test == s);
        System.out.println(test.equals(s));
        System.out.println(num == num1);
        System.out.println(student.equals(student1));

        student.hobby();

    }
}
