package com.example.codingtest.study.greedy;

import java.util.Scanner;

public class Baekjoon5585 {
    static final int TOTAL = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coin = {500, 100, 50, 10, 5, 1};
        int leftCoin = TOTAL - scanner.nextInt();
        int index = 0;
        int sum = 0;

        while (leftCoin != 0) {
            sum += leftCoin / coin[index];
            leftCoin = leftCoin % coin[index++];
        }
        System.out.println(sum);
    }
}
