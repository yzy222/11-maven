package com.URL.Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    private Socket mysocket;
    private DataInputStream in;
    private DataOutputStream out;
    private boolean flag=false;

    public void connect(String host,int port) throws IOException {
        Thread rthread,sthread;
        mysocket=new Socket(host,port);
        in=new DataInputStream(mysocket.getInputStream());
        out=new DataOutputStream(mysocket.getOutputStream());
        rthread=new Thread(new Reception(this));
        sthread=new Thread(new Send(this));
        while(true){
            System.out.println("等待");
            rthread.start();
            sthread.start();
        }
    }

    public Socket getMysocket() {
        return mysocket;
    }

    public void setMysocket(Socket mysocket) {
        this.mysocket = mysocket;
    }

    public DataInputStream getIn() {
        return in;
    }

    public void setIn(DataInputStream in) {
        this.in = in;
    }

    public DataOutputStream getOut() {
        return out;
    }

    public void setOut(DataOutputStream out) {
        this.out = out;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
