package com.bangbangas.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

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

/*
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integ);
        }

 */

        for(Object o:integers){
            System.out.println(o);
        }

        Iterator iterator = integers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
