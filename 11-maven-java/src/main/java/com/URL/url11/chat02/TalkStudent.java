package com.URL.url11.chat02;

import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class TalkStudent {
    public static void main(String[] args) {
        try {
            Thread send = new Thread(new TalkSend(InetAddress.getByName("localhost"), 9090, 8081));
            Thread receive=new Thread(new TalkReceive(9091,"teacher"));
            send.start();
            receive.start();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
