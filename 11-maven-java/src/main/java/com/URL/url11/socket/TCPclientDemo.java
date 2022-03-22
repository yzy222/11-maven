package com.URL.url11.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPclientDemo {
    public static void main(String[] args) {
        InetAddress byName=null;
        Socket socket=null;
        OutputStream os=null;
        try {
            byName = InetAddress.getByName("127.0.0.1");
            int port =9999;
            socket = new Socket(byName,port);
            os = socket.getOutputStream();
            os.write("你好".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
