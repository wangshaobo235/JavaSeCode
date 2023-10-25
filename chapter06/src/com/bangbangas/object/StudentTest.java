package com.bangbangas.object;

import java.util.Arrays;

/**
 * ClassName: StudentTest
 * Package: com.bangbangas.object
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/5 10:38
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] studentTests = new Student[20];
        for (int i = 0; i < studentTests.length; i++) {
            Student student = new Student();
            studentTests[i] = student;
            student.number = i + 1;
            student.state = (int) (Math.random() * 6 + 1);
            student.score = (int) (Math.random() * 101);
        }

        for (Student studentTest : studentTests) {
            if (studentTest.state == 3) {
                System.out.println(studentTest.number + " " + studentTest.state + " " + studentTest.score);
            }
        }

        for (Student studentTest : studentTests) {

            System.out.println(studentTest.number + " " + studentTest.state + " " + studentTest.score);

        }
        for (int i = 0; i < studentTests.length-1; i++) {
            for (int j = 0; j < studentTests.length - 1 - i; j++) {
                if (studentTests[j].score < studentTests[j + 1].score) {
                    Student temp = studentTests[j];
                    studentTests[j] = studentTests[j + 1];
                    studentTests[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < studentTests.length; i++) {
            System.out.println(studentTests[i].number + " " + studentTests[i].state + " " + studentTests[i].score);
        }



    }
}
