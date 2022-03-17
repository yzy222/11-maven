package com.colletion.list.arraylist;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        //指定初始化容量，默认为10（底层创建一个容量为0的数组，当添加第一个元素后初始化容量为10）
        List list =new ArrayList(20);
        Collection collection=new HashSet();
        collection.add(100);
        collection.add(200);
        collection.add(300);
        collection.add(400);
        List list1=new ArrayList(collection);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        Iterator iterator=list1.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

    }
}
