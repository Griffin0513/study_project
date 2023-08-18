package com.javastudy.test;

import java.util.Random;

public class rand {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println(number);
    }
}
