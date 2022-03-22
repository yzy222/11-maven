package com.URL.url11.socket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerDemo {
    public static void main(String[] args) {
        InputStream is=null;
        ByteArrayOutputStream bs=null;
        Socket accept=null;
        ServerSocket serverSocket=null;
        try {
            serverSocket = new ServerSocket(9999);
            accept = serverSocket.accept();
            is  = accept.getInputStream();
            /*byte[] bytes = new byte[1024];
            int len;
            while((len=is.read(bytes))!=-1){
                String s=new String(bytes,0,len);
                System.out.println(s);
            }
*/
            bs  = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int len;
            while((len=is.read(bytes))!=-1){
                bs.write(bytes,0,len);
            }
            System.out.println(bs.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(bs!=null){
                try {
                    bs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(accept!=null){
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
