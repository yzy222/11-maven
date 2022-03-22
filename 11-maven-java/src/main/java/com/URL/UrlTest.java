package com.URL;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class UrlTest {
    public static void main(String[] args) {
        Scanner reader;
        URL url;
        Thread readURL;
        Look look=new Look();
        System.out.println("输入资源");
        reader=new Scanner(System.in);
        String source=reader.nextLine();
        try {
            //URL(String spec) 创建URL对象
            url=new URL(source);
            look.setUrl(url);
            readURL=new Thread(look);
            readURL.start();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
