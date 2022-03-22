package com.URL.url11.chat02;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class TalkTeacher {
    public static void main(String[] args) {
        try {
            Thread send=new Thread(new TalkSend(InetAddress.getByName("localhost"),8080,9091));
            Thread receive=new Thread(new TalkReceive(8081,"student"));
            send.start();
            receive.start();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
