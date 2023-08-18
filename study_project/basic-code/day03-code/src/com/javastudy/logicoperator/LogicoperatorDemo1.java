package com.javastudy.logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //1. & 且
        System.out.println(true & true);// true
        System.out.println(true & false);// false
        System.out.println(false & true);// false
        System.out.println(false & false);// false
        //2. | 或
        System.out.println(true | true);// true
        System.out.println(true | false);// true
        System.out.println(false | true);// true
        System.out.println(false | false);// false
        //3. ^ 异或
        System.out.println(true ^ true);// false
        System.out.println(true ^ false);// true
        System.out.println(false ^ true);// true
        System.out.println(false ^ false);// false
        //4. ! 非
        System.out.println(!false);// true
        System.out.println(!true);// false
    }
}
