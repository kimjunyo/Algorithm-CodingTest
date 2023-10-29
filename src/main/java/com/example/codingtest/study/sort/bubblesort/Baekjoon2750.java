package com.example.codingtest.study.sort.bubblesort;

import java.util.Scanner;

public class Baekjoon2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int temp = 0;
        boolean quick;
        for (int i = 0; i < N; i++) {
            quick = true;
            for (int j = 0; j < N - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    quick = false;
                }
            }
            if (quick) {
                break;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(array[i]);
        }
    }
}
