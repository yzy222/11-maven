package com.URL.url11.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClientDome02 {
    public static void main(String[] args) {
        Socket socket=null;
        FileInputStream fis=null;
        OutputStream os=null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9000);
            fis = new FileInputStream("E:\\java项目\\11-maven-project\\11-maven-java\\src\\touxiang.bmp");
            os = socket.getOutputStream();
            int len;
            byte[] bytes = new byte[1024 * 1024];
            while((len=fis.read(bytes))!=-1){
                os.write(bytes,0,len);
            }
            //socket.shutdownInput();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(os!=null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis!=null){
                try {
                    fis.close();
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
