package com.colletion;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        //添加元素
        c.add(100);//自动装箱
        //元素个数
        c.size();
        System.out.println("元素个数："+c.size());
        //清空
        c.clear();
        System.out.println("元素个数："+c.size());
        c.add("fjejf");
        c.add(349382);
        c.add(34);
        //查找元素
        System.out.println(c.contains(34));
        //移除指定元素
        c.remove(34);
        System.out.println(c.contains(34));
        //判断集合是否为空
        System.out.println(c.isEmpty());
        //集合转数组
        Object[] obj=c.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

    }
}
