package com.exception.homework;

public class Test {
    public static void main(String[] args) {
        User jack =new User();
        try {
            jack.register("jackittly","123456789");
        } catch (MyException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
