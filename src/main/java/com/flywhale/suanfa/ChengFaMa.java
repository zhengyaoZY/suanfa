package com.flywhale.suanfa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 称砝码
 * 现有n种砝码，重量互不相等，分别为 m1,m2,m3…mn ；
 * 每种砝码对应的数量为 x1,x2,x3...xn 。现在要用这些砝码去称物体的重量(放在同一侧)，问能称出多少种不同的重量。
 */
public class ChengFaMa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            HashSet<Integer> set = new HashSet<>();//存放所有可能的结果，不用担心重复问题
            set.add(0);//初始化为0
            int n = in.nextInt();//个数
            int[] w = new int[n];
            int[] nums = new int[n];
            for(int i=0;i<n;i++){
                w[i] = in.nextInt();//砝码的重量
            }
            for(int i=0;i<n;i++){
                nums[i] = in.nextInt();//砝码个数
            }
            for(int i=0;i<n;i++){//遍历砝码
                ArrayList<Integer> list = new ArrayList<>(set);//取当前所有的结果
                for(int j=1;j<=nums[i];j++){//遍历个数
                    for(int k=0;k<list.size();k++){
                        set.add(list.get(k) + w[i] * j);
                    }
                }
            }
            System.out.println(set.size());
        }
    }

}
