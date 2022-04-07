package com.URL.url11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Url02 {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://aqqmusic.tc.qq.com/amobile.music.tc.qq.com/C400003UkWuI0E8U0l.m4a?guid=8277370680&vkey=874F85530CE40147DB70F177D73E13CA096182C55B09C3A67A14EC39801CFE5115AD0644DA2769F83914811526F4C38B5BD52B40BB9582CA&uin=&fromtag=38");
            HttpURLConnection h=(HttpURLConnection) url.openConnection();
            InputStream inputStream = h.getInputStream();
            FileOutputStream os=new FileOutputStream("C400003UkWuI0E8U0l.m4a");
            byte[] bytes = new byte[1024];
            int len;
            while((len=inputStream.read(bytes))!=-1){
                os.write(bytes,0,len);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
