package com.offcn.example;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
//        int a , b ,c;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入三个数: ");
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        c = scanner.nextInt();
//
//        System.out.println("最大值为:"+ getMax(c,getMax(a,b)));
//    }
//
//    public  static int getMax(int x,int y){
//        return x>y ? x : y;
//    }

        int a = 23;
        int b = 89;
        int c = 67;

       int max =  a>b ? a : b;

       max = c>max ? c : max;

        System.out.println(max);
    }
}