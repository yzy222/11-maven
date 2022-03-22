package com.URL.Socket;

import java.io.DataInputStream;
import java.io.IOException;

public class Reception implements Runnable{
    Client client;

    public Reception() {
    }

    public Reception(Client client) {
        this.client = client;
    }

    @Override
    public  void  run() {
        synchronized(client){
            while(true){
                if(client.isFlag()) {
                    try {
                        client.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                DataInputStream in=client.getIn();
                try {
                    String mess=in.readUTF();
                    System.out.println(mess);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                client.setFlag(false);
                client.notifyAll();
            }
        }
    }
}
