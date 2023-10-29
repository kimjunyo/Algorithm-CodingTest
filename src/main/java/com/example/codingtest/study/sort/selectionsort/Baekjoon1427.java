package com.example.codingtest.study.sort.selectionsort;

import java.util.Scanner;

public class Baekjoon1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split("");
        int n = split.length;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(split[i]);
        }

        int maxIndex;
        int temp;
        for (int i = 0; i < n; i++) {
            maxIndex = i;
            temp = 0;
            for (int j = i; j < n; j++) {
                if (temp < array[j]) {
                    temp = array[j];
                    maxIndex = j;
                }
            }
            array[maxIndex] = array[i];
            array[i] = temp;

        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
