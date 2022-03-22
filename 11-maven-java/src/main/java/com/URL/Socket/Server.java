package com.URL.Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private Socket socket1,socket2;
    private ServerSocket serverSocket1,serverSocket2;
    private boolean flag=true;

    public void connect(int port1,int port2) throws IOException {
        serverSocket1=new ServerSocket(port1);
        serverSocket2=new ServerSocket(port2);
        socket1=serverSocket1.accept();
        socket2=serverSocket2.accept();
        while(true){
            Thread t1=new ServerDescThread(this);
            Thread t2=new ServerDescThread(this);

        }
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Socket getSocket1() {
        return socket1;
    }

    public void setSocket1(Socket socket1) {
        this.socket1 = socket1;
    }

    public Socket getSocket2() {
        return socket2;
    }

    public void setSocket2(Socket socket2) {
        this.socket2 = socket2;
    }

    public ServerSocket getServerSocket1() {
        return serverSocket1;
    }

    public void setServerSocket1(ServerSocket serverSocket1) {
        this.serverSocket1 = serverSocket1;
    }

    public ServerSocket getServerSocket2() {
        return serverSocket2;
    }

    public void setServerSocket2(ServerSocket serverSocket2) {
        this.serverSocket2 = serverSocket2;
    }

}
class ServerDescThread extends Thread {
    Server server;

    public ServerDescThread(Server server) {
        this.server = server;
    }

    public ServerDescThread() {
    }

    @Override
    public void run() {
        synchronized(server){
            if (!server.isFlag()){
                try {
                    server.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                new DataOutputStream(server.getSocket1().getOutputStream())
                        .writeUTF(new DataInputStream(server.getSocket2().getInputStream()).readUTF());
            } catch (IOException e) {
                e.printStackTrace();
            }
            server.setFlag(false);
            server.notifyAll();
        }
    }
}
class ServerAscThread extends Thread{
    Server server;

    public ServerAscThread() {
    }

    public ServerAscThread(Server server) {
        this.server = server;
    }

    @Override
    public void run() {
        synchronized(server){
            try {
                new DataOutputStream(server.getSocket2().getOutputStream())
                        .writeUTF(new DataInputStream(server.getSocket1().getInputStream()).readUTF());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
