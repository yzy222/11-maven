package com.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest6 {
    public static void main(String[] args) throws Exception{
       /* Class class1=Class.forName("com.reflect.Uerss");
        Method[] methods=class1.getDeclaredMethods();
        System.out.println(methods.length);
        for (Method method :
                methods) {
            //System.out.println(method.getName());
            //System.out.println(method.getReturnType().getSimpleName());
            //System.out.println(Modifier.toString(method.getModifiers()));
            Class[] class2=method.getParameterTypes();
            for (Class class3 :
                    class2) {
                System.out.print(class3.getSimpleName()+" ");
            }

        }*/
        Class class1=Class.forName("com.reflect.Uerss");
        Object obj=class1.newInstance();
        //getDeclaredMethod(String name, class<?>... parameterTypes)
        Method method=class1.getDeclaredMethod("getAge");
        //invoke调用
        //invoke(Object obj, Object... args)
        System.out.println(method.invoke(obj));
        //调用无参构造方法  <Class>.newInstance
        //constructor  调用有参构造方法  <constructor>.newInstance


    }
}
