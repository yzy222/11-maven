package com.integer;

public class IntegerTest {
    public static void main(String[] args) {
        Integer x =100;
        int y =x;
        int r=Integer.parseInt("123");
        int j=Integer.valueOf(x);
        double v = Double.parseDouble("3.1415926");
        //int--->String:String.valueOf(int)
        String s1 =String.valueOf(100);
        //String--->int:Integer.parsInt(String)
        int i1 =Integer.parseInt("123");
        //int--->Integer:Integer.valueOf(int)
        Integer I1=Integer.valueOf(100);
        //Integer--->int:(Integer).intValue()
        int i2=I1.intValue();
        //Integer--->String:String.valueOf(Integer)
        String s2=String.valueOf(I1);
        //String--->Integer:Integer.valueOf(String)
        Integer I2=Integer.valueOf(s2);

    }
}
