package com.URL.url11;

import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 2021);
        System.out.println(address);
        System.out.println(address.getAddress());
        System.out.println(address.getHostName());
        System.out.println(address.getPort());
    }
}
