package com.colletion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c =new ArrayList();
        c.add("Hello");
        c.add("world");
        c.add(234);
        Iterator i =c.iterator();
        while (i.hasNext()){
            Object o=i.next();
            System.out.println(o);
        }
        System.out.println("-----------------------");
        Collection c1=new ArrayList();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(1);
        Iterator i1 =c1.iterator();
        while (i1.hasNext()) System.out.println(i1.next());
        System.out.println("-------------------------");
        Collection c2=new HashSet();
        c2.add(1);
        c2.add(2);
        c2.add(3);
        c2.add(64);
        c2.add(34);
        c2.add(14);
        c2.add(432);
        c2.add(239);
        c2.add(200);
        c2.add(1);
        Iterator i2=c2.iterator();
        while(i2.hasNext()) System.out.println(i2.next());
/*      无序不重复
        64
        432
        1
        2
        34
        3
        200
        14
        239
*/

    }
}
