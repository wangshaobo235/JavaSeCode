package com.bangbangas.collection;

import java.util.List;

/**
 * ClassName: Test
 * Package: com.bangbangas.collection
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/9 10:03
 * @Version 1.0
 */
public class Test {
    /*
    public void eat(List<Object> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }

     */

    public void eat(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
