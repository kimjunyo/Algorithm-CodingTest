package com.example.codingtest.study.sort.insertionsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] timeArray = new int[N];
        for (int i = 0; i < N; i++) {
            timeArray[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        int temp = 0;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (timeArray[j] < timeArray[j - 1]) {
                    temp = timeArray[j];
                    timeArray[j] = timeArray[j - 1];
                    timeArray[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        int sum = 0;
        int totalSum = 0;
        for (int i = 0; i < N; i++) {
            sum += timeArray[i];
            totalSum += sum;
        }
        System.out.println(totalSum);
    }
}
