package com.reflect;
/*
Java.util包下提供一个资源管理器，便于获取属性配置文件中的内容。
使用下列方法时，属性配置文件xxx.properties必须放在类路径下。
 */

import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        //只能绑定xxx.properties
        ResourceBundle bundle =ResourceBundle.getBundle("data");
        String className=bundle.getString("classname");
        System.out.println(className);

    }

}
