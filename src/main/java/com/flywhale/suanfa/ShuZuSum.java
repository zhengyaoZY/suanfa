package com.flywhale.suanfa;

import java.util.Scanner;

public class ShuZuSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("输入读取的数据长度n：");
        int num = scanner.nextInt();
        if(num == 0){
            System.out.println(0);
            return;
        }
        scanner.nextLine();
        //System.out.print("请输入需要的数组, 数组内容以空格隔开：");
        String intStrs = scanner.nextLine();
        String[] strs = intStrs.split(" ");
        int sum = 0;
        for(int i = 0; i < num ; i++){
            sum += Integer.valueOf(strs[i]);
        }
        System.out.println(sum);
    }

}
