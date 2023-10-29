package com.example.codingtest.study.datastructure.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class minimumValueFinding {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        StringBuffer bf = new StringBuffer();

        //초기
        int min = A[0];
        bf.append(min + " ");
        for (int i = 1; i < L; i++) {
            if (min > A[i]) {
                min = A[i];
            }
            bf.append(min + " ");
        }

        for (int i = L; i < N; i++) {
        }
    }
}
