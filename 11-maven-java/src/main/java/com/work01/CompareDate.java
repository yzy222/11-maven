package com.work01;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CompareDate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入第一个年，月，日数据");
        System.out.println("输入年份");
        short yearOne=scanner.nextShort();
        System.out.println("输入月份");
        byte monthOne = scanner.nextByte();
        System.out.println("输入日期");
        byte dayOne = scanner.nextByte();
        System.out.println("输入第二个年，月，日数据");
        System.out.println("输入年份");
        short yearTow=scanner.nextShort();
        System.out.println("输入月份");
        byte monthTow = scanner.nextByte();
        System.out.println("输入日期");
        byte dayTow = scanner.nextByte();
        Calendar calendar=Calendar.getInstance();
        calendar.set(yearOne,monthOne,dayOne);
        long timeOne=calendar.getTimeInMillis();
        calendar.set(yearTow,monthTow-1,dayTow);
        long timeTow=calendar.getTimeInMillis();
        Date date1=new Date(timeOne);
        Date date2=new Date(timeTow);
        if (date2.equals(date1)){
            System.out.println("两个日期的年、月、日完全相同");
        } else if (date2.after(date1)){
            System.out.println("第二个日期大于第一个日期");
        }else if (date2.before(date1)){
            System.out.println("第二个日期小于第一个日期");
        }
        long days=Math.abs((timeTow-timeOne)/(1000*60*60*24));
        System.out.println(yearOne+"年"+monthOne+"月"+dayOne+"日和"+yearTow+"年"+monthTow+"月"+dayTow+"日相隔"+days+"天");




    }
}
