package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectTest4 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class uerssClass=Class.forName("com.reflect.Uerss");
        //获取类名
        System.out.println(uerssClass.getName());
        System.out.println(uerssClass.getSimpleName());
        //获取类所有public的属性
        Field[] fields =uerssClass.getFields();
        System.out.println(fields.length);
        Field field=fields [0];
        System.out.println(field.getName());
        //获取所有属性名字
        Field[] fs=uerssClass.getDeclaredFields();
        System.out.println(fs.length);
        for (Field f :
                fs) {
            //获取修饰符
            System.out.print(Modifier.toString(f.getModifiers()) +"-");
            //获取属性类型
            Class myClass=f.getType();
            //getSimpleName 简单类名
            System.out.print(myClass.getName()+"-");
            System.out.println(f.getName());
        }


    }
}
