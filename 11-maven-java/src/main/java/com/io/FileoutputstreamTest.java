package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileoutputstreamTest {
    public static void main(String[] args) {
//        void write(byte[] b) 写入
//        void write(byte[] b, int off, int len) 写入
        //FileOutputStream(File file, boolean append) 追加
        FileOutputStream fos=null;
        try {
            fos = new FileOutputStream("myfile");
            byte[] bytes={97,98,99,100};
            fos.write(bytes);
            String s="中国人";
            byte[] bytes1=s.getBytes();
            fos.write(bytes1);
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
