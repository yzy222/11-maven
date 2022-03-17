package com.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        int[] ints={34,6,5,7,43,3,6};
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        //for (元素类型  变量名:数组或集合){}
        for (int data:
             ints) {
            System.out.println(data);
        }
        List<Integer> list=new ArrayList<>();
        list.add(232);
        list.add(342);
        list.add(3423);
        list.add(342);
        list.add(4232);
        Iterator<Integer> it =list.iterator();
        while(it.hasNext()) System.out.println(it.next());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Integer integer:list) System.out.println(integer);
    }
}
