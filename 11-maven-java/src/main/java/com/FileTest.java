package com;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\study\\text");
        //判断文件是否存在
        System.out.println(f.exists());
        //以文件形式创建
        //if (!f.exists()) f.createNewFile();
        //以目录形式创建
        //if(!f.exists()) f.mkdir();
        //以多重目录形式创建
        File f1=new File("D:\\study\\b\\c\\d");
        if (!f1.exists()) f1.mkdirs();
        //父路径
        System.out.println(f1.getParent());
        //绝对路径
        System.out.println(f1.getParentFile().getAbsolutePath());
        File f2=new File("log");
        System.out.println(f2.getAbsolutePath());
        //文件名
        System.out.println(f2.getName());
        //是否为文件
        System.out.println(f2.isFile());
        //是否为目录
        System.out.println(f2.isDirectory());
        //是否为隐藏文件
        System.out.println(f2.isHidden());
        //获取文件最后修改时间
        Date time =new Date(f2.lastModified());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(time));
        //文件大小（字节）
        System.out.println(f2.length());
        //获取当前目录下所有子路径
        File f5=new File("D:\\study");
        File[] files=f5.listFiles();
        for(File ff:files) System.out.println(ff.getAbsolutePath());
    }
}
