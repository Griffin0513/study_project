package com.javastudy.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();

        // 获取十位，百位，个位
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number /100 % 10;
        // 分别输出
        System.out.println("个位是：" + ge);
        System.out.println("十位是" + shi);
        System.out.println("百位是" + bai);
    }
}
