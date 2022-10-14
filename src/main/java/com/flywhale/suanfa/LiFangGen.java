package com.flywhale.suanfa;

import java.util.Scanner;

/**
 * 求解立方根
 * 计算一个浮点数的立方根，不使用库函数。
 * 保留一位小数。
 */
public class LiFangGen {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double input = sc.nextDouble();
            double  n = getCubeRoot(input);
            System.out.printf("%.1f",n);
        }
    }
    private static double getCubeRoot(double input) {
        if ( input == 0) {
            return 0;
        }
        double x0 = input;
        double x1 = (2*x0 + input/x0/x0)/3;
        while (Math.abs(x1 - x0) > 0.001) {
            x0 = x1;
            x1 = (2*x0 + input/x0/x0)/3;
        }
        return x1;
    }

}
