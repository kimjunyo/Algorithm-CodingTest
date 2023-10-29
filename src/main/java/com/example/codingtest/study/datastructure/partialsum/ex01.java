package com.example.codingtest.study.datastructure.partialsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex01 {
    //백준 11659
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[] array = new int[N + 1];
        int k = 0;
        for (int i = 1; i < N + 1; i++) {
            k += Integer.parseInt(stringTokenizer.nextToken());
            array[i] = k;
        }
        int j = 0;
        int o = 0;
        for (int i = 0; i < M; i++) {
            j = Integer.parseInt(stringTokenizer.nextToken());
            o = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(array[o] - array[j - 1]);
        }
    }
}
