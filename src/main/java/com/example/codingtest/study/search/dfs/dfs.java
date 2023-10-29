package com.example.codingtest.study.search.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.function.Function;

public class dfs {
    static ArrayList<Integer>[] dotList;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        Function<String, Integer> stringToInt = Integer::parseInt;
        int N = stringToInt.apply(stringTokenizer.nextToken());
        int M = stringToInt.apply(stringTokenizer.nextToken());

    }

    public static void dfs(int start, int N) {

    }
}
