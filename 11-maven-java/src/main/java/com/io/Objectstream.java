package com.io;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Objectstream {
    //transient 游离 不参与序列化
    //无法序列多个对象，但可序列化对象集合
    //区别类：类名+序列化版本号
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("data2"));
        oos.writeObject(new uers("hh","yyy"));
        oos.flush();
        oos.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data2"));
        Object o=ois.readObject();
        uers uers=(uers)o;
        System.out.println(uers);

        ois.close();
    }


}
