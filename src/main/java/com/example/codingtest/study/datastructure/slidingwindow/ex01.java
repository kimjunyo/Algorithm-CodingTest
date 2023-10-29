package com.example.codingtest.study.datastructure.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int S = Integer.parseInt(stringTokenizer.nextToken());
        int P = Integer.parseInt(stringTokenizer.nextToken());
        char[] DNA = bufferedReader.readLine().toCharArray();

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] checkArr = new int[4];

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int left = 0;
        int right = P - 1;

        for (int i = left; i <= right; i++) {

        }
    }

    public static void add(char c) {
        switch (c){
            case 'A':
            case 'C':
            case 'G':
            case 'T':
        }
    }
}
