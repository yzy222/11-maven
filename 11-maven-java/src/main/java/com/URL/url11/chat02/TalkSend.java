package com.URL.url11.chat02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class TalkSend implements Runnable{
    private DatagramSocket socket;
    private BufferedReader reader;
    private InetAddress id;
    private int localPort,targetPort;

    public TalkSend(InetAddress id, int localPort, int targetPort) throws SocketException {
        this.id = id;
        this.localPort = localPort;
        this.targetPort = targetPort;
        socket = new DatagramSocket(localPort);
        reader=new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() {
        try {
            while(true){
                String data = reader.readLine();
                byte[] bytes = data.getBytes();
                DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length,id, targetPort);
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
