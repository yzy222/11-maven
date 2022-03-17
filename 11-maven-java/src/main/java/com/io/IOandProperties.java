package com.io;

import java.io.FileReader;
import java.util.Properties;

public class IOandProperties {
    public static void main(String[] args) throws Exception {
        FileReader fr =new FileReader("data3.properties");
        Properties pro=new Properties();
        //Properties获取
        pro.load(fr);
        String uername= pro.getProperty("uername");
        System.out.println(uername);
        String password= pro.getProperty("password");
        System.out.println(password);
        fr.close();
    }
}
