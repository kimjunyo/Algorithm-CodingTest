package com.example.codingtest.ex01;

public class ex01 {
    public static void main(String[] args) {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        int solution = solution(lines);
        System.out.println(solution);
    }

    public static int solution(int[][] lines) {
        int answer = 0;
        int orginal = 0;
        int[][] overlap = new int[3][3];
        for (int i = 0; i < 3; i++) {
            orginal += lines[i][1] - lines[i][0];
        }

        return answer;
    }

}
