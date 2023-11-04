package com.bangbangas.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请录入第一个数");
            int i = scanner.nextInt();
            System.out.println("请录入第二个数");
            int i1 = scanner.nextInt();

            System.out.println("hahahahhahah");
            System.out.println("商为 "+i/i1);
            System.exit(0);
            return ;

        }
        catch(InputMismatchException | ArithmeticException e ){
            System.out.println("输入的格式不对或除数为0");
              e.printStackTrace();
        }
        catch (Exception e) {
            //catch 代码块里的逻辑
            // 第一种：什么都不写 第二种 自定义

            // System.out.println("程序出现异常");
            // System.out.println(e.getMessage());
            // e.printStackTrace();
            throw e;

        }
        finally {
            System.out.println("资源关闭");
                 scanner.close();
        }

        /*
        System.out.println("请录入第一个数");
        if(scanner.hasNextInt()){
            int i = scanner.nextInt();
            System.out.println("请录入第二个数");
            if(scanner.hasNextInt()){
                int i1 = scanner.nextInt();
                if(i1!=0){
                    System.out.println("商为 "+i/i1);
                }else{
                    System.out.println("除数不能为0");
                }
            }else{
                System.out.println("请录入数字");

            }

        }
        else{
            System.out.println("请录入数字");

        }

         */

    }

}
