package com.example.codingtest.study.search.bfs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon1260 {

    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static Queue<Integer> queue;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int V = scanner.nextInt();
        int start = scanner.nextInt();

        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];
        for (int i = 0; i < V; i++) {
            int startDot = scanner.nextInt();
            int endDot = scanner.nextInt();
            graph[startDot].add(endDot);
            graph[endDot].add(startDot);
        }
        for (int i = 1; i < V + 1; i++) {
            graph[i].sort(Comparator.naturalOrder());
        }

        dfs(start);
        System.out.println(queue.toString());
    }

    static int dfs(int start) {
        visited[start] = true;
        for (int j=0; j< graph[start].size(); j++) {
            Integer index = graph[start].get(j);
            if(!visited[index]){
                queue.add(index);
                visited[index] = true;
            }
        }
        return dfs(queue.poll());
    }
}
