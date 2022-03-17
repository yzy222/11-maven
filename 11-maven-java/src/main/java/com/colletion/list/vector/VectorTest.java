package com.colletion.list.vector;

import java.util.*;

public class VectorTest {
    public static void main(String[] args) {
        List list=new Vector();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        Iterator it = list.iterator();
        while(it.hasNext()) System.out.println(it.next());
        List mylist=new ArrayList();//非线程安全
        Collections.synchronizedList(mylist);//变线程安全
        //Collection集合类
        //Collections集合工具类
        mylist.add("fff");
        mylist.add("fff");
        mylist.add("fff");
        mylist.add("fff");

    }
}
