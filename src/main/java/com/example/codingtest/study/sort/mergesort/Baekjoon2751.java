package com.example.codingtest.study.sort.mergesort;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2751 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] arrSort = mergeSort(arr);
        for (int i = 0; i < N; i++) {
            System.out.println(arrSort[i]);
        }
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length < 2) return arr;

        int mid = arr.length / 2;
        int[] leftArr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        int[] mergedArr = new int[arr.length];
        int merge = 0, left = 0, right = 0;
        while (left < leftArr.length && right < rightArr.length) {
            if (leftArr[left] < rightArr[right])
                mergedArr[merge++] = leftArr[left++];
            else
                mergedArr[merge++] = rightArr[right++];
        }
        while (left < leftArr.length) {
            mergedArr[merge++] = leftArr[left++];
        }
        while (right < rightArr.length) {
            mergedArr[merge++] = rightArr[right++];
        }
        return mergedArr;
    }

}
