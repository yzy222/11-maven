package com.URL.Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Send implements Runnable{
    Client client;
    Scanner reader;

    public Send() {
    }

    public Send(Client client) {
        this.client = client;
    }

    @Override
    public void run() {
        synchronized(client){
            while(true){
                if(!client.isFlag()){
                    try {
                        client.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                DataOutputStream out=client.getOut();
                reader=new Scanner(System.in);
                String mess=reader.next();
                try {
                    out.writeUTF(mess);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                client.setFlag(true);
                client.notifyAll();
            }
        }
    }
}
