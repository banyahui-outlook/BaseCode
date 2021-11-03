package com.test;

import java.util.*;

/**
 * @Creater banyahui
 * @Date 2019/11/23 下午 23:36
 * @Description Collection
 */
public class demo6 {
    public static void main(String[] args) {
        Collection<Integer> ints=new ArrayList<>() ;
        ints.add(Integer.valueOf(123));
        ints.add(456);
        System.out.println("ints = " + ints);

        int size = ints.size();
        System.out.println("size = " + size);

        boolean contains = ints.contains(111);
        System.out.println("contains = " + contains);

        /*Collection<Integer> ints2=new ArrayList<>() ;
        ints2.add(Integer.valueOf(1231));
        ints2.add(4565);
        boolean b = ints.retainAll(ints2);
        System.out.println("b = " + b);
        System.out.println("ints2 len:"+ints2.size());*/

        System.out.println("len:"+ints.size());

        Iterator<Integer> iterator = ints.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        for (Integer anInt : ints) {
            System.out.println("anInt = " + anInt);
        }

        ints.clear();
        System.out.println("clear len:"+ints.size());


        System.out.println("empty:"+ints.isEmpty());


        ints.add(Integer.valueOf(123));
        ints.add(456); ints.add(999);
        ints.add(888);

        Collections.sort((List<Integer>) ints);

        System.out.println("ints = " + ints);
        
        Collections.shuffle((List<Integer>) ints);

        System.out.println("ints = " + ints);


        Collections.sort((List<Integer>)ints, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        System.out.println("ints = " + ints);

    }
}
