package com.flywhale.suanfa;

import java.util.Scanner;

/**
 * 华为机考
 * 如果要买归类为附件的物品，必须先买该附件所属的主件，且每件物品只能购买一次。
 * 每个主件可以有 0 个、 1 个或 2 个附件。附件不再有从属于自己的附件。
 * 王强查到了每件物品的价格（都是 10 元的整数倍），而他只有 N 元的预算。除此之外，他给每件物品规定了一个重要度，用整数 1 ~ 5 表示。他希望在花费不超过 N 元的前提下，使自己的满意度达到最大。
 * 满意度是指所购买的每件物品的价格与重要度的乘积的总和，假设设第ii件物品的价格为v[i]v[i]，重要度为w[i]w[i]，共选中了kk件物品，编号依次为j_1,j_2,...,j_kj
 * v[j1] ∗ w[j1] +v[j2]∗w[j2]+…+v[jk]∗w[jk]。（其中 * 为乘号）
 * 请你帮助王强计算可获得的最大的满意度。
 */
public class GouWuDan {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int money = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            money /= 10;
            int[][] prices = new int[m+1][3];
            int[][] weights = new int[m+1][3];
            for (int i = 1; i <= m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                a /= 10;//price
                b = b * a;//weight
                if (c == 0) {
                    // 主件
                    prices[i][0] = a;
                    weights[i][0] = b;
                } else if (prices[c][1] == 0) {
                    // 附件1
                    prices[c][1] = a;
                    weights[c][1] = b;
                } else {
                    // 附件2
                    prices[c][2] = a;
                    weights[c][2] = b;
                }
                sc.nextLine();
            }
            int[][] dp = new int[m+1][money+1];
            for (int i = 1; i <= m; i++) {
                for(int j = 1; j <= money; j++) {
                    int a = prices[i][0];
                    int b = weights[i][0];
                    int c = prices[i][1];
                    int d = weights[i][1];
                    int e = prices[i][2];
                    int f = weights[i][2];

                    dp[i][j] = j - a >= 0 ? Math.max(dp[i-1][j], dp[i-1][j-a] + b) : dp[i-1][j];
                    dp[i][j] = j-a-c >= 0 ? Math.max(dp[i][j], dp[i-1][j-a-c] + b + d):dp[i][j];
                    dp[i][j] = j-a-e >= 0 ? Math.max(dp[i][j], dp[i-1][j-a-e] + b + f):dp[i][j];
                    dp[i][j] = j-a-c-e >= 0 ? Math.max(dp[i][j], dp[i-1][j-a-c-e] + b +d + f):dp[i][j];
                }
            }

            System.out.println(dp[m][money] * 10);
        }
    }

}
