package com.reflect;

public class ReflectTest2 {
    public static void main(String[] args) {
        try {
            Class c1=Class.forName("com.juhd.odka.酒店系统.Room");
            //c1.newInstance();必调用无参构造方法
            System.out.println(c1.newInstance());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
