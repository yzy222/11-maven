package com.reflect;

public class ReflectTest {
    //java.lang.Class：代表字节码文件
    //java.lang.reflect.Constructor：代表构造方法字节码
    //java.lang.reflect.Field：代表属性字节码
    //java.lang.reflect.Method:代表方法字节码
    public static void main(String[] args) {
        /*
        Class.forName()类加载
            1、静态方法
            2、方法参数是个字符串
            3、字符串需要一个完整类名
            4、完整类名带有包名

        */
        //getContextClassLoader()当前线程类加载对象
        //getResource("")获取资源   从根路径下开始寻找
        String path=Thread.currentThread().getContextClassLoader()
                .getResource("com/date/data.properties").getPath();
        System.out.println(path);
        /*第一种：
        Class c = Class.forName("完整类名");
        第二种：
        Class c = 对象.getClass();
        第三种：
        Class c = int.class;
        Class c = String.class;
        */
        Class c1=null;
        try {
            c1=Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String s="abc";
        Class x=s.getClass();
        System.out.println(c1==x);//true
        Class y=String.class;
    }
}
