package com.flywhale.suanfa;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 旋转自增矩阵
 * 1，2，3
 * 8，9，4
 * 7，6，5
 *
 * 随机输入一个正整数，完成旋转自增序列的打印
 */
public class Test2 {

    /**
     * 思路解析
     * 首先判断需要打印多少圈
     * 组成一圈起码需要两层。
     * 如果是正方形矩阵，那么需要打印的次数就是 n/2 + n%2 (n%2主要针对奇数情况)
     * 如果是长方向矩阵，那么需要打印的次数就是 （最小边长/2 + 最小边长%2）
     * 本次以正方形矩阵进行解析
     * @param args
     */
    public static void main(String[] args) {

        int n = 6;
        int[][] arrs = new int[n][n];


        //定义边界
        int rowBegin = 0;
        int rowEnd = n;
        int colBegin = 0;
        int colEnd = n;
        //当前的数据
        int num = 0;
        //循环圈数
        for(int i = 0; i < (n/2 + n%2); i++){
            //顶
            for(int row = rowBegin; row < rowEnd; row++){
                int[] arr = arrs[i];
                arr[row] = ++num;
            }
            //右侧
            for(int col = colBegin+1; col < colEnd; col++){
                int[] arr = arrs[col];
                arr[rowEnd-1] = ++num;
            }
            //底
            for(int row = rowEnd-2; row >= rowBegin; row--){
                int[] arr = arrs[rowEnd-1];
                arr[row] =  ++num;
            }
            //左侧
            for(int col = colEnd -2; col > colBegin; col--){
                int[] arr = arrs[col];
                arr[rowBegin] = ++num;
            }
            rowBegin++;
            rowEnd--;
            colBegin++;
            colEnd--;
        }

        for(int i = 0 ; i < arrs.length; i++){
            System.out.println(Arrays.toString(arrs[i]));
        }

    }

}
