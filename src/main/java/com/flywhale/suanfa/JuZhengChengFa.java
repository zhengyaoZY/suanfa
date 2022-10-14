package com.flywhale.suanfa;

import java.util.Scanner;

/**
 * 矩阵乘法
 */
public class JuZhengChengFa {

    // 矩阵乘法
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()) {
            // 输入三个特征值
            int lamda1 = sc.nextInt();// 第一个矩阵的行
            int lamda2 = sc.nextInt();// 第一个矩阵的列 & 第二个矩阵的行
            int lamda3 = sc.nextInt();// 第二个矩阵的列
            // 声明两个数组
            int[][] matrix1 = new int[lamda1][lamda2];
            int[][] matrix2 = new int[lamda2][lamda3];
            int[][] res = new int[lamda1][lamda3];// 保存运算结果的矩阵
            for (int i = 0; i < lamda1; i++) {
                for (int j = 0; j < lamda2; j++)
                    matrix1[i][j] = sc.nextInt();
            }
            for (int i = 0; i < lamda2; i++) {
                for (int j = 0; j < lamda3; j++)
                    matrix2[i][j] = sc.nextInt();
            }
            // res[i][j] =
            int sum = 0;
            for (int i = 0; i < lamda1; i++) { // 2

                for (int j = 0; j < lamda3; j++) { // 第二个矩阵有多少列,2
                    for (int k = 0; k < lamda2; k++) { // 3
                        sum += matrix1[i][k] * matrix2[k][j]; //
//                        System.out.print(matrix1[j][k] + " "+ matrix2[k][j]);
                    }
                    res[i][j] = sum;
                    sum = 0;
                }
            }
            for (int i = 0; i < lamda1; i++)
            {
                for(int j = 0;j < lamda3;j++)
                    System.out.print(res[i][j] + " ");
                System.out.println();
            }

        }
    }

}
