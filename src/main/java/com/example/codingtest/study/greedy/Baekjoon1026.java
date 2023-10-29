package com.example.codingtest.study.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Baekjoon1026 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];
        Function<String, Integer> stringToInt = Integer::parseInt;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = stringToInt.apply(stringTokenizer.nextToken());
        }
        Arrays.sort(A);
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = stringToInt.apply(stringTokenizer.nextToken());
        }
        Arrays.sort(B, Comparator.reverseOrder());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i] * B[i];
        }
        System.out.println(sum);
    }
}
