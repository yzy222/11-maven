package com.io;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws Exception{
        System.out.println("hhhhh");
        PrintStream ps= System.out;
        ps.println("3233");
        ps.println("fs");
        ps.println('f');
        ps.println(33);
        ps.println(22222);
        ps.println(3434);
        ps.println(324);
        //标准输出流不需要手动关闭
        PrintStream printStream=new PrintStream(new FileOutputStream("log",false));
        //标准输出流不再指向控制台
        System.setOut(printStream);
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
        System.out.println("dddd");
    }
}
