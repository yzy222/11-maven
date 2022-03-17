package com.Stringmore;

public class StringTest {
    public static void main(String[] args) {
        String a = "中国人666";
        String b = "abc";
        String c = "abd";
        //比较字符串大小
        System.out.println(b.compareTo(c));
        System.out.println(c.compareTo(b));
        //判断字符串是否包含指定元素
        System.out.println("helloworld".contains("ell"));
        //判断字符串是否以该元素结尾
        System.out.println("helloworld".endsWith("d"));
        //判断字符串是否相等
        System.out.println("abc".equals("abc"));
        //不考虑大小写判断字符串是否相等
        System.out.println("abc".equalsIgnoreCase("ABC"));
        //字符串转化为byte数组
        byte[] bytes="abcdefg".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        //获取指定元素第一次出现处下标
        System.out.println("sjdfioehfihfgdjfhef".indexOf("j"));
        String s ="";
        //判断字符串是否为空
        System.out.println(s.isEmpty());
        //获取字符串长度
        System.out.println("abc".length());
        //获取指定元素最后一次出现处下标
        System.out.println("fuieahfuahdvfhdjsafk".lastIndexOf("a"));
        //替换指定元素
        System.out.println("http://".replace("tt","ee"));
        //按照指定符号将字符串划分为字符串数组
        String[] newString="1999-02-31".split("-");
        for (int i = 0; i < newString.length; i++) {
            System.out.println(newString[i]);
        }
        //判断字符串是否以指定元素开头
        System.out.println("djfheau".startsWith("d"));
        //从指定位置开始提取字符串
        System.out.println("fjhaejhfja".substring(3));
        //从指定区间提取字符串（左开右闭）
        System.out.println("fjhaejhfja".substring(3,5));
        //字符串转化字符数组
        char[] newChar="jeafjeejf".toCharArray();
        for (int i = 0; i < newChar.length; i++) {
            System.out.println(newChar[i]);
        }
        //转换为小写
        System.out.println("JGURHFJSHAFJK".toLowerCase());
        //转换为大写
        System.out.println("ejfijsdfha".toUpperCase());
        //清除首尾空格
        System.out.println("    feaejfhs   fjdi   ".trim());
        //将其他包装类转换为字符串
        String d =String.valueOf(true);
        String e =String.valueOf(230);
        System.out.println(d+'-'+e);
        //valueOf()引用调toString

    }
}
