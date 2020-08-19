package com.fh.util;

import java.math.BigDecimal;

public class BigDecimalUtil {
   //乘法
    public static BigDecimal mul(String s1, String s2) {
        BigDecimal b1 = new BigDecimal(s1);
        BigDecimal b2 = new BigDecimal(s2);
        return b1.multiply(b2).setScale(2);
    }
   //加法
    public static BigDecimal add(String s1, String s2) {
        BigDecimal b1 = new BigDecimal(s1);
        BigDecimal b2 = new BigDecimal(s2);
        return b1.add(b2).setScale(2);
    }
    //加法
    public static BigDecimal add(BigDecimal s1, BigDecimal s2) {

        return s1.add(s2).setScale(2);
    }

    public static void main(String[] args) {
        BigDecimal mul = mul("2.30", "3.00");
        System.out.println(mul.toString());

//        float a = 2.30f;
//        float b = 3.00f;
//
//        System.out.println(a*b);
    }
}
