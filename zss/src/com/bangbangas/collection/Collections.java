package com.bangbangas.collection;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        Collection objects = new ArrayList();
        objects.add(12);
        objects.add(23);
        objects.add(4);
        objects.add(5);
        /*
        System.out.println(objects);
        objects.remove(20);
        objects.clear();
        System.out.println(objects);
        System.out.println(objects.size());
        System.out.println(objects.isEmpty());

         */

        Collection integers = Arrays.asList(new Integer[]{12, 23, 4, 5});

        System.out.println(objects.equals(integers));
        System.out.println(objects == integers);

        for(Object o:integers){
            System.out.println(o);
        }
        Iterator iterator = integers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List list = Arrays.asList(new Integer[]{12, 23, 4, 5});
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object o : list) {
            System.out.println(o);
        }

        Iterator iterator1 = list.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


    }
}
