package com.reflect;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class ReflectTest3 {
    public static void main(String[] args) throws Exception{
        //FileReader f=new FileReader("data3.properties");
        /*String path=Thread.currentThread().getContextClassLoader()
                .getResource("com/date/data.properties").getPath();
        FileReader f=new FileReader(path);*/
        InputStream in=Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("com/date/data.properties");
        Properties p=new Properties();
        p.load(in);
        in.close();
        Class c=Class.forName(p.getProperty("classname"));
        System.out.println(c.newInstance());
    }
}
