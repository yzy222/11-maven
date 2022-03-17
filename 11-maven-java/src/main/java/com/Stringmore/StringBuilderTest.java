package com.Stringmore;

public class StringBuilderTest {
    public static void main(String[] args) {
        //没有synchronized修饰，多线程模式下不安全
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sdjhs");
        stringBuilder.append(299);
        stringBuilder.append(3.14);
        stringBuilder.append(true);
        stringBuilder.append('a');
        System.out.println(stringBuilder);
    }
}
