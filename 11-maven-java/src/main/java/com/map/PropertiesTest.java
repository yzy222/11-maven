package com.map;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        /*key和value均为String
        * 属性类
        * */
        Properties pro=new Properties();
        //存
        pro.setProperty("qqq","qqq");
        pro.setProperty("222","111");
        //取
        System.out.println(pro.getProperty("222"));
    }
}
