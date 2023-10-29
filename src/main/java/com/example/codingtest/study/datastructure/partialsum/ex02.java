package com.example.codingtest.study.datastructure.partialsum;

import java.util.Scanner;

public class ex02 {
    //백준 11660
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] array = new int[N * N + 1];
        int k = 0;
        for (int i = 1; i < N * N + 1; i++) {
            k += scanner.nextInt();
            array[i] = k;
        }
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        for (int i = 0; i < M; i++) {
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            System.out.println(array[(x2 - 1) * N + y2] - array[(x1 - 1) * N + y1 - 1]);
        }
    }
}
