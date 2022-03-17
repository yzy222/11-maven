package com.Stringmore;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append('a');
        stringBuffer.append(true);
        stringBuffer.append(3.1415926);
        stringBuffer.append(100L);
        System.out.println(stringBuffer);
    }
}
