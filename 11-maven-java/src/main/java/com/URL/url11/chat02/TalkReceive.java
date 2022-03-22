package com.URL.url11.chat02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReceive implements Runnable{
    private DatagramSocket socket;
    private int port;
    private String msgfrom;

    public TalkReceive(int port,String msgfrom) throws SocketException {
        this.port = port;
        this.msgfrom = msgfrom;
        socket=new DatagramSocket(port);
    }

    @Override
    public void run() {
        try {
            while(true){
                byte[] bytes = new byte[1024];
                DatagramPacket packet=new DatagramPacket(bytes,0,bytes.length);
                socket.receive(packet);
                String data=new String(packet.getData(),0,packet.getLength());
                System.out.println(msgfrom +":"+data);
                if ("byb".equals(data)) break;
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (socket!=null){
                socket.close();
            }
        }
    }
}
