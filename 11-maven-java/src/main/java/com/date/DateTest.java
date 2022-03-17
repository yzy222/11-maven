package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args)throws Exception{
        //date--->String
        Date nowdate=new Date();
        //SimpleDateFormat日期格式化
        //yyyy年
        //MM月
        //dd日
        //hh时
        //mm分
        //ss秒
        //SSS毫秒
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
        System.out.println(sdf.format(nowdate));
        //String--->date
        String time="1999-12-23 09:12:34 345";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
        Date datetime=sdf2.parse(time);
        System.out.println(datetime);
        //1970-01-01到当前系统时间的总毫秒数System.currentTimeMillis()
        long l = System.currentTimeMillis();
        System.out.println(l);
        long begin=System.currentTimeMillis();
        print();
        long end =System.currentTimeMillis();
        System.out.println("耗费时长"+(end-begin)+"毫秒");
        //System.gc();建议启动垃圾回收器
        //System.out.println();
        //System.currentTimeMillis();
        Date time1=new Date(System.currentTimeMillis()-1000*60*60*24*365L);
        System.out.println(time1);
        Date time2=new Date(1641813635696L);
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
    }
    public static void print(){
        for (int i = 0; i < 1000000000; i++) {
            //System.out.println(i);
        }
    }
}
