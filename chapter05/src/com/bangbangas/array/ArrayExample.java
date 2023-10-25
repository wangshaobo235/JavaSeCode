package com.bangbangas.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName: ArrayExample
 * Package: com.bangbangas.array
 * Description:
 *
 * @Author 王少波
 * @Create 2023/8/16 17:50
 * @Version 1.0
 */
public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println("联系方式：" + tel);

        /*
        String[] week = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println("1.输入数字\n" +
                    "2.终止输入\n");
            int subWeek = sc.nextInt();
            switch(subWeek){
                case 2:
                    flag = false ;
                      break;
                default:
                    System.out.println(week[subWeek - 1]);
            }
        }
        sc.close();
         */
        /**
         * **案例3：**从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
         *
         * - 成绩>=最高分-10  等级为’A’
         * - 成绩>=最高分-20  等级为’B’
         * - 成绩>=最高分-30  等级为’C’
         * - 其余            等级为’D’
         */
        /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生人数");
        double [] score = new double[sc.nextInt()];
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextDouble();
        }
        double maxData = 0;
        for (int i = 0; i < score.length; i++) {
            maxData=(maxData> score[i])?maxData:score[i];
        }
        System.out.println("最大值为"+maxData);
        for (int i = 0; i < score.length; i++) {
            if(maxData-score[i]>30){
                System.out.println("等级为'D'");
            }else if(maxData-score[i]>=20) {
                System.out.println("等级为'C'");
            }            else if(maxData-score[i]>=10) {
                System.out.println("等级为'B'");
            }else {
                System.out.println("等级为'A'");
            }
        }
        sc.close();

         */

        int [] [] datatemp = new int [5][];
        for (int i = 0; i < datatemp.length; i++) {
            datatemp[i] = new int[i+1];
            for (int i1 = 0; i1 < datatemp[i].length; i1++) {
                datatemp[i][i1]=i1+1;
            }
        }
        for (int i = 0; i < datatemp.length; i++) {
            for (int i1 = 0; i1 < datatemp[i].length; i1++) {
                System.out.print(datatemp[i][i1]+"\t");
            }
            System.out.println();
        }
    }
}
