package com.work01;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random random=new Random();
        int r = random.nextInt(101);
        Scanner reader=new Scanner(System.in);
        System.out.println("猜");
        int g=-1;
        while (g!=r){
            g = reader.nextInt();
            if (g==r){
                System.out.println("猜对了");
            }else if (g<r){
                System.out.println("猜小了");
            }else if (g>r){
                System.out.println("猜大了");
            }
        }
    }
}
