package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputstreamTest {
    //int available() 返回流当中没有读到的字节数
    //long skip(long n)  跳过几个字节不读
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        byte[] bytes=new byte[4];
        try {
            fileInputStream = new FileInputStream("D:\\study\\JavaSE每日复习与笔记\\222.txt");
            while(true){
                int i=fileInputStream.read(bytes);
                if(i==-1) break;
                System.out.println(new String(bytes,0,i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
