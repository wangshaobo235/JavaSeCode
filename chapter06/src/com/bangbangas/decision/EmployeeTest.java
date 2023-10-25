package com.bangbangas.decision;

import java.util.Scanner;

/**
 * ClassName: EmployeeTest
 * Package: com.bangbangas.decision
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/5 15:52
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[1];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < employees.length; i++) {
            employees[i]=new Employee();
            System.out.println("输入姓名");
            // String name = scanner.next();
            employees[i].setName(scanner.next());
            System.out.println("输入年龄");
            employees[i].setAge(scanner.nextInt());
            System.out.println("输入性别");
            employees[i].setGender(scanner.next());
            System.out.println("输入手机号");
            employees[i].setPhone(scanner.next());

        }

        for (Employee employee : employees) {
            System.out.println(employee.getGender() + employee.getName() + employee.getAge() + employee.getPhone());
        }

        scanner.close();
    }
}
