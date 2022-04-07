package com.URL;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
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
            //协议://域名（ip）:端口/项目名/资源
            url=new URL(source);
            look.setUrl(url);
            readURL=new Thread(look);
            readURL.start();
            //url.getProtocol() 获取协议
            //url.getHost() ip
            //url.getPath() 文件
            //url.getPort 端口
            //url.getFile() 全路径
            HttpURLConnection h=(HttpURLConnection) url.openConnection();
            InputStream in=h.getInputStream();
            System.out.println(url.getHost());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
