package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest5 {
    public static void main(String[] args) throws Exception{
        StringBuilder s=new StringBuilder();
        Class c=Class.forName("java.lang.String");
        s.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
        Field[] fields=c.getDeclaredFields();
        for (Field field :
                fields) {
            s.append("\t");
            s.append(Modifier.toString(field.getModifiers()));
            s.append(" ");
            s.append(field.getType().getSimpleName());
            s.append(" ");
            s.append(field.getName()+';');
            s.append("\n");
        }
        s.append("\n}");
        System.out.println(s);
        System.out.println("--------------------------");
        Class class1=Class.forName("com.reflect.Uerss");
        Object obj=class1.newInstance();
        //Field ageField=class1.getDeclaredField("age");
        Field heightField=class1.getDeclaredField("height");
        heightField.setAccessible(true);//打破封装
        heightField.set(obj,11);
        System.out.println(heightField.get(obj));
    }
}
