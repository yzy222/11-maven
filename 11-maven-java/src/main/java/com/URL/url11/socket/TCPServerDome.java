package com.URL.url11.socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerDome {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket socket=null;
        InputStream is=null;
        OutputStream os=null;
        try {
            while(true) {
                serverSocket = new ServerSocket(9000);
                socket = serverSocket.accept();
                is = socket.getInputStream();
                int len,i=0;
                byte[] bytes = new byte[1024 * 1024];
                os = new FileOutputStream("E:\\java项目\\11-maven-project\\11-maven-java\\src/main/java/com/URL/url11/socket/touxiang.bmp");
                while ((len = is.read(bytes)) != -1) {
                    os.write(bytes, 0, len);
                    System.out.println(i);
                    i++;
                }
                if(len==-1) break;
            }
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
            if(is!=null){
                try {
                    is.close();
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
