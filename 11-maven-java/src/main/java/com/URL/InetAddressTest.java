package com.URL;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inet;
            //inet= InetAddress.getByName("www.baidu.com");
            inet=InetAddress.getByName("27.152.186.227");
            System.out.println(inet.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
