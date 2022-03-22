package com.URL.url11;

import java.net.InetAddress;
import java.net.UnknownHostException;


//netstat -ano
//netstat -ano|findstr""
//tasklist|findstr""
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress byName = InetAddress.getByName("www.baidu.com");
            System.out.println(byName);
            InetAddress localHost = InetAddress.getLocalHost();
            InetAddress localHost1 = InetAddress.getByName("localhost");
            System.out.println(localHost+"\n"+localHost1);
            //获取ip
            System.out.println(byName.getAddress());
            //获取规范名
            System.out.println(byName.getCanonicalHostName());
            //获取域名
            System.out.println(byName.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
