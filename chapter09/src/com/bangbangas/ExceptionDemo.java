package com.bangbangas;
import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;

import java.util.Scanner;

/**
 * ClassName: ExceptionDemo
 * Package: com.bangbangas
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/15 10:32
 * @Version 1.0
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        //Person personDemo = new Person("王少波", -10);
        Person personDemo1 = new Person();
        personDemo1.setLifeValue(10);
        try {
            int data= Integer.parseInt(args[0]);
            int data1 = Integer.parseInt(args[1]);
            divide(data,data1);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (ArithmeticException e ){
            e.printStackTrace();
        }catch (NoLifeValueException e){
            e.printStackTrace();
        }
    }

   public static void divide(int m,int n){
        if(m<0 || n<0){
            throw new NoLifeValueException("参数不能为负值");
        }
       System.out.println(m / n);
   }

}
