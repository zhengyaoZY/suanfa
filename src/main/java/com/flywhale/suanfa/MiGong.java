package com.flywhale.suanfa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/**
 * 迷宫问题
 */
public class MiGong {

    public static int[][] directions = {
            {0, 1},
            {1, 0},
            {-1, 0},
            {0, -1}
    };
    private static Stack<int[]> path;
    private static ArrayList<int[]> minPath;
    private static int[][] matrix;
    private static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = null;
        while ((str1 = br.readLine()) != null) {
            String[] arr = str1.split(" ");
            int rows = Integer.parseInt(arr[0]);
            int cols = Integer.parseInt(arr[1]);
            path = new Stack<>();
            minPath = null;
            matrix = new int[rows][cols];
            visited = new boolean[rows][cols];
            for (int i = 0; i < rows; i++) {
                String[] str2 = br.readLine().split(" ");
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = Integer.parseInt(str2[j]);
                }
            }
            dfs(0, 0);

            StringBuilder sb = new StringBuilder();
            for (int[] res : minPath) {
                sb.append('(').append(res[0]).append(',').append(res[1]).append(")\n");
            }
            System.out.print(sb.toString());
        }
    }

    private static void dfs(int i, int j) {
        if (i > matrix.length - 1 || i < 0 || j > matrix[0].length - 1 || j < 0 ||
                visited[i][j] || matrix[i][j] == 1 ||
                (minPath != null && path.size() >= minPath.size())) {
            return;
        }
        if (i == matrix.length - 1 && j == matrix[0].length - 1) {
            path.add(new int[]{i, j});
            minPath = new ArrayList<>(path);
            path.pop();
            return;
        }
        path.add(new int[]{i, j});
        visited[i][j] = true;
        for (int[] direction : directions) {
            dfs(i + direction[0], j + direction[1]);
        }
        visited[i][j] = false;
        path.pop();
    }

}
