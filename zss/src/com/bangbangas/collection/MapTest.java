package com.bangbangas.collection;

import java.util.*;

/**
 * ClassName: MapTest
 * Package: com.bangbangas.collection
 * Description:
 *
 * @Author 王少波
 * @Create 2023/11/10 10:14
 * @Version 1.0
 */
public class MapTest {
    public static void main(String[] args) {

        /*
        增 put putall
        删 clear remove
        改
        查 entryset get keyset values
        判断 containskey containsvalue equal isempty
         */
        // 无序，唯一
        Map<String,Double> map =  new HashMap();
        map.put("wangshaobo", Double.parseDouble("100"));
        map.put("wanglixin", Double.valueOf(200));
        map.put("guotingmu", Double.valueOf(300));
        System.out.println(map.size());
        System.out.println(map);
        map.remove("guotingmu");
        System.out.println(map);

        System.out.println(map.containsKey("wanglixin"));
        System.out.println(map.containsValue(12.0));

        System.out.println(map.get("wangshaobo"));
        //循环key
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(map.get(string));
        }
        //循环values
        Collection<Double> collection = map.values();
        for (Double aDouble : collection) {
            System.out.println(aDouble);
        }

        map.entrySet();


    }
}
