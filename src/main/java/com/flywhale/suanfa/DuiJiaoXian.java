package com.flywhale.suanfa;

import java.util.Scanner;

public class DuiJiaoXian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //System.out.println("输入的n为："+ n);
        scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < n; i++){
            String scin = scanner.nextLine();
            sum += Integer.valueOf(scin.split(" ")[i]);
        }
        System.out.println(sum);
    }

}
