package com.bangbangas.array;

import sun.util.locale.provider.FallbackLocaleProviderAdapter;

import javax.swing.table.TableModel;
import java.util.Arrays;

/**
 * ClassName: ArrayExercise
 * Package: com.bangbangas.array
 * Description:
 *
 * @Author 王少波
 * @Create 2023/8/17 17:52
 * @Version 1.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        // 特征值计算 计算最大值 最小值 平均值
        int[] data = new int[]{-10, 10, 20, 50};
        int dataSum = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < data.length; i++) {
            max = (max > data[i]) ? max : data[i];
            min = (min <= data[i]) ? min : data[i];
            dataSum += data[i];
        }
        System.out.println("最大值：" + max + "最小值：" + min + "总和：" + dataSum + "平均值：" + (double) dataSum / data.length);

        //数组值反转
        for (int i = 0; i < data.length / 2; i++) {
            int temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        /*
        {50, 20, 10, -10}
        0,3
        */
        //二分值查找
        int value = -10;
        int head = 0;
        int last = data.length - 1;
        boolean flag = true;
        while (head <= last) {
            int middle = (head + last) / 2;
            if (data[middle] == value) {
                flag = false;
                System.out.println(value + "值已找到");
                break;
            } else if (data[middle] > value) {
                head = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        if (flag) {
            System.out.println("未找到该元素");
        }

        //冒泡排序,降序排序
        int [] datatemp1 = new int[]{20,-10,-20,20,30,90,10,30,-19};
        for (int i = 0; i < datatemp1.length-1; i++) {
            for (int i1 = 1; i1 < datatemp1.length-i; i1++) {
                if (datatemp1[i1 - 1] <= datatemp1[i1]) {
                    int temp = datatemp1[i1 - 1];
                    datatemp1[i1 - 1] = datatemp1[i1];
                    datatemp1[i1] = temp;
                }
            }
        }
        /*
        for (int i =1; i < datatemp1.length-1; i++) {
            if(datatemp1[i-1]<=datatemp1[i]){
                int temp = datatemp1[i-1];
                datatemp1[i-1]=datatemp1[i];
                datatemp1[i]=temp;
            }
        }

        for (int i =1; i < datatemp1.length-2; i++) {
            if(datatemp1[i-1]<=datatemp1[i]){
                int temp = datatemp1[i-1];
                datatemp1[i-1]=datatemp1[i];
                datatemp1[i]=temp;
            }
        }

        for (int i =1; i < datatemp1.length-3; i++) {
            if(datatemp1[i-1]<=datatemp1[i]){
                int temp = datatemp1[i-1];
                datatemp1[i-1]=datatemp1[i];
                datatemp1[i]=temp;
            }
        }

        for (int i =1; i < datatemp1.length-4; i++) {
            if(datatemp1[i-1]<=datatemp1[i]){
                int temp = datatemp1[i-1];
                datatemp1[i-1]=datatemp1[i];
                datatemp1[i]=temp;
            }
        }
*/
        for (int i = 0; i < datatemp1.length; i++) {
            System.out.println(datatemp1[i]);
        }
        String data_string = Arrays.toString(datatemp1);
        System.out.println(data_string);
        Arrays.sort(datatemp1);

    }


}
