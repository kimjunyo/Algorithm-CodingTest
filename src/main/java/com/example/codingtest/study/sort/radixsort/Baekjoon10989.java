package com.example.codingtest.study.sort.radixsort;

public class Baekjoon10989 {
    public static void main(String[] args) {

    }

    static int[] radixSort(int[] inputArray) {
        int N = inputArray.length;
        int[][] array = new int[10][N];
        int[] count = new int[10];
        for (int i = 1; i <= 2; i++) { //자릿수
            for (int j = 0; j < N; j++) { //읽기
                int index = inputArray[i];
                int seat = (int) ((index % Math.pow(10, i) - index % Math.pow(10, i-1))/Math.pow(10, i));
                array[seat][count[seat]++] = index;
            }

        }
        return null;
    }
}
