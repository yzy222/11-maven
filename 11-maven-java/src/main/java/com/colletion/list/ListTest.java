package com.colletion.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("hello");
        list.add(0,"world");//集合指定位置添加元素
        list.add(1234);//集合末尾添加元素
        list.add(1,"A");
        list.add("B");
        list.add("C");
        Iterator i=list.iterator();
        while (i.hasNext()) System.out.println(i.next());
        System.out.println(list.get(1));//根据下标获取元素
        System.out.println(list.indexOf("B"));//获取指定对象第一次出现处下标
        System.out.println(list.lastIndexOf("B"));//获取指定对象最后一次出现处下标
        list.remove(0);
        System.out.println(list.size());
        list.set(0,"ddd");
        System.out.println(list.get(0));
    }
}
