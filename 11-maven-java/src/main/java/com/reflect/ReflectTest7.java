package com.reflect;

public class ReflectTest7 {
    public static void main(String[] args) throws Exception{
        //获取父类和接口
        Class class1=Class.forName("com.reflect.Uerss");
        System.out.println(class1.getSuperclass().getName());
        Class[] class3=class1.getInterfaces();
        for (Class class4 :
                class3) {
            System.out.println(class4.getName());
        }


    }
}
