package com.io;

import java.io.*;

public class BufferreaderTest {
    public static void main(String[] args) throws IOException {
        //节点流--包装流
        Reader reader=new FileReader("");
        //BufferedReader(Reader in) 缓冲流
        BufferedReader br =new BufferedReader(reader);
        //String readLine()
        //读一行文字
        br.close();
        FileInputStream fis =new FileInputStream("");
        //转换流
        /*InputStreamReader reader1=new InputStreamReader(fis);
        BufferedReader brd =new BufferedReader(reader1);*/
        BufferedReader brd = new BufferedReader(new InputStreamReader(new FileInputStream("")));
        brd.close();
    }
}
