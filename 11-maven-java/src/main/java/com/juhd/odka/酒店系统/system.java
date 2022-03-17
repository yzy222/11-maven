package com.juhd.odka.酒店系统;

import java.util.Scanner;

public class system {
    public static void main(String[] args) {
        Hotel hotel=new Hotel();
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        switch (a){
            case 1 : hotel.print();break;
            case 2 : int a1=s.nextInt();hotel.order(a1);break;
            case 3 : int a2=s.nextInt();hotel.exit(a2);break;
        }
    }
}
