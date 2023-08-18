package com.javastudy.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2);// 5
        // -
        System.out.println(5 - 1);// 4
        // *
        System.out.println(7 * 9);// 63

        // 小数参与运算 可能导致不精确
        System.out.println(1.1 + 1.1);// 2.2
        System.out.println(1.1 + 1.01);// 2.1100000000000003
        System.out.println(1.1 - 1.01);// 0.09000000000000008
        System.out.println(1.1 * 1.01);// 1.1110000000000002
    }
}
