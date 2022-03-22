package com.URL.url11.udp11;

import java.io.IOException;
import java.net.*;

public class UDPClientDemo01 {
    public static void main(String[] args) {
        DatagramSocket socket=null;
        try {
            socket = new DatagramSocket();
            String message="你好";
            InetAddress id= InetAddress.getByName("localhost");
            int port=9000;
            DatagramPacket packet=new DatagramPacket(message.getBytes(),0,message.getBytes().length,id,port);
            socket.send(packet);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(socket!=null){
                socket.close();
            }
        }
    }
}
