package com.reflect;

public class ArgsTest {
    public static void main(String[] args) {
        m(1);
    }
    //可变长度参数0~n 出现在最后且只能出现一个
    //new String[] {"中","国","人"};
    public static void m(int... args){
        //数组
        int i=args.length;
        System.out.println("!!!");
    }
}
