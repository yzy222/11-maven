package com.URL.url11.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiveDemo01 {
    public static void main(String[] args) {
        DatagramSocket socket=null;
        try {
            socket=new DatagramSocket(9090);
            while(true){
                byte[] bytes = new byte[1024];
                DatagramPacket packet=new DatagramPacket(bytes,0,bytes.length);
                socket.receive(packet);
                String data=new String(packet.getData(),0,packet.getLength());
                System.out.println(data);
                if ("byb".equals(data)) break;
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (socket!=null){
                socket.close();
            }
        }
    }
}
