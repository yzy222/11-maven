package com.map;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeMapTest {
    public static void main(String[] args) {
        //底层二叉树
        //升序
        //无法对自定义类进行排序,需实现Compatable接口  有参构造传比较器（比较器可以使用匿名内部类方式）当需要多种比较规则时使用比较器
       /* TreeSet<String> rs=new TreeSet<>();
        rs.add("qqq");
        rs.add("www");
        rs.add("eee");
        rs.add("rrr");
        rs.add("ttt");
        rs.add("yyy");
        rs.add("uuu");
        for (String s:
             rs) {
            System.out.println(s);
        }
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(111);
        treeSet.add(100);
        treeSet.add(120);
        treeSet.add(1);
        for (Integer i:
             treeSet) {
            System.out.println(i);
        }*/
        Uer u1=new Uer(10);
        Uer u2=new Uer(11);
        Uer u3=new Uer(12);
        Uer u4=new Uer(13);
        Uer u5=new Uer(14);
        TreeSet<Uer> treeSet=new TreeSet<>();
        treeSet.add(u1);
        treeSet.add(u2);
        treeSet.add(u3);
        treeSet.add(u4);
        treeSet.add(u5);
        for (Uer u:
             treeSet) {
            System.out.println(u);
        }
    }
}
class Uer implements Comparable<Uer>{

    private int age;

    public Uer() {
    }

    public Uer(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Uer o) {
        return this.getAge()-o.getAge();
    }

    @Override
    public String toString() {
        return "Uer{" +
                "age=" + age +
                '}';
    }
}
