package com.javastudy.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        // 除法
        // 只有整数参与的除法正能输出整数
        // 有小数参与的除法，有时不精确
        System.out.println(10 / 2);// 5
        System.out.println(10 / 3);// 3
        System.out.println(10.0 / 3);// 3.3333333333333335
        // 取余
        System.out.println(10 % 2);// 0
        System.out.println(10 % 3);// 1
        // 应用场景
        // 1、判断A是否可以被B整除
        // A % b    10 % 3
        // 2、判断A是否是偶数
        // A % 2 结果为0为偶数，为1为奇数
        // 3、发牌游戏
        // 每个牌一个序号，序号 % 3
        // 结果为1，发个1号，结果为2，发给2号，结果为0，发给3号
    }
}
