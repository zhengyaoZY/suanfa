package com.flywhale.suanfa;

import java.util.Scanner;

/**
 * 挑7
 * 输出 1到n之间 的与 7 有关数字的个数。
 * 一个数与7有关是指这个数是 7 的倍数，或者是包含 7 的数字（如 17 ，27 ，37 ... 70 ，71 ，72 ，73...）
 */
public class Find7 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int sum=0;
            for(int i = 1;i<=n;i++){
                if(i%7==0){
                    sum++;
                }else{
                    String s = String.valueOf(i);
                    if(s.contains("7")){
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        }
    }

}
