package com.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class NumberTest {
    public static void main(String[] args) {
        //数字格式化
        /*
        * #任意数字
        * ,千分位
        * .小数点
        * 0不够时补零
        * */
        DecimalFormat df=new DecimalFormat("##,####.0000");
        String s =df.format(1234.12);
        System.out.println(s);
        //BigDecimal大数据极高精度（java对象）引用数据类型
        BigDecimal b=new BigDecimal(100);
        BigDecimal b1=new BigDecimal(200);
        BigDecimal b2=b.add(b1);
        b.divide(b1);
        b.multiply(b1);

        System.out.println(b2);

    }
}
