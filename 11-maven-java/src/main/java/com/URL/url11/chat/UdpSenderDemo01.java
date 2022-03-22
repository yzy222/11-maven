package com.URL.url11.chat;

import com.URL.Socket.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpSenderDemo01 {
    public static void main(String[] args) {
        DatagramSocket socket=null;
        BufferedReader reader=null;
        InetAddress id;
        int localPort,ServerPort;
        try {
            localPort=8080;
            ServerPort=9090;
            id = InetAddress.getByName("localhost");
            socket = new DatagramSocket(localPort);
            reader=new BufferedReader(new InputStreamReader(System.in));
            while(true){
                String data = reader.readLine();
                byte[] bytes = data.getBytes();
                DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length,id, ServerPort);
                socket.send(packet);
                if ("byb".equals(data)) break;
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null){
                socket.close();
            }
        }
    }
}
